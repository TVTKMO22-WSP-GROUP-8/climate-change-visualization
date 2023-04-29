import React, { createContext, useContext, useState, useEffect } from 'react';

const AuthContext = createContext();

export const useAuth = () => {
  return useContext(AuthContext);
};

export const AuthProvider = ({ children }) => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  useEffect(() => {
    const token = localStorage.getItem('token');
    if (token) {
      setIsLoggedIn(true);
    }
  }, []);

  const setToken = (token) => {
    localStorage.setItem('token', token);
    setIsLoggedIn(true);
  };

  const removeToken = () => {
    localStorage.removeItem('token');
    setIsLoggedIn(false);
  };

  const value = {
    isLoggedIn,
    setIsLoggedIn,
    setToken,
    removeToken, // Add this line
  };

  return <AuthContext.Provider value={value}>{children}</AuthContext.Provider>;
};
