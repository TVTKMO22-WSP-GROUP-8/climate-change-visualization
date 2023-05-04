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
import './V3.css';

function V3({ isLoggedIn, handleLogin, ...rest }) {
  const [chartData, setChartData] = useState([]);
  const [selectedDataType, setSelectedDataType] = useState('1a-GAST reconstruction');

  const fetchData = useCallback(async () => {
    try {
      const apiEndpoints = [
        '/api/source-data-figure',
      ];

      for (const endpoint of apiEndpoints) {
        let response;

        response = await axiosInstance.get(endpoint);

        console.log(`Data from ${endpoint}:`, response.data);

        // Set the corresponding state based on the endpoint
        switch (endpoint) {
          case '/api/source-data-figure':
            if (selectedDataType === '1a-GAST reconstruction') {
              setChartData(response.data.map((d) => ({
                time: d.time,
                Temperature: d.median,
              })));
            } else if (selectedDataType === '1c-Carbon Dioxide sheet') {
              setChartData(response.data.map((d) => ({
                time: d.year,
                'Carbon Dioxide (ppm)': d.average,
              })));
            }
            break;
          default:
            break;
        }
      }
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }, [selectedDataType]);

  useEffect(() => {
    fetchData();
  }, [fetchData]);

  return (
    <div>
      <h2>V3: Temperature and Carbon Dioxide Levels</h2>
      {isLoggedIn && (
        <>
          <select
            id="data-type-dropdown"
            value={selectedDataType}
            onChange={(e) => setSelectedDataType(e.target.value)}
          >
            <option value="1a-GAST reconstruction">1a-GAST reconstruction</option>
            <option value="1c-Carbon Dioxide sheet">1c-Carbon Dioxide sheet</option>
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
            {selectedDataType === '1a-GAST reconstruction' && (
              <YAxis yAxisId="left" label={{ value: 'Temperature (°C)', angle: -90, position: 'insideLeft' }} />
            )}
            {selectedDataType === '1c-Carbon Dioxide sheet' && (
              <YAxis yAxisId="left" label={{ value: 'Carbon Dioxide (ppm)', angle: -90, position: 'insideLeft' }} />
            )}
            {selectedDataType === '1a-GAST reconstruction' && (
              <YAxis yAxisId="right" orientation="right" label={{ value: 'Carbon Dioxide (ppm)', angle: -90, position: 'insideRight' }} />
            )}
            {selectedDataType === '1c-Carbon Dioxide sheet' && (
              <YAxis yAxisId="right" orientation="right" label={{ value: 'Temperature (°C)', angle: -90, position: 'insideRight' }} />
            )}
            <Tooltip />
            <Legend />
            <Line
                yAxisId="left"
                type="monotone"
                dataKey="Carbon Dioxide (ppm)"
                name="Carbon Dioxide (ppm)"
                stroke="#8884d8"
                activeDot={{ r: 8 }}
              />
              <Line
                yAxisId="right"
                type="monotone"
                dataKey="Temperature"
                name="Surface Temperature Change (°C)"
                stroke="#82ca9d"
              />
          </LineChart>
          <p>
            Data source:{" "}
            <a href="http://carolynsnyder.com/papers/Snyder_Data_Figures.zip">
              Snyder_Data_Figures.zip
            </a>
          </p>
          <p>
            Description: Reconstruction of Earth's past climate strongly influence our understanding of the dynamics and sensitivity of the climate system. This chart shows the surface temperature change and CO2 concentration over a span of 2 million years for temperature and 800,000 years for CO2 concentration. The left vertical axis shows the CO2 concentration in parts per million (ppm) and the right vertical axis shows the surface temperature change in degrees Celsius (°C). The data source for this chart is Snyder_Data_Figures.zip.
          </p>
        </>
      )}
    </div>
  );
}
export default V3;  