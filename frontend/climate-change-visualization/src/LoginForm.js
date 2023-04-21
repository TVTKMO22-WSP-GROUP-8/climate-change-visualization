// src/LoginForm.js
import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router';
import './LoginForm.css';


function LoginForm({ onLogin, setUserToken }) {
  const [username, setUsername] = useState('root');
  const [password, setPassword] = useState('root');
  const navigate = useNavigate();

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://localhost:8080/api/user/login', {
        username,
        password,
      });

      if (response.status === 200) {
        console.log('Login successful');
        console.log('Response data:', response.data); // Added this line to check the response data
        const token = response.data.token; // Replace 'token' with the actual key holding the token in the response data
        setUserToken(token); // Update the token in the App.js state
        console.log('Token set:', token);
        onLogin(); // Set the isLoggedIn state to true in App.js
        navigate('/dashboard');
      } else {
        console.error('Login failed');
      }
    } catch (error) {
      if (error.response && error.response.status === 403) {
        alert("Wrong username or password");
      } else {
        console.error('Error during login:', error);
      }
    }
  };


  return (
    <form onSubmit={handleLogin} className="login-form">
      <label>
        Username:
        <input
          type="text"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />
      </label>
      <label>
        Password:
        <input
          type="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
      </label>
      <button type="submit">Login</button>
    </form>
  );

}

export default LoginForm;
