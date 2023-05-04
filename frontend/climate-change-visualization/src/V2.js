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
  const [chartData, setChartData] = useState([]);
  const [maunaLoaCO2Annual, setMaunaLoaCO2Annual] = useState([]);
  const [maunaLoaCO2Monthly, setMaunaLoaCO2Monthly] = useState([]);
  const [iceSamplesData, setIceSamplesData] = useState([]);
  const [selectedDataType, setSelectedDataType] = useState('Mauna Loa CO2 Monthly');

  const fetchData = useCallback(async () => {
    try {
      const apiEndpoints = [
        '/api/mauna-loa-co2-annual',
        '/api/mauna-loa-co2-monthly',
        '/api/ice-samples',
      ];

      for (const endpoint of apiEndpoints) {
        let response;

        response = await axiosInstance.get(endpoint);

        console.log(`Data from ${endpoint}:`, response.data);

        // Set the corresponding state based on the endpoint
        switch (endpoint) {
          case '/api/mauna-loa-co2-annual':
            setMaunaLoaCO2Annual(response.data);
            break;
          case '/api/mauna-loa-co2-monthly':
            setMaunaLoaCO2Monthly(response.data);
            break;
          case '/api/ice-samples':
            setIceSamplesData(response.data);
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
    
      if (selectedDataType === 'Mauna Loa CO2 Monthly') {
        newData = maunaLoaCO2Monthly.map((d) => ({
          time: `${d.year}-${d.month}`,
          co2: d.average,
        }));
      } else if (selectedDataType === 'Mauna Loa CO2 Annual') {
        newData = maunaLoaCO2Annual.map((d) => ({
          time: d.year.toString(),
          co2: d.mean,
        }));
      } else if (selectedDataType === 'Ice Core Data') {
        console.log("iceSamplesData:", iceSamplesData);
        newData = prepareIceCoreData(iceSamplesData);
        console.log("newData:", newData);

        console.log("newData:", newData); // log newData to console
      }
    
      setChartData(newData);
      console.log('Updated chart data:', newData);
    };
    
    
    updateChartData();
  }, [selectedDataType, maunaLoaCO2Annual, maunaLoaCO2Monthly, iceSamplesData]);
  const prepareIceCoreData = (iceCoreData) => {
    if (typeof iceCoreData !== 'object') {
      return [];
    }
  
    const combinedData = Object.values(iceCoreData).flat();
    return combinedData.map((d) => ({
      time: d.ice_age.toString(),
      co2: d.co2_mixing_ratio,
    }));
  };
  

  return (
    <div>
      <h2>V2: Atmospheric CO2 Concentrations</h2>
      {isLoggedIn && (
        <>
          <select
            id="data-type-dropdown"
            value={selectedDataType}
            onChange={(e) => setSelectedDataType(e.target.value)}
          >
            <option value="Mauna Loa CO2 Monthly">Mauna Loa CO2 Monthly</option>
            <option value="Mauna Loa CO2 Annual">Mauna Loa CO2 Annual</option>
            <option value="Ice Core Data">Ice Core Data</option>
          </select>
          <LineChart
            width={1200}
            height={600}
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
            <YAxis />
            <Tooltip />
            <Legend />
            <Line type="monotone" dataKey="co2" stroke="#8884d8" activeDot={{ r: 8 }} />
          </LineChart>
        </>
      )}
    </div>
  );  
}

export default V2;
