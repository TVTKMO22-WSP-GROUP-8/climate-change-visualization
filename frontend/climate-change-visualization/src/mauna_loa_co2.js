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

function App2() {
  const [chartData, setChartData] = useState([]);
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [maunaLoaAnnualData, setMaunaLoaAnnualData] = useState([]);
  const [maunaLoaMonthlyData, setMaunaLoaMonthlyData] = useState([]);
  const [iceCore1Data, setIceCore1Data] = useState([]);
  const [iceCore2Data, setIceCore2Data] = useState([]);
  const [iceCore3Data, setIceCore3Data] = useState([]);
  const [selectedDataType, setSelectedDataType] = useState('annual');

  const fetchData = async (token) => {
    try {
      const config = {
        headers: { Authorization: `Bearer ${token}` },
      };

      const maunaLoaAnnualResponse = await axios.get(
        'http://localhost:8080/api/mauna-loa-co2-annual',
        config
      );
      console.log('Mauna Loa CO2 Annual Data:', maunaLoaAnnualResponse.data);

      const maunaLoaMonthlyResponse = await axios.get(
        'http://localhost:8080/api/mauna-loa-co2-monthly',
        config
      );
      console.log('Mauna Loa CO2 Monthly Data:', maunaLoaMonthlyResponse.data);

      const iceCore1Response = await axios.get(
        'http://localhost:8080/api/ice-core-1',
        config
      );      
      console.log('Ice Core 1 Data:', iceCore1Response.data);

      const iceCore2Response = await axios.get(
        'http://localhost:8080/api/ice-core-2',
        config
      );      
      console.log('Ice Core 2 Data:', iceCore2Response.data);

      const iceCore3Response = await axios.get(
        'http://localhost:8080/api/ice-core-3',
        config
      );      
      console.log('Ice Core 3 Data:', iceCore3Response.data);

      if (Array.isArray(maunaLoaAnnualResponse.data)) {
        setMaunaLoaAnnualData(maunaLoaAnnualResponse.data);
      } else {
        console.error('Unexpected data format for Mauna Loa CO2 Annual Data');
      }

      if (Array.isArray(maunaLoaMonthlyResponse.data)) {
        setMaunaLoaMonthlyData(maunaLoaMonthlyResponse.data);
      } else {
        console.error('Unexpected data format for Mauna Loa CO2 Monthly Data');
      }

      if (Array.isArray(iceCore1Response.data)) {
        setIceCore1Data(iceCore1Response.data);
      } else {
        console.error('Unexpected data format for Mauna Loa CO2 Monthly Data');
      }

      if (Array.isArray(iceCore2Response.data)) {
        setIceCore2Data(iceCore2Response.data);
      } else {
        console.error('Unexpected data format for Mauna Loa CO2 Monthly Data');
      }

      if (Array.isArray(iceCore3Response.data)) {
        setIceCore3Data(iceCore3Response.data);
      } else {
        console.error('Unexpected data format for Mauna Loa CO2 Monthly Data');
      }

    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  useEffect(() => {
    const updateChartData = () => {
      let combinedData = [];

      if (selectedDataType === 'annual' && maunaLoaAnnualData.length) {
        combinedData = maunaLoaAnnualData.map((item, index) => ({
          year: item.year || '',
          mean: item.mean || null,
          unc: item.unc || null,
          id: item.id || null,
          'Annual': item.mean + maunaLoaAnnualData[index].mean,


        }));
      } else if (selectedDataType === 'monthly' && maunaLoaMonthlyData.length) {
        combinedData = maunaLoaMonthlyData.map((item) => ({
          year: item.year || '',
          mean: item.mean || null,
          unc: item.unc || null,
		      id: item.id || null,

  }));
  //ice core
      } else if (selectedDataType === 'icecore1' && iceCore1Data.length) {
        combinedData = iceCore1Data.map((item) => ({
        id: item.id || null,
        Analysis: item.anlysis || null,
        MeanIceDepth: item.meanicedepth || null,
        IceAge: item.iceage || null,
        CO2MixingRatio: item.co2mixingratio || null,
  }));
      } else if (selectedDataType === 'icecore2' && iceCore2Data.length) {
        combinedData = iceCore2Data.map((item) => ({
        id: item.id || null,
        Analysis: item.analysis || null,
        MeanIceDepth: item.meanicedepth || null,
        IceAge: item.iceage || null,
        MeanAirAge: item.meanaceage || null,
        CO2MixingRatio: item.co2mixingratio || null,
}));
      } else if (selectedDataType === 'icecore3' && iceCore3Data.length) {
        combinedData = iceCore3Data.map((item) => ({
        id: item.id || null,
        Sample: item.sample || null,
        Analysis: item.analysis || null,
        MeanIceDepth: item.meanicedepth || null,
        IceAge: item.iceage || null,
        MeanAirAge: item.meanaceage || null,
        CO2MixingRatio: item.co2mixingratio || null,

}));

}

  setChartData(combinedData);
  console.log('chartData', chartData);
    };

    updateChartData();
  }, [isLoggedIn, selectedDataType, maunaLoaAnnualData, maunaLoaMonthlyData, iceCore1Data, iceCore2Data, iceCore3Data]);


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
	console.log('Annual button clicked');
	setSelectedDataType('annual');
  if (selectedDataType === 'annual' && maunaLoaAnnualData.length) {
  const combinedData = maunaLoaAnnualData.map((item) => ({
    year: item.year || '',
    mean: item.mean || null,
    unc: item.unc || null,
    id: item.id || null,
  }));
      setChartData(combinedData);
	  console.log("Annual data:", combinedData);
    }
  };

  const handleMonthlyButtonClick = () => {
    console.log('Monthly button clicked');
    setSelectedDataType('monthly');
    if (selectedDataType === 'monthly' && maunaLoaMonthlyData.length) {
    const combinedData = maunaLoaMonthlyData.map((item) => ({
      year: item.year || '',
      mean: item.mean || null,
      unc: item.unc || null,
      id: item.id || null,
    }));
        setChartData(combinedData);
      console.log("Monthly data:", combinedData);
      }
    };

  const handleIceCoreButtonClick = () => {
    console.log('Ice Core button clicked');
    setSelectedDataType('icecore');
    if (selectedDataType === 'icecore' && iceCore1Data.lenght && iceCore2Data.lenght && iceCore3Data.lenght) {
    const combinedData = maunaLoaMonthlyData.map((item) => ({
        //id: item.id || null,
        Sample: item.sample || null,
        Analysis: item.analysis || null,
        MeanIceDepth: item.meanicedepth || null,
        IceAge: item.iceage || null,
        MeanAirAge: item.meanaceage || null,
        CO2MixingRatio: item.co2mixingratio || null,
    }));
        setChartData(combinedData);
      console.log("Ice Core datas:", combinedData);
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
              <button onClick={handleIceCoreButtonClick}>Ice Core</button>
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
              <YAxis domain={['dataMin - 1', 'dataMax + 1']} />
              <Tooltip />
              <Legend />
              {selectedDataType === 'annual' && (
            <>
              <Line type="monotone" dataKey="year" stroke="#ff0000" />
              <Line type="monotone" dataKey="mean" stroke="#8884d8" />
              <Line type="monotone" dataKey="unc" stroke="#82ca9d" />
            </>
          )}

              {selectedDataType === 'monthly' && (
            <>
              <Line type="monotone" dataKey="year" stroke="#ff0000" />
              <Line type="monotone" dataKey="mean" stroke="#8884d8" />
              <Line type="monotone" dataKey="unc" stroke="#82ca9d" />
            </>
          )}

              {selectedDataType !== 'icecore' && (
            <>
              <Line type="monotone" dataKey="Annual" stroke="#8884d8" />
              <Line type="monotone" dataKey="Monthly" stroke="#82ca9d" />
            </>
          )}
          {selectedDataType === 'icecore' && (
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
            <a href="https://gml.noaa.gov/ccgg/about/co2_measurements.html">Mauna Loa CO2</a>
            <a href="https://cdiac.ess-dive.lbl.gov/trends/co2/lawdome.html">Ice Cores</a>
          </>
        ) : (
          <>
            {isLoggedIn ? 'Logged in' : 'Not logged in'}
            <LoginForm onSubmit={handleLogin} />
          </>
        )}
      </div>
    );
 }
export default App2;
