// src/LoginForm.js
import React, { useState } from 'react';
import axiosInstance from './axiosInstance';
import { useNavigate } from "react-router-dom";
import './LoginForm.css';

function LoginForm({ onLogin, setUserToken,setIsLoggedIn }) {
  const [username, setUsername] = useState('root');
  const [password, setPassword] = useState('root');
  const navigate = useNavigate();

	const handleLogin = async (e) => {
	  e.preventDefault();

	  try {
		const response = await axiosInstance.post("/user/login", {
		  username,
		  password,
		});

		console.log("Login successful");
		console.log("Response data: ", response.data);
		console.log("Response headers: ", response.headers);

		const token = response.headers.authorization;
		console.log("Token set: ", token);

		localStorage.setItem("token", token);
		setIsLoggedIn(true);
	  } catch (error) {
		console.error("Login error:", error);
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
