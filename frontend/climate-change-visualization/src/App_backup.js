import React, { useEffect, useState } from 'react';
import './App.css';
import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
  Legend,
} from 'recharts';
import axios from 'axios';

function LoginForm({ onSubmit }) {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    console.log('Submitting:', { username, password });
    onSubmit(username, password);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Username:
        <input
          type="text"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />
      </label>
      <label>
        Password:
        <input
          type="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
      </label>
      <button type="submit">Login</button>
    </form>
  );
}

function App() {
  const [chartData, setChartData] = useState([]);
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [nhMonthlyData, setNhMonthlyData] = useState([]);
  const [shMonthlyData, setShMonthlyData] = useState([]);
  const [nhAnnualData, setNhAnnualData] = useState([]);
  const [shAnnualData, setShAnnualData] = useState([]);
  const [nh2000Data, setNh2000Data] = useState([]);
  const [selectedDataType, setSelectedDataType] = useState('');
  
  const fetchData = async (token) => {
    try {
      const config = {
        headers: { Authorization: `Bearer ${token}` },
      };

      const nhMonthlyResponse = await axios.get(
        'http://localhost:8080/api/northern-hemisphere-monthly',
        config
      );
      const shMonthlyResponse = await axios.get(
        'http://localhost:8080/api/southern-hemisphere-monthly',
        config
      );
      const nhAnnualResponse = await axios.get(
        'http://localhost:8080/api/northern-hemisphere-annual',
        config
      );
      const shAnnualResponse = await axios.get(
        'http://localhost:8080/api/southern-hemisphere-annual',
        config
      );
      const nh2000Response = await axios.get(
        'http://localhost:8080/api/northern-hemisphere-2000',
        config
      );

      console.log('NH Monthly data:', nhMonthlyResponse.data);
      console.log('SH Monthly data:', shMonthlyResponse.data);
      console.log('NH Annual data:', nhAnnualResponse.data);
      console.log('SH Annual data:', shAnnualResponse.data);
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
	        if (Array.isArray(nh2000Response.data)) {
        setNh2000Data(nh2000Response.data);
      } else {
        console.error('Unexpected data format for Northern Hemisphere 2000');
      }
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  useEffect(() => {
    const updateChartData = () => {
      let combinedData = [];

      if (selectedDataType === 'annual' && nhAnnualData.length && shAnnualData.length) {
        combinedData = nhAnnualData.map((item, index) => ({
          time: item.time,
          'Northern Hemisphere': item.anomaly,
          'Southern Hemisphere': shAnnualData[index].anomaly,
          Global: (item.anomaly + shAnnualData[index].anomaly) / 2,
        }));
      } else if (selectedDataType === 'monthly' && nhMonthlyData.length && shMonthlyData.length) {
        combinedData = nhMonthlyData.map((item, index) => ({
          time: item.time,
          'Northern Hemisphere': item.anomaly,
          'Southern Hemisphere': shMonthlyData[index].anomaly,
          Global: (item.anomaly + shMonthlyData[index].anomaly) / 2,
        }));
      } else if (selectedDataType === '2000' && nh2000Data.length) {
        combinedData = nh2000Data.map((item) => ({
          time: item.time,
          Anomaly: item.anomaly,
        }));
      }

      setChartData(combinedData);
    };

    updateChartData();
  }, [selectedDataType, nhAnnualData, shAnnualData, nhMonthlyData, shMonthlyData, nh2000Data]);

  const handleLogin = async (username, password) => {
    try {
      const token = await authenticate(username, password);
      setIsLoggedIn(true);
      fetchData(token);
    } catch (error) {
      console.error('Error during login:', error);
    }
  };

  async function authenticate(username, password) {
    try {
      const response = await axios.post('http://localhost:8080/login', {
        username,
        password,
      });

      if (response.status === 200) {
        return response.data.token;
      } else {
        throw new Error('Authentication failed');
      }
    } catch (error) {
      console.error('Error during authentication:', error);
      throw error;
    }
  }

  const handleAnnualButtonClick = () => {
	setSelectedDataType('annual');
    if (nhAnnualData.length && shAnnualData.length) {
      const combinedData = nhAnnualData.map((item, index) => ({
        time: item.time,
        'Northern Hemisphere': item.anomaly,
        'Southern Hemisphere': shAnnualData[index].anomaly,
        Global: (item.anomaly + shAnnualData[index].anomaly) / 2,
      }));
      setChartData(combinedData);
    }
  };

  const handleMonthlyButtonClick = () => {
	setSelectedDataType('monthly');
    if (nhMonthlyData.length && shMonthlyData.length) {
      const combinedData = nhMonthlyData.map((item, index) => ({
        time: item.time,
        'Northern Hemisphere': item.anomaly,
        'Southern Hemisphere': shMonthlyData[index].anomaly,
        Global: (item.anomaly + shMonthlyData[index].anomaly) / 2,
      }));
      setChartData(combinedData);
    }
  };

  const handle2000ButtonClick = () => {
	setSelectedDataType('2000');
    if (nh2000Data.length) {
      const combinedData = nh2000Data.map((item) => ({
        time: item.time,
        Anomaly: item.anomaly,
      }));
      setChartData(combinedData);
    }
  };
  return (
    <div className="App">
      {/* ... (rest of the JSX remains the same) */}
      {isLoggedIn ? (
        <LineChart
          // ... (LineChart properties remain the same)
        >
          <CartesianGrid strokeDasharray="3 3" />
          <XAxis dataKey="time" />
          <YAxis />
          <Tooltip />
          <Legend />
          <Line type="monotone" dataKey="Global" stroke="blue" />
          {selectedDataType === 'annual' || selectedDataType === 'monthly' ? (
            <>
              <Line
                type="monotone"
                dataKey="Northern Hemisphere"
                stroke={selectedDataType === 'annual' ? 'green' : 'orange'}
              />
              <Line
                type="monotone"
                dataKey="Southern Hemisphere"
                stroke={selectedDataType === 'annual' ? 'red' : 'purple'}
              />
            </>
          ) : selectedDataType === '2000' ? (
            <Line type="monotone" dataKey="Anomaly" stroke="orange" />
          ) : null}
        </LineChart>
      ) : (
        <LoginForm onSubmit={handleLogin} />
      )}
      {/* Add links to data sources, and the description of the graph here */}
    </div>
  );
}
export default App;