import React, { useState, useEffect } from "react";
import axios from "axios";
import CreateView from "./CreateView"; // Import the CreateView component

const Dashboard = () => {
  const [data, setData] = useState([]);
  const [views, setViews] = useState([]); // Declare views and setViews
  const token = localStorage.getItem("token"); 
  const fetchData = async () => {
    try {
      const token = localStorage.getItem("token");
      console.log("Token in Dashboard:", token);
      const response = await axios.get("/api/visualization/visualizations", {
        headers: {
          Authorization: `Bearer ${token}`,
        },
      });
      setData(response.data);
      setViews(response.data); // Set views with the fetched data
    } catch (error) {
      console.log("Error fetching data:", error);
    }
  };

  useEffect(() => {
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

  const handleNewView = (newView) => {
    setViews([...views, newView]);
  };

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
