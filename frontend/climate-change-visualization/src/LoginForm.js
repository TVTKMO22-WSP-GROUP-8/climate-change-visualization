import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";

const LoginForm = () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
  const [loading, setLoading] = useState(false);
  const navigate = useNavigate();

  const handleLogin = async () => {
    setLoading(true);
    try {
      const response = await axios.post("/api/user/login", { username, password });
      console.log("Full response:", response);
      console.log("Login successful");
      const token = response.headers.authorization.substring(7); // Extract the token without "Bearer "
      console.log("Token set:", token);
      localStorage.setItem("authToken", token);
      setLoading(false);
      navigate("/dashboard");
    } catch (error) {
      console.error("Error logging in:", error);
      setError("Invalid username or password");
      setLoading(false);
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
