import React, { useState, useEffect } from 'react';
import V1 from './V1';
import V2 from './V2';
import V3 from './V3';
import V4 from './V4';
import V5 from './V5';

const Dashboard = () => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [selectedVisualizations, setSelectedVisualizations] = useState([]);
  const [showVisualizations, setShowVisualizations] = useState(false);
  const handleVisualizationChange = (event) => {
    const { value, checked } = event.target;
    if (checked) {
      setSelectedVisualizations([...selectedVisualizations, value]);
    } else {
      setSelectedVisualizations(selectedVisualizations.filter((v) => v !== value));
    }
  };
	const visualizationComponents = {
	  V1,
	  V2,
	  V3,
	  V4,
	  V5,
	};
  const checkLoginStatus = () => {
    const token = localStorage.getItem('token');
    if (token) {
      setIsLoggedIn(true);
    } else {
      setIsLoggedIn(false);
    }
  };

  useEffect(() => {
    checkLoginStatus();
  }, []);

  const handleCheckboxChange = (e) => {
    const { value, checked } = e.target;
    if (checked) {
      setSelectedVisualizations([...selectedVisualizations, value]);
    } else {
      setSelectedVisualizations(selectedVisualizations.filter((v) => v !== value));
    }
  };

  const handleButtonClick = () => {
    setShowVisualizations(true);
  };

   return (
    <div>
      {/* ... */}
      {isLoggedIn ? (
        <>
          <div>
            <h3>Select Visualizations:</h3>
            <label>
              <input
                type="checkbox"
                value="V1"
                onChange={handleVisualizationChange}
              />{' '}
              V1
            </label>
            <label>
              <input
                type="checkbox"
                value="V2"
                onChange={handleVisualizationChange}
              />{' '}
              V2
            </label>
            <label>
              <input
                type="checkbox"
                value="V3"
                onChange={handleVisualizationChange}
              />{' '}
              V3
            </label>
            <label>
              <input
                type="checkbox"
                value="V4"
                onChange={handleVisualizationChange}
              />{' '}
              V4
            </label>
            <label>
              <input
                type="checkbox"
                value="V5"
                onChange={handleVisualizationChange}
              />{' '}
              V5
            </label>
          </div>
          <button onClick={() => setShowVisualizations(true)}>View</button>
          {showVisualizations && (
            <div
              style={{
                display: 'flex',
                flexDirection: 'row',
                flexWrap: 'wrap',
              }}
            >
              {selectedVisualizations.map((visualization, index) => {
                const VisualizationComponent = visualizationComponents[visualization];
                return (
                  <div key={index} style={{ flex: 1 }}>
                    <VisualizationComponent isLoggedIn={isLoggedIn} />
                  </div>
                );
              })}
            </div>
          )}
        </>
      ) : (
        <p>Please log in to view your visualizations.</p>
      )}
    </div>
  );
};

export default Dashboard;