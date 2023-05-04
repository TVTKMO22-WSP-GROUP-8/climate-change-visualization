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
  const [chartData, setChartData] = useState([]);

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
  
    const data = subsectorsData.filter((d) => d.sector === selectedSector)
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
    console.log(`Clicked on sector ${data.id}`);

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
            <div className="sectors-container">
            {sectorData.map((sector, index) => (
              <button
                key={`sector-${index}`}
                onClick={() => handleSectorClick(sector, index)}
              >
                {sector.sub_sector}
              </button>
            ))}
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