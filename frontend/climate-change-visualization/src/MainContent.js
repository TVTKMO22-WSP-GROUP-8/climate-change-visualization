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
import './MainContent.css';

function MainContent({ isLoggedIn, handleLogin, ...rest }){
	// Replace the current token-related lines in your component with these lines
	const token = localStorage.getItem('token');
	const annualDataUrl = token ? `/api/data/annual?token=${token}` : '';
	const monthlyDataUrl = token ? `/api/data/monthly?token=${token}` : '';
	const twoThousandYearsDataUrl = token ? `/api/data/2000years?token=${token}` : '';
	const [chartData, setChartData] = useState([]);
	const [nhMonthlyData, setNhMonthlyData] = useState([]);
	const [shMonthlyData, setShMonthlyData] = useState([]);
	const [nhAnnualData, setNhAnnualData] = useState([]);
	const [shAnnualData, setShAnnualData] = useState([]);
	const [nh2000Data, setNh2000Data] = useState([]);
	const [selectedDataType, setSelectedDataType] = useState('monthly');

	const fetchData = useCallback(async (token) => {
		console.log('Token:', token);
	  try {
		const config = {
		  headers: { Authorization: `Bearer ${token}` },
		};

		const nhMonthlyResponse = await axiosInstance.get(
		  monthlyDataUrl.replace('/api/data', '/api/northern-hemisphere'),
		  config
		);
		console.log('NH Monthly data:', nhMonthlyResponse.data);
		const shMonthlyResponse = await axiosInstance.get(
		  monthlyDataUrl.replace('/api/data', '/api/southern-hemisphere'),
		  config
		);
		console.log('SH Monthly data:', shMonthlyResponse.data);
		const nhAnnualResponse = await axiosInstance.get(
		  annualDataUrl.replace('/api/data', '/api/northern-hemisphere'),
		  config
		);
		console.log('NH Annual data:', nhAnnualResponse.data);
		const shAnnualResponse = await axiosInstance.get(
		  annualDataUrl.replace('/api/data', '/api/southern-hemisphere'),
		  config
		);
		console.log('SH Annual data:', shAnnualResponse.data);
		const nh2000Response = await axiosInstance.get(
		  twoThousandYearsDataUrl.replace('/api/data', '/api/northern-hemisphere'),
		  config
		);
		console.log('NH 2000 data:', nh2000Response.data);

		if (Array.isArray(nhMonthlyResponse.data)) {
			setNhMonthlyData(nhMonthlyResponse.data);
		} else {
			console.error('Unexpected data format for Northern Hemisphere Monthly');
		}

		if (Array.isArray(shMonthlyResponse.data)) {
			setShMonthlyData(shMonthlyResponse.data);
		} else {
			console.error('Unexpected data format for Southern Hemisphere Monthly');
		}

		if (Array.isArray(nhAnnualResponse.data)) {
			setNhAnnualData(nhAnnualResponse.data);
		} else {
			console.error('Unexpected data format for Northern Hemisphere Annual');
		}
		if (Array.isArray(shAnnualResponse.data)) {
			setShAnnualData(shAnnualResponse.data);
		} else {
			console.error('Unexpected data format for Southern Hemisphere Annual');
		}
		if (Array.isArray(nh2000Response.data)) {
			setNh2000Data(nh2000Response.data);
		} else {
			console.error('Unexpected data format for Northern Hemisphere 2000');
		}
	  } catch (error) {
		console.error('Error fetching data:', error);
	  }
    }, [annualDataUrl, monthlyDataUrl, twoThousandYearsDataUrl]);

	useEffect(() => {
		if (isLoggedIn && token) {
			fetchData(token);
		}
	}, [isLoggedIn, token, fetchData]);

	useEffect(() => {
	  const updateChartData = () => {
		let combinedData = [];

		if (selectedDataType === 'annual' && nhAnnualData.length && shAnnualData.length) {
		  combinedData = nhAnnualData.map((item, index) => ({
			time: item.time || '',
			'Northern Hemisphere': item.anomaly || null,
			'Southern Hemisphere': shAnnualData[index].anomaly || null,
			Global: (item.anomaly + shAnnualData[index].anomaly) / 2 || null,
		  }));
		} else if (selectedDataType === 'monthly' && nhMonthlyData.length && shMonthlyData.length) {
		  combinedData = nhMonthlyData.map((item, index) => ({
			time: item.time || '',
			'Northern Hemisphere': item.anomaly || null,
			'Southern Hemisphere': shMonthlyData[index].anomaly || null,
			Global: (item.anomaly + shMonthlyData[index].anomaly) / 2 || null,
		  }));
		} else if (selectedDataType === '2000' && nh2000Data.length) {
		  combinedData = nh2000Data.map((item) => ({
			time: item.time || '',
			Anomaly: item.anomaly || null,
		  }));
		}

		setChartData(combinedData);
		console.log('chartData:', chartData);
	  };

	  updateChartData();
	}, [isLoggedIn, selectedDataType, nhAnnualData, shAnnualData, nhMonthlyData, shMonthlyData, nh2000Data]);


	const handleAnnualButtonClick = () => {
	console.log('Annual button clicked');
	setSelectedDataType('annual');
    if (nhAnnualData.length && shAnnualData.length) {
      const combinedData = nhAnnualData.map((item, index) => ({
        time: item.time,
        'Northern Hemisphere': item.anomaly,
        'Southern Hemisphere': shAnnualData[index].anomaly,
        Global: (item.anomaly + shAnnualData[index].anomaly) / 2,
      }));
      setChartData(combinedData);
	  console.log("Annual combined data:", combinedData);
    }
  };

  const handleMonthlyButtonClick = () => {
	console.log('Monthly button clicked');
	setSelectedDataType('monthly');
    if (nhMonthlyData.length && shMonthlyData.length) {
      const combinedData = nhMonthlyData.map((item, index) => ({
        time: item.time,
        'Northern Hemisphere': item.anomaly,
        'Southern Hemisphere': shMonthlyData[index].anomaly,
        Global: (item.anomaly + shMonthlyData[index].anomaly) / 2,
      }));
      setChartData(combinedData);
	  console.log("Monthly combined data:", combinedData);
    }
  };

	const handle2000ButtonClick = () => {
	  console.log('2000 years button clicked');
	  setSelectedDataType('2000');
	  if (selectedDataType === '2000' && nh2000Data.length) {
		const combinedData = nh2000Data.map((item) => ({
		  time: item.year || '',
		  T: item.t || null,
		  LF: item.lf || null,
		  LFMinus: item.lfminus || null,
		  LFPlus: item.lfplus || null,
		  AMinus: item.aminus || null,
		  APlus: item.aplus || null,
		  ABMinus: item.abminus || null,
		  ABPlus: item.abplus || null,
		}));
		setChartData(combinedData);
		console.log("2000 years combined data:", combinedData);
	  }

	};

return (
    <div className="App">
      <h1>Climate Change Data</h1>
      {isLoggedIn ? (
        <>
          <div className="buttons">
            <button onClick={handleAnnualButtonClick}>Annual</button>
            <button onClick={handleMonthlyButtonClick}>Monthly</button>
            <button onClick={handle2000ButtonClick}>2000 years</button>
          </div>
          <LineChart
            width={1000}
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
            <YAxis />
            <Tooltip />
            <Legend />
            {selectedDataType !== '2000' && (
              <>
                <Line type="monotone" dataKey="Northern Hemisphere" stroke="#8884d8" />
                <Line type="monotone" dataKey="Southern Hemisphere" stroke="#82ca9d" />
                <Line type="monotone" dataKey="Global" stroke="#ff7300" />
              </>
            )}
            {selectedDataType === '2000' && (
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
          <a href="https://www.metoffice.gov.uk/hadobs/hadcrut5/">HADCRUT5</a>
        </>
      ) : (
	  
        <button onClick={handleLogin}>Login</button>
      )}
    </div>
  );
}

export default MainContent;	

