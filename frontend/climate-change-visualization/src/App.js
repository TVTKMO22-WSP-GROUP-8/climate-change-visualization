import React, { useState, useEffect } from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Routes, Link, Navigate } from 'react-router-dom';
import axiosInstance from './axiosInstance';
import LoginForm from './LoginForm';
import Register from './Register';
import Dashboard from './Dashboard';
import MainContent from './MainContent';
import { AuthProvider, useAuth } from './AuthContext';

function App() {
  const { isLoggedIn, setIsLoggedIn, setToken, removeToken } = useAuth();

	useEffect(() => {
	  const interceptor = axiosInstance.interceptors.request.use(
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

	  return () => {
		axiosInstance.interceptors.request.eject(interceptor);
	  };
	}, [isLoggedIn]);


  return (
    <Router>
      <div className="App">
        <h1>Climate Change Data</h1>
        {isLoggedIn ? (
          <nav>
            <Link to="/dashboard">Dashboard</Link>
            <span> | </span>
            <button onClick={removeToken}>Logout</button>
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
                <LoginForm onLogin={() => setIsLoggedIn(true)} setUserToken={setToken} />
              )
            }
          />
          <Route
            path="/register"
            element={
              isLoggedIn ? (
                <Navigate to="/dashboard" />
              ) : (
                <Register onSuccess={() => setIsLoggedIn(false)} />
              )
            }
          />
          <Route
            path="/dashboard"
            element={
              isLoggedIn ? (
                <Dashboard />
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
