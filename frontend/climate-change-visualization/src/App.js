import React, { useEffect, useState } from 'react';
import './App.css';
import { LineChart, Line, XAxis, YAxis, CartesianGrid, Tooltip, Legend } from 'recharts';
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
        <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />
      </label>
      <label>
        Password:
        <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />
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

  const fetchData = async (token) => {
  try {
    const config = {
      headers: { Authorization: `Bearer ${token}` },
    };

    const nhResponse = await axios.get(
      'http://localhost:8080/api/northern-hemisphere-monthly',
      config
    );
    const shResponse = await axios.get(
      'http://localhost:8080/api/southern-hemisphere-monthly',
      config
    );

    console.log('NH data:', nhResponse.data);
    console.log('SH data:', shResponse.data);

    if (Array.isArray(nhResponse.data)) {
      setNhMonthlyData(nhResponse.data);
    } else {
      console.error('Unexpected data format for Northern Hemisphere');
    }

    if (Array.isArray(shResponse.data)) {
      setShMonthlyData(shResponse.data);
    } else {
      console.error('Unexpected data format for Southern Hemisphere');
    }
  } catch (error) {
    console.error('Error fetching data:', error);
  }
};


  useEffect(() => {
    if (nhMonthlyData.length && shMonthlyData.length) {
      const combinedData = nhMonthlyData.map((item, index) => ({
        time: item.time,
        'Northern Hemisphere': item.anomaly,
        'Southern Hemisphere': shMonthlyData[index].anomaly,
        Global: (item.anomaly + shMonthlyData[index].anomaly) / 2,
      }));
      setChartData(combinedData);
    }
  }, [nhMonthlyData, shMonthlyData]);

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

  return (
    <div className="App">
      <h1>Climate Change Data</h1>
      {isLoggedIn ? (
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
          <XAxis dataKey="time" />
          <YAxis />
          <Tooltip />
          <Legend />
         

          <Line type="monotone" dataKey="Global" stroke="blue" />
          <Line type="monotone" dataKey="Northern Hemisphere" stroke="green" />
          <Line type="monotone" dataKey="Southern Hemisphere" stroke="red" />
        </LineChart>
      ) : (
        <LoginForm onSubmit={handleLogin} />
      )}
      {/* Add links to data sources, and the description of the graph here */}
    </div>
  );
}




export default App;
