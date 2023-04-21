// src/CreateView.js
import React, { useState } from 'react';
import axios from 'axios';
import './CreateView.css';

function CreateView({ token, onNewView }) {
  const [urlIdentifier, setUrlIdentifier] = useState('');
  const [layout, setLayout] = useState('');
  const [description, setDescription] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post(
        'http://localhost:8080/api/visualization/create',
        { urlIdentifier, layout, description },
        {
          headers: { Authorization: `Bearer ${token}` }, // Use the token prop
        }
      );
      onNewView(response.data); // Call onNewView prop with the created view data
    } catch (error) {
      console.error('Error while creating view:', error);
    }
  };

  return (
    <div>
      <h2>Create Visualization View</h2>
      <form onSubmit={handleSubmit}>
        <label>
          URL Identifier:
          <input type="text" value={urlIdentifier} onChange={(e) => setUrlIdentifier(e.target.value)} />
        </label>
        <label>
          Layout:
          <select value={layout} onChange={(e) => setLayout(e.target.value)}>
            <option value="">Select a layout</option>
            <option value="single-column">Single Column</option>
            <option value="two-columns">Two Columns</option>
          </select>
        </label>
        <label>
          Description:
          <textarea value={description} onChange={(e) => setDescription(e.target.value)} />
        </label>
        <button type="submit">Create</button>
      </form>
    </div>
  );
}

export default CreateView;
