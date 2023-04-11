import React, { useEffect, useState } from 'react';
import { LineChart, Line, XAxis, YAxis, CartesianGrid, Tooltip, Legend } from 'recharts';
import axios from 'axios';

function App() {
  const [chartData, setChartData] = useState([]);

  const fetchData = async () => {
    try {
      // Adjust the URLs to point to your backend API endpoints
      const nhMonthlyResponse = await axios.get('http://localhost:8080/api/northern-hemisphere-monthly/monthly');
      const shMonthlyResponse = await axios.get('http://localhost:8080/api/southern-hemisphere-monthly/monthly');

      const nhMonthlyData = nhMonthlyResponse.data;
      const shMonthlyData = shMonthlyResponse.data;

      // Process the data and create arrays for the chart
      const data = nhMonthlyData.map((item, index) => ({
        time: item.time,
        Global: (item.anomaly + shMonthlyData[index].anomaly) / 2,
        'Northern Hemisphere': item.anomaly,
        'Southern Hemisphere': shMonthlyData[index].anomaly,
      }));

      setChartData(data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  useEffect(() => {
    fetchData();
  }, []);

  return (
    <div className="App">
      <h1>Climate Change Data</h1>
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
      {/* Add links to data sources, and the description of the graph here */}
    </div>
  );
}

export default App;
