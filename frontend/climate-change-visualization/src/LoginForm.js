// src/LoginForm.js
import React, { useState } from 'react';
import axiosInstance from './axiosInstance';
import { useAuth } from './AuthContext';
import './LoginForm.css';

function LoginForm() {
  const [username, setUsername] = useState('root');
  const [password, setPassword] = useState('root');
  const [error, setError] = useState('');
  const { setIsLoggedIn, setToken } = useAuth();

  const handleLogin = async (e) => {
    e.preventDefault();

    try {
      const response = await axiosInstance.post("/api/user/login", {
        username,
        password,
      });

      console.log("Login successful");
      console.log("Response data: ", response.data);
      console.log("Response headers: ", response.headers);

      const token = response.headers.authorization;

      localStorage.setItem("token", token);
      setToken(token);
      setIsLoggedIn(true);
      setError('');
    } catch (error) {
      console.error("Login error:", error);
      setError('Invalid username or password');
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
      {error && <div className="error">{error}</div>}
    </form>
  );
}

export default LoginForm;
