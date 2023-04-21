import React, { useState } from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Routes, Link, Navigate } from 'react-router-dom';
import LoginForm from './LoginForm';
import Register from './Register';
import Dashboard from './Dashboard';
import CreateView from './CreateView';
import MainContent from './MainContent';

function App() {
  const [token, setToken] = useState('');
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleRegisterSuccess = () => {
    setIsLoggedIn(false);
  };

  return (
    <Router>
      <div className="App">
        <h1>Climate Change Data</h1>
        {!isLoggedIn && (
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
                <LoginForm onLogin={handleLogin} setUserToken={setToken} />
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
            element={isLoggedIn ? <Dashboard token={token} /> : <Navigate to="/login" />}
          />
          <Route
            path="/createview"
            element={isLoggedIn ? <CreateView /> : <Navigate to="/login" />}
          />
          <Route
            path="/"
            exact
            element={<MainContent isLoggedIn={isLoggedIn} token={token} />}
          />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
