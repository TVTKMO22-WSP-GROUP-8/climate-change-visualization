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
      <p>Pieter Tans and Kirk Thoning, NOAA Global Monitoring Laboratory,
Boulder, Colorado
September, 2008. Updated December, 2016; March 2018, September 2020</p>
<p>Note: This is an update that incorporates new measurement methods and analyzer at Mauna Loa. The previous version of this document that discusses the infrared analyzer measurements at Mauna Loa is available here.</p>
<h3>Summary</h3>
<p>We have confidence that the CO2 measurements made at the Mauna Loa Observatory reflect truth about our global atmosphere. The main reasons for that confidence are:</p>
<ul>
<li>The Observatory near the summit of Mauna Loa, at an altitude of 3400 m, is well situated to measure air masses that are representative of very large areas.</li>
<li>All of the measurements are rigorously and very frequently calibrated.</li>
<li>Ongoing comparisons of independent measurements at the same site allow an estimate of the accuracy, which is generally better than 0.2 ppm.</li>
</ul>
<h3>Mole fraction in dry air</h3>
<p>What do we need to measure?</p>
<p>Most people assume that we measure the “concentration” of CO2 in air, and in communicating with the general public we frequently use that word because it is familiar. The quantity we actually determine is accurately described by the chemical term “mole fraction”, defined as the number of carbon dioxide molecules in a given number of molecules of air, after removal of water vapor. For example, 413 parts per million of CO2 (abbreviated as ppm) means that in every million molecules of (dry) air there are on average 413 CO2 molecules. The table below gives approximate values of gases in the atmosphere for 413 ppm of CO2 in dry air (this is roughly the average amount of CO2 in the atmosphere in the middle of the year 2020). All species have been expressed as ppm, turning 78.09% nitrogen into 780,900 ppm. The rightmost column shows the composition of the same air after enough water vapor has been added to make the mole fraction of water vapor in wet air 3%:</p>
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
          <p>
        Data source:{" "}
        <a href="https://gml.noaa.gov/ccgg/trends/data.html">
        Mauna Loa
        </a>
      </p>
        </>
      )} CO2
    </div>
  );  
}

export default V2;
