import React, { useState, useEffect } from 'react';
import CreateView from './CreateView';
import axios from 'axios';
import './Dashboard.css';

function Dashboard({token}) {
	console.log('Token in Dashboard:', token);
	const [views, setViews] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
		console.log(token); // Add this line to log the token value
		const response = await axios.get('http://localhost:8080/api/visualization/visualizations', {
		  headers: { Authorization: `Bearer ${token}` },
		});
        setViews(response.data);
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };

    fetchData();
  }, [token]);

  const handleDeleteView = async (id) => {
    try {
      const response = await axios.delete(`http://localhost:8080/api/visualization/${id}`, {
        headers: { Authorization: `Bearer ${token}` },
      });
      console.log('View deleted:', response.data);
      setViews(views.filter((view) => view.id !== id));
    } catch (error) {
      console.error('Error while deleting the view:', error);
    }
  };
	// Add this function in the Dashboard component
	const handleNewView = (newView) => {
	  setViews([...views, newView]);
	};

	// Pass the handleNewView function to the CreateView component
	<CreateView token={token} onNewView={handleNewView} />
  return (
    <div>
      <h2>Dashboard</h2>
      <CreateView token={token} onNewView={handleNewView} />
      <h3>Your Visualization Views:</h3>
      <ul>
        {views.map((view) => (
          <li key={view.id}>
            {view.urlIdentifier} - {view.layout} - {view.description}
            <ul>
              {view.datasets.map((dataset) => (
                <li key={dataset.id}>{dataset.name}</li>
              ))}
            </ul>
            <button onClick={() => handleDeleteView(view.id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}
export default Dashboard;