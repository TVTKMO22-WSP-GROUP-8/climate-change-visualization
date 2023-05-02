import React from 'react';
import V1 from './V1';
import V2 from './V2';
import V3 from './V3';
import V4 from './V4';
import V5 from './V5';

const VisualizationRenderer = ({ visualization, chartData }) => {
  switch (visualization) {
    case 'V1':
      return <V1 data={chartData.globalAnnual} />;
    case 'V2':
      return <V2 data={chartData.globalMonthly} />;
    case 'V3':
      return <V3 data={chartData.northernHemisphereAnnual} />;
    case 'V4':
      return <V4 data={chartData.northernHemisphereMonthly} />;
    case 'V5':
      return <V5 data={chartData.southernHemisphereAnnual} />;
    default:
      return null;
  }
};

export default VisualizationRenderer;
