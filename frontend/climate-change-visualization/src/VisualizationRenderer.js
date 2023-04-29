import React from 'react';
import V1 from './V1';
import V2 from './V2';
import V3 from './V3';
import V4 from './V4';
import V5 from './V5';

const VisualizationRenderer = ({ visualizations, isLoggedIn }) => {
  const visualizationComponents = {
    V1,
    V2,
    V3,
    V4,
    V5,
  };

  return (
    <div
      style={{
        display: 'flex',
        flexDirection: 'row',
        flexWrap: 'wrap',
      }}
    >
      {visualizations.map((visualization, index) => {
        const VisualizationComponent = visualizationComponents[visualization];
        return (
          <div key={index} style={{ flex: 1 }}>
            <VisualizationComponent isLoggedIn={isLoggedIn} />
          </div>
        );
      })}
    </div>
  );
};

export default VisualizationRenderer;
