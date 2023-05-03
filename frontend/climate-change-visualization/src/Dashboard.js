import React, { useState, useEffect } from 'react';
import V1 from './V1';
import V2 from './V2';
import V3 from './V3';
import V4 from './V4';
import V5 from './V5';
import UserManagement from './UserManagement';
import axiosInstance, { getUserInfo } from './axiosInstance';

const Dashboard = () => {
  const [user, setUser] = useState(null);
  const [bgImage, setBgImage] = useState('');
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [selectedVisualizations, setSelectedVisualizations] = useState([]);
  const [showVisualizations, setShowVisualizations] = useState(false);
  const [bgColor, setBgColor] = useState('#ffffff');

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

  // New event handler for file input change
  const handleFileChange = (event) => {
    const file = event.target.files[0];
    if (file) {
      const reader = new FileReader();
      reader.onloadend = () => {
        setBgImage(reader.result);
      };
      reader.readAsDataURL(file);
    }
  };

  const handleButtonClick = () => {
    setShowVisualizations(true);
  };
  function UserInfo() {
    const [userInfo, setUserInfo] = useState(null);

    useEffect(() => {
      fetchUserInfo();
    }, []);

    const fetchUserInfo = async () => {
      if (isLoggedIn) {
        const userInfo = await getUserInfo();
        setUser(userInfo);
      }
    };
    
    useEffect(() => {
      if (isLoggedIn) {
        getUserInfo()
          .then((response) => {
            setUser(response.data);
            console.log('User Info:', response.data);
          })
          .catch((error) => {
            console.error('Error fetching user info:', error);
          });
      }
    }, [isLoggedIn]);
  }

  return (
    <div>
      {isLoggedIn ? (
        <>
        {user && (
            <div>
              <h2>Welcome, {user.firstName} {user.lastName}!</h2>
              <p>Email: {user.email}</p>
              <p>Phone: {user.phone}</p>
              <p>Gender: {user.gender}</p>
            </div>
          )}
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
  
          {/* Add the input element for selecting a file */}
          <div>
            <label htmlFor="bgImage">Choose background image:</label>
            <input
              type="file"
              id="bgImage"
              name="bgImage"
              accept="image/*"
              onChange={handleFileChange}
            />
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
                const VisualizationComponent =
                  visualizationComponents[visualization];
                return (
                  <div key={index} style={{ flex: 1 }}>
                    <VisualizationComponent isLoggedIn={isLoggedIn} />
                  </div>
                );
              })}
            </div>
          )}
  
          {/* Change this div to set the background image */}
          <div style={{ backgroundImage: `url(${bgImage})` }}>
            {/* ... */}
          </div>
        </>
      ) : (
        <p>Please log in to view your visualizations.</p>
      )}
    </div>
  );
};
  export default Dashboard;
  