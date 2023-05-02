import React, { useState, useEffect, useCallback } from 'react';
import axiosInstance from './axiosInstance';
import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
  Legend,
} from 'recharts';
import './V1.css';

function V1({ isLoggedIn, handleLogin, ...rest }) {
  const [chartData, setChartData] = useState([]);
  const [globalAnnualData, setGlobalAnnualData] = useState([]);
  const [globalMonthlyData, setGlobalMonthlyData] = useState([]);
  const [nhAnnualData, setNhAnnualData] = useState([]);
  const [nhMonthlyData, setNhMonthlyData] = useState([]);
  const [shAnnualData, setShAnnualData] = useState([]);
  const [shMonthlyData, setShMonthlyData] = useState([]);
  const [selectedDataType, setSelectedDataType] = useState('Annual');
  const [nh2000Data, setNh2000Data] = useState([]);


  const fetchData = useCallback(async () => {
    try {
      const apiEndpoints = [
        '/api/global-annual',
        '/api/global-monthly',
        '/api/northern-hemisphere-annual',
        '/api/northern-hemisphere-monthly',
        '/api/southern-hemisphere-annual',
        '/api/southern-hemisphere-monthly',
        '/api/northern-hemisphere-2000',
      ];

      for (const endpoint of apiEndpoints) {
        let response;

        response = await axiosInstance.get(endpoint);

        console.log(`Data from ${endpoint}:`, response.data);

        // Set the corresponding state based on the endpoint
        switch (endpoint) {
          case '/api/global-annual':
            setGlobalAnnualData(response.data);
            break;
          case '/api/global-monthly':
            setGlobalMonthlyData(response.data);
            break;
          case '/api/northern-hemisphere-annual':
            setNhAnnualData(response.data);
            break;
          case '/api/northern-hemisphere-monthly':
            setNhMonthlyData(response.data);
            break;
          case '/api/southern-hemisphere-annual':
            setShAnnualData(response.data);
            break;
          case '/api/southern-hemisphere-monthly':
            setShMonthlyData(response.data);
            break;
          case '/api/northern-hemisphere-2000':
            setNh2000Data(response.data);
            break;
            default:
            break;
        }
      }
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }, []);

  useEffect(() => {
    fetchData();
  }, [fetchData]);

  useEffect(() => {
    const updateChartData = () => {
      let newData = [];
    
      if (selectedDataType === 'Annual') {
        newData = globalAnnualData.map((d, i) => ({
          time: d.time,
          Global: d.anomaly,
          'Northern Hemisphere': nhAnnualData[i]?.anomaly,
          'Southern Hemisphere': shAnnualData[i]?.anomaly,
        }));
      } else if (selectedDataType === 'Monthly') {
        newData = globalMonthlyData.map((d, i) => ({
          time: d.time,
          Global: d.anomaly,
          'Northern Hemisphere': nhMonthlyData[i]?.anomaly,
          'Southern Hemisphere': shMonthlyData[i]?.anomaly,
        }));
      } else if (selectedDataType === '2000-Year') {
        newData = nh2000Data
          .filter((item) => {
            return (
              item.year !== null &&
              item.T !== null &&
              item.LF !== null &&
              item.LFMinus !== null &&
              item.LFPlus !== null &&
              item.AMinus !== null &&
              item.APlus !== null &&
              item.ABMinus !== null &&
              item.ABPlus !== null
            );
          })
          .map((item) => ({
            time: item.year || '',
            T: item.t || null,
            LF: item.lf || null,
            LFMinus: item.lfminus || null,
            LFPlus: item.lfplus || null,
            AMinus: item.aminus || null,
            APlus: item.aplus || null,
            ABMinus: item.abminus || null,
            ABPlus: item.abplus || null,
            type: 'Northern Hemisphere 2000',
          }));
      
    
      setChartData(newData);
      console.log('Updated chart data:', newData);
    };
    
  
      setChartData(newData);
      console.log('Updated chart data:', newData);
    };
  
    updateChartData();
  
    return () => {
      setChartData([]); // Reset the chart data when the component unmounts
    };
  }, [
    selectedDataType,
    globalAnnualData,
    globalMonthlyData,
    nhAnnualData,
    nhMonthlyData,
    shAnnualData,
    shMonthlyData,
    nh2000Data,
  ]);
  

  return (
<div>
  <h2>V1: Temperature Anomalies</h2>
  {isLoggedIn && (
    <>
      <select
        id="data-type-dropdown"
        value={selectedDataType}
        onChange={(e) => setSelectedDataType(e.target.value)}
      >
        <option value="Annual">Annual</option>
        <option value="Monthly">Monthly</option>
        <option value="2000-Year">2000-Year</option>
      </select>
      <LineChart
        syncId="temperatureAnomalies"
        width={900}
        height={500}
        data={chartData}
        margin={{
          top: 5,
          right: 30,
          left: 20,
          bottom: 5,
        }}
      >
        <CartesianGrid strokeDasharray="3 3" />
        <XAxis dataKey="time" />
        <YAxis  />
        <Tooltip />
        <Legend />
        {selectedDataType !== '2000-Year' && (
            <>  
        <Line
          type="monotone"
          dataKey="Global"
          name="Global"
          stroke="#8884d8"
          activeDot={{ r: 8 }}
        />
        <Line
          type="monotone"
          dataKey="Northern Hemisphere"
          name="Northern Hemisphere"
          stroke="#82ca9d"
        />
        <Line
          type="monotone"
          dataKey="Southern Hemisphere"
          name="Southern Hemisphere"
          stroke="#ffc658"
        />
          </>
      )}
          {selectedDataType === '2000-Year' && (
		               <>
              <Line type="monotone" dataKey="T" stroke="#ff0000" />
              <Line type="monotone" dataKey="LF" stroke="#8884d8" />
              <Line type="monotone" dataKey="LFMinus" stroke="#82ca9d" />
              <Line type="monotone" dataKey="LFPlus" stroke="#ff7300" />
              <Line type="monotone" dataKey="AMinus" stroke="#2c3e50" />
              <Line type="monotone" dataKey="APlus" stroke="#8e44ad" />
              <Line type="monotone" dataKey="ABMinus" stroke="#f1c40f" />
              <Line type="monotone" dataKey="ABPlus" stroke="#e74c3c" />
            </>
            )}
      </LineChart>
      <p>
        Data source:{" "}
        <a href="https://crudata.uea.ac.uk/cru/data/temperature/">
          HadCRUT5 analysis time series
        </a>
      </p>
    </>
  )}
</div>
);
};

export default V1;