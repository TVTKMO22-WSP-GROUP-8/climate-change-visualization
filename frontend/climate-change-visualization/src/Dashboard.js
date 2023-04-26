// src/Dashboard.js
import React, { useState, useEffect } from "react";
import CreateView from "./CreateView"; // Import the CreateView component
import axiosInstance from './axiosInstance';


const Dashboard = () => {
  const [data, setData] = useState([]);
  const [views, setViews] = useState([]); // Declare views and setViews

  const token = localStorage.getItem("token");
	const fetchData = async () => {
	  try {
		const token = localStorage.getItem("token"); // Get the token from local storage

		const response = await axiosInstance.get("/data", {
		  headers: {
		'Authorization': 'Bearer /dOW4m1F2pafIC4eViVX62tkwdntfW0/WceUkuR095nOH58chb1v510o6mOT6kdN+XY5TJCLwEh0hlkpIVs9wA==',
        'Content-Type': 'application/json'
		  },
		});

		setData(response.data);
		console.log("Fetched data:", response.data);
	  } catch (error) {
		console.error("Error fetching data:", error);
	  }
	};


  useEffect(() => {
    fetchData();
  }, []);

  const handleDeleteView = async (id) => {
    try {
      const response = await axiosInstance.delete(`/api/visualization/${id}`);
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
      <CreateView onNewView={handleNewView} />
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
