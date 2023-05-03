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
import './V2.css';

function V2({ isLoggedIn, handleLogin, ...rest }) {
  const [selectedDataType, setSelectedDataType] = useState('Annual');
  const [chartData, setChartData] = useState([]);
  const [maunaLoaCO2AnnualData, setMaunaLoaCO2AnnualData] = useState([]);
  const [maunaLoaCO2MonthlyData, setMaunaLoaCO2MonthlyData] = useState([]);
  const [iceCore1Data, setIceCore1Data] = useState([]);
  const [iceCore2Data, setIceCore2Data] = useState([]);
  const [iceCore3Data, setIceCore3Data] = useState([]);

  


  const fetchData = useCallback(async () => {
    try {
      const apiEndpoints = [
        '/api/mauna-loa-co2-annual',
        '/api/mauna-loa-co2-monthly',
        '/api/ice-core-1',
        '/api/ice-core-2',
        '/api/ice-core-3',
      ];

      for (const endpoint of apiEndpoints) {
        let response;

        response = await axiosInstance.get(endpoint);

        console.log(`Data from ${endpoint}:`, response.data);

        // Set the corresponding state based on the endpoint
        switch (endpoint) {
          case '/mauna-loa-co2-annual':
            setMaunaLoaCO2AnnualData(response.data);
            break;
          case '/api/mauna-loa-co2-monthly':
            setMaunaLoaCO2MonthlyData(response.data);
            break;
          case '/api/ice-core-1':
            setIceCore1Data(response.data);
            break;
          case '/api/ice-core-2':
            setIceCore2Data(response.data);
            break;
          case '/api/ice-core-3':
            setIceCore3Data(response.data);
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
        newData = maunaLoaCO2AnnualData.map((d, i) => ({
          year: d.year,
          mean: d.mean,
        
        }));
      } else if (selectedDataType === 'Monthly') {
        newData = maunaLoaCO2MonthlyData.map((d, i) => ({
          year: d.year,
          mean: d.mean,

        }));
      } else if (selectedDataType === 'IceCore') {
        newData = iceCore1Data && iceCore2Data && iceCore3Data
          .filter((item) => {
            return (
              item.year !== null &&
              item.Sample !== null &&
              item.Analysis !== null &&
              item.MeanIceDepth !== null &&
              item.IceAge !== null &&
              item.MeanAirAge !== null &&
              item.Co2MixingRatio !== null 

            );
          })
          .map((item) => ({
            year: item.year || '',
            Sample: item.sample || null,
            Analysis: item.analysis || null,
            MeanIceDepth: item.meanicedepth || null,
            IceAge: item.iceage || null,
            MeanAirAge: item.meanaceage || null,
            CO2MixingRatio: item.co2mixingratio || null,
            type: 'Ice Core',
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
    maunaLoaCO2AnnualData,
    maunaLoaCO2MonthlyData,
    iceCore1Data,
    iceCore2Data,
    iceCore3Data,
  ]);
  

  return (
<div>
  <h2>V2:  Mauna Loa measurements</h2>
  <p>
    
  </p>
  {isLoggedIn && (
    <>
      <select
        id="data-type-dropdown"
        value={selectedDataType}
        onChange={(e) => setSelectedDataType(e.target.value)}
      >
        <option value="Annual">Annual</option>
        <option value="Monthly">Monthly</option>
        <option value="IceCore">Ice Core</option>
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
        <XAxis dataKey="year" />
        <YAxis  dataKey="mean"/>
        <Tooltip />
        <Legend />
        {selectedDataType === 'Annual' && (
            <>  
        <Line
          type="monotone"
          dataKey="Annual"
          name="Annual"
          stroke="#8884d8"
          activeDot={{ r: 8 }}
        />
          </>
      )}
      {selectedDataType === 'Monthly' && (
            <>  
        <Line
          type="monotone"
          dataKey="Monthly"
          name="Monthly"
          stroke="#8884d8"
          activeDot={{ r: 8 }}
        />
        </>
      )}

          {selectedDataType === 'IceCore' && (
		               <>
              <Line type="monotone" dataKey="Sample" stroke="#ff0000" />
              <Line type="monotone" dataKey="Analysis" stroke="#8884d8" />
              <Line type="monotone" dataKey="MeanIceDepth" stroke="#82ca9d" />
              <Line type="monotone" dataKey="IceAge" stroke="#ff7300" />
              <Line type="monotone" dataKey="MeanAirAge" stroke="#2c3e50" />
              <Line type="monotone" dataKey="CO2MixingRatio" stroke="#8e44ad" />
            </>
            )}
      </LineChart>
      <p>
        Data sources:{" "}
        
        <a href="https://gml.noaa.gov/ccgg/trends/data.html">
          Mauna Loa CO2
        </a>
        <br></br>
        <a href='https://cdiac.ess-dive.lbl.gov/ftp/trends/co2/lawdome.combined.dat'>
          Arctic Ice Core
        </a>
        </p>

      <p>
        Descriptions:{" "}
        <a href="https://gml.noaa.gov/ccgg/about/co2_measurements.html">
          Mauna Loa CO2
        </a>
        <br></br>
        <a href="https://cdiac.ess-dive.lbl.gov/trends/co2/lawdome.html">
          Arctic Ice Core
        </a>
      </p>
    </>
  )}
</div>
);
};

export default V2;