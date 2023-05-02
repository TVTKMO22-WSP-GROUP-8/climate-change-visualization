import React, { useState, useEffect, useCallback } from 'react';
import axiosInstance from './axiosInstance';
import config from './config';
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



function V2({ isLoggedIn, handleLogin, ...rest }) {
  const [chartData, setChartData] = useState([]);
  const [globalAnnualData, setGlobalAnnualData] = useState([]);
  const [globalMonthlyData, setGlobalMonthlyData] = useState([]);
  const [nh2000Data, setNh2000Data] = useState([]);
  const [nhAnnualData, setNhAnnualData] = useState([]);
  const [nhMonthlyData, setNhMonthlyData] = useState([]);
  const [shAnnualData, setShAnnualData] = useState([]);
  const [shMonthlyData, setShMonthlyData] = useState([]);
  const [selectedDataType, setSelectedDataType] = useState('GlobalMonthly');
  const token = '/dOW4m1F2pafIC4eViVX62tkwdntfW0/WceUkuR095nOH58chb1v510o6mOT6kdN+XY5TJCLwEh0hlkpIVs9wA==';

  const fetchData = useCallback(async (token) => {
    console.log('Token:', token);
    try {
      const config = {
        headers: {
          'Authorization': 'Bearer ' + token,
          'Content-Type': 'application/json',
        },
      };

      const apiEndpoints = [
        '/api/global-annual',
        '/api/global-monthly',
        '/api/northern-hemisphere-2000',
        '/api/northern-hemisphere-annual',
        '/api/northern-hemisphere-monthly',
        '/api/southern-hemisphere-annual',
        '/api/southern-hemisphere-monthly',
      ];

      for (const endpoint of apiEndpoints) {
        let response;

			response = await axiosInstance.get(endpoint, config); // Use GET for other endpoints

			console.log(`Data from ${endpoint}:`, response.data);

        // Set the corresponding state based on the endpoint
        switch (endpoint) {
          case '/api/global-annual':
            setGlobalAnnualData(response.data);
            break;
          case '/api/global-monthly':
            setGlobalMonthlyData(response.data);
            break;
          case '/api/northern-hemisphere-2000':
            setNh2000Data(response.data);
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
          default:
            break;
        }
      }
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }, []);

  useEffect(() => {
    if (isLoggedIn && token) {
      fetchData(token);
    }
  }, [isLoggedIn, token, fetchData]);

  useEffect(() => {
    switch (selectedDataType) {
      case 'Annual':
        setChartData([
          ...globalAnnualData,
          ...nhAnnualData,
          ...shAnnualData,
        ]);
        break;
      case 'Monthly':
        setChartData([
          ...globalMonthlyData,
          ...nhMonthlyData,
          ...shMonthlyData,
        ]);
        break;
      case '2000Year':
        setChartData([...nh2000Data]);
        break;
      default:
        break;
    }

    return () => {
      setChartData([]); // Reset the chart data when the component unmounts
    };
  }, [
    selectedDataType,
    globalAnnualData,
    globalMonthlyData,
    nh2000Data,
    nhAnnualData,
    nhMonthlyData,
    shAnnualData,
    shMonthlyData,
  ]);
	return (
	<div className="V1">
	<h1>Data Visualization</h1>
	<div className="chart-container">
      <div className="dropdown">
        <label htmlFor="data-type-dropdown">Select Data Type:</label>
        <select
          id="data-type-dropdown"
          value={selectedDataType}
          onChange={(e) => setSelectedDataType(e.target.value)}
        >
          <option value="Annual">Annual</option>
          <option value="Monthly">Monthly</option>
          <option value="2000Year">2000-Year</option>
        </select>
      </div>
		<LineChart
				width={600}
				height={300}
				data={chartData}
				margin={{
				top: 5,
				right: 30,
				left: 20,
				bottom: 5,
			}}
			>
		<CartesianGrid strokeDasharray="3 3" />
			<XAxis dataKey="name" />
			<YAxis />
			<Tooltip />
			<Legend />
			<Line type="monotone" dataKey="global" stroke="#8884d8" activeDot={{ r: 8 }} />
			<Line type="monotone" dataKey="northernHemisphere" stroke="#82ca9d" activeDot={{ r: 8 }} />
			<Line type="monotone" dataKey="southernHemisphere" stroke="#ffc658" activeDot={{ r: 8 }} />
		</LineChart>
		</div>
	</div>
	);
}
export default V2;