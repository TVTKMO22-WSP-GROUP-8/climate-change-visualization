import Papa from 'papaparse';
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { LineChart, Line, XAxis, YAxis, CartesianGrid, Tooltip, Legend } from 'recharts';

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




const fetchData = async () => {

  const response = await axios.get('http://localhost:8080/api/source-data-figure');
  const a_gast = a_gastresponse.data;
  const c_carbonDioxide = c_carbonDioxideresponse.data;
  const parsedData = Papa.parse(a_gast, { header: true });
  const parsedData = Papa.parse(c_carbonDioxide, { header: true });
  setChartData(parsedData.data);
};

<><LineChart
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
  <YAxis yAxisId="left" label={{ value: 'CO2 ppm', angle: -90, position: 'insideLeft' }} />
  <YAxis yAxisId="right" orientation="right" label={{ value: 'Surface temperature change', angle: 90, position: 'insideRight' }} />
  <Tooltip />
  <Legend />
  <Line yAxisId="left" type="monotone" dataKey="50%" stroke="#8884d8" />
  <Line yAxisId="right" type="monotone" dataKey="2.5%" stroke="#82ca9d" />
  <Line yAxisId="right" type="monotone" dataKey="97.5%" stroke="#ff7300" />
</LineChart>

  <div>
    <a href="https://climate.fas.harvard.edu/files/climate/files/snyder_2016.pdf">Evolution of global temperature over the past two million years description</a>
    <a href="http://carolynsnyder.com/publications.php">Evolution of global temperature over the past two million years dataset</a>
    <a href="https://www.southampton.ac.uk/~cpd/history.html">Human Evolution and Activities dataset</a>
  </div></>

