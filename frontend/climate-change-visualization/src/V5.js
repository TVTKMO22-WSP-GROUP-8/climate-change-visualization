import React, { useState, useEffect, useCallback } from 'react';
import axiosInstance from './axiosInstance';
import {
  PieChart,
  Pie,
  Cell,
  ResponsiveContainer,
  Legend,
  Tooltip,
} from 'recharts';
import './V5.css';

function V5({ isLoggedIn, handleLogin, ...rest }) {
  const COLORS = [
    '#0088FE',
    '#00C49F',
    '#FFBB28',
    '#FF8042',
    '#AF19FF',
    '#8e44ad',
    '#3498db',
    '#f1c40f',
    '#e74c3c',
    '#34495e',
    '#16a085',
    '#d35400',
    '#95a5a6',
    '#27ae60',
  ];

  const [selectedSector, setSelectedSector] = useState('');
  const [sectorData, setSectorData] = useState([]);
  const [subsectorsData, setSubsectorsData] = useState([]);
  const [chartData, setChartData] = useState([

    { sub_sector: 'Road', value: 11.9 },
    { sub_sector: 'Aviation', value: 1.9 },
    { sub_sector: 'Rail', value: 0.4 },
    { sub_sector: 'Pipeline', value: 0.3 },
    { sub_sector: 'Ship', value: 10.9 },
    { sub_sector: 'Machinery', value: 0.5 },
    { sub_sector: 'Food and tobacco', value: 1 },
    { sub_sector: 'Paper, pulp & printing', value: 0.6 },
    { sub_sector: 'Chemical & petrochemical (energy)', value: 3.6 },
    { sub_sector: 'Other industry', value: 10.6 },
    { sub_sector: 'Energy in Agri & Fishing', value: 1.7 },
    { sub_sector: 'Unallocated fuel combustion', value: 7.8 },
    { sub_sector: 'Coal', value: 1.9 },
    { sub_sector: 'Oil & Natural Gas', value: 3.9 },    
    { sub_sector: 'Cement', value: 3 },
    { sub_sector: 'Forest Land', value: 2.2 },
    { sub_sector: 'Crop Burning', value: 3.5 },
    { sub_sector: 'Agricultural Soils', value: 4.1 },
    { sub_sector: 'Rice Cultivation', value: 1.3 },
    { sub_sector: 'Livestock & Manure', value: 5.8 },
    { sub_sector: 'Chemical & petrochemical (industrial)', value: 2.2 },
    { sub_sector: 'Cropland', value: 1.4 },
    { sub_sector: 'Grassland', value: 0.1 },
    { sub_sector: 'Landfills', value: 1.9 },
    { sub_sector: 'Wastewater', value: 1.3 },
    { sub_sector: 'Commercial', value: 6.6 },
    { sub_sector: 'Iron & Steel', value: 7.2 },
    { sub_sector: 'Non-ferous metals', value: 0.7 },
  ]);

  const fetchData = useCallback(async () => {
    try {
      const subsectorResponse = await axiosInstance.get('/api/emissions_by_subsector');
  
      console.log(
        'Data from /api/emissions_by_subsector:',
        subsectorResponse.data
      );
  
      const sectors = new Set(subsectorResponse.data.map((d) => d.sector));
      setSectorData([...sectors].map((sector) => ({ sub_sector: sector, id: sector })));
      setSubsectorsData(subsectorResponse.data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }, []);
  
  useEffect(() => {
    fetchData();
  }, [fetchData]);

  useEffect(() => {
    if (!selectedSector) {
      return;
    }
  
    const data = subsectorsData
      .filter((d) => d.sector === selectedSector)
      .map((d) => ({
        sub_sector: d.sub_sector,
        value: d.share_of_global_greenhouse_gas_emissions,
      }));
  
    setChartData(data);
    console.log(`Updated chart data for ${selectedSector}:`, data);
  }, [selectedSector, subsectorsData]);
  
  const handleSectorClick = (data, index) => {
    setSelectedSector(data.sub_sector);
    console.log(`Clicked on sector ${data.sub_sector}`);
  };

  const renderCustomizedLabel = ({
    cx,
    cy,
    midAngle,
    innerRadius,
    outerRadius,
    percent,
    index,
  }) => {
    const radius = innerRadius + (outerRadius - innerRadius) * 0.4;
    const x = cx + radius * Math.cos(-midAngle * (Math.PI / 180));
    const y = cy + radius * Math.sin(-midAngle * (Math.PI / 180));

    return (
      <text
        x={x}
        y={y}
        fill="white"
        textAnchor="middle"
        dominantBaseline="central"
      >
        {`${(percent * 100).toFixed(0)}%`}
      </text>
    );
  };
  return (
    <div>
      <h2>CO2 Emissions by Sectors</h2>
      
      <div className="dropdown">
        <button className="dropbtn">Select Sector</button>
        <div className="dropdown-content">
          {sectorData.map((sector, index) => (
            <button
              key={`sector-${index}`}
              onClick={() => handleSectorClick(sector)}
            >
              {sector.id}
            </button>
          ))}
        </div>
      </div>



  <div className="doughnut-container">
    <ResponsiveContainer width="100%" height={400}>
      <PieChart>
        <Pie
          data={chartData}
          dataKey="value"
          nameKey="sub_sector"
          cx="50%"
          cy="50%"
          outerRadius={80}
          label={renderCustomizedLabel}
        >
          {chartData.map((entry, index) => (
            <Cell
              key={`cell-${index}`}
              fill={COLORS[index % COLORS.length]}
            />
          ))}
        </Pie>
        <Tooltip />
      </PieChart>
    </ResponsiveContainer>
  </div>

{selectedSector && (
  <div className="subsectors-container">
    <h3>{selectedSector} Sub-sectors</h3>
    <ul>
      {subsectorsData
        .filter((d) => d.sector === selectedSector)
        .map((subsector) => (
          <li key={subsector.id}>
            {subsector.sub_sector}: {subsector.share_of_global_greenhouse_gas_emissions}%
          </li>
      ))}
    </ul>
  </div>
)}
</div>
);
}
export default V5;