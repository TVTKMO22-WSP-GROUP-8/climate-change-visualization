import React, { useState, useEffect } from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Routes, Link, Navigate } from 'react-router-dom';
import axiosInstance from './axiosInstance';
import LoginForm from './LoginForm';
import Register from './Register';
import Dashboard from './Dashboard';
import V1 from './V1';
import V2 from './V2';
import V3 from './V3';
import V4 from './V4';
import V5 from './V5';
import { AuthProvider, useAuth } from './AuthContext';

function App() {
  const { isLoggedIn, setIsLoggedIn, setToken, removeToken } = useAuth();

  useEffect(() => {
    const token = localStorage.getItem("token");
    if (token) {
      axiosInstance.defaults.headers.common["Authorization"] = `Bearer ${token}`;
    } else {
      delete axiosInstance.defaults.headers.common["Authorization"];
    }
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
                <LoginForm />
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
            element={<V1 isLoggedIn={isLoggedIn} />}
          />
          <Route
            path="/V2"
            element={<V2 isLoggedIn={isLoggedIn} />}
          />
          <Route
            path="/V3"
            element={<V3 isLoggedIn={isLoggedIn} />}
          />
          <Route
            path="/V4"
            element={<V4 isLoggedIn={isLoggedIn} />}
          />
          <Route
            path="/V5"
            element={<V5 isLoggedIn={isLoggedIn} />}
          />
        </Routes>
      </div>
    </Router>
  );
  
}

export default App;
