import React, { useState, useEffect } from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Routes, Link, Navigate } from 'react-router-dom';
import axiosInstance from './axiosInstance';
import LoginForm from './LoginForm';
import Register from './Register';
import Dashboard from './Dashboard';
import MainContent from './MainContent';

function App() {
  const [token, setToken] = useState(localStorage.getItem('token') || '');
  const [isLoggedIn, setIsLoggedIn] = useState(false);

	  const handleLogin = () => {
		setIsLoggedIn(true);
	  };

	  const handleRegisterSuccess = () => {
		setIsLoggedIn(false);
	  };

	  const setUserToken = (token) => {
		localStorage.setItem('token', token);
		setToken(token);
	  };

	  const handleLogout = () => {
		localStorage.removeItem('token');
		setToken('');
		setIsLoggedIn(false);
	  };

	  useEffect(() => {
		if (token) {
		  setIsLoggedIn(true);
		}
	  }, [token]);

  // Add the following code to intercept all API requests and add the Authorization header with the user token
  useEffect(() => {
    axiosInstance.interceptors.request.use(
      (config) => {
        const token = localStorage.getItem('token');
        if (token) {
          config.headers['Authorization'] = `Bearer ${token}`;
        }
        return config;
      },
      (error) => {
        return Promise.reject(error);
      }
    );
  }, []);

  return (
    <Router>
      <div className="App">
        <h1>Climate Change Data</h1>
        {isLoggedIn ? (
          <nav>
            <Link to="/dashboard">Dashboard</Link>
            <span> | </span>
            <button onClick={handleLogout}>Logout</button>
          </nav>
        ) : (
          <nav>
            <Link to="/login">Login</Link>
            <span> | </span>
            <Link to="/register">Register</Link>
          </nav>
        )}
        <Routes>
          <Route
            path="/login"
            element={
              isLoggedIn ? (
                <Navigate to="/dashboard" />
              ) : (
                <LoginForm onLogin={handleLogin} setUserToken={setUserToken} setIsLoggedIn={setIsLoggedIn} />
              )
            }
          />
          <Route
            path="/register"
            element={
              isLoggedIn ? (
                <Navigate to="/dashboard" />
              ) : (
                <Register onSuccess={handleRegisterSuccess} />
              )
            }
          />
          <Route
            path="/dashboard"
            element={
              isLoggedIn ? (
                <Dashboard token={token} />
              ) : (
                <Navigate to="/login" />
              )
            }
          />
          <Route
            path="/"
            exact
            element={<MainContent isLoggedIn={isLoggedIn} />}
          />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
