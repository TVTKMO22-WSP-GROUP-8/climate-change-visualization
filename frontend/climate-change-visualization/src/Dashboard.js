// src/Dashboard.js
import React, { useState, useEffect } from "react";
import CreateView from "./CreateView"; // Import the CreateView component
import axios from 'axios';


const Dashboard = ({ userApi }) => {
  const [data, setData] = useState([]);
  const [views, setViews] = useState([]); // Declare views and setViews

	const fetchData = async () => {
	  try {
		const token = localStorage.getItem("token");
		const response = await axios.get("http://localhost:8080/api/data", {
		  headers: {
			Authorization: token,
		  },
		});
		setData(response.data);
	  } catch (error) {
		console.error("Error fetching data:", error);
	  }
	};

  useEffect(() => {
    fetchData();
  }, []);

  const handleDeleteView = async (id) => {
    try {
      const response = await userApi.delete(`/api/visualization/${id}`);
      console.log('View deleted:', response.data);
      setViews(views.filter((view) => view.id !== id));
    } catch (error) {
      console.error('Error while deleting the view:', error);
    }
  };

  const handleNewView = (newView) => {
    setViews([...views, newView]);
  };

  return (
    <div>
      <h2>Dashboard</h2>
      <CreateView userApi={userApi} onNewView={handleNewView} />
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
