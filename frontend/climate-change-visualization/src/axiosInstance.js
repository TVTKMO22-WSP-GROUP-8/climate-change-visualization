// axiosInstance.js
import axios from 'axios';

const axiosInstance = axios.create({
  baseURL: 'http://localhost:8080',
  headers: {
    'Content-Type': 'application/json',
  },
});

axiosInstance.interceptors.request.use(
  (config) => {
    // Retrieve your hardcoded token or the token from the user's session (recommended)
    const token = '/dOW4m1F2pafIC4eViVX62tkwdntfW0/WceUkuR095nOH58chb1v510o6mOT6kdN+XY5TJCLwEh0hlkpIVs9wA==';
    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
  },
  (error) => Promise.reject(error)
);
export const getUserInfo = async () => {
  try {
    const response = await axiosInstance.get('/api/user/userinfo');
    return response.data;
  } catch (error) {
    console.error('Error fetching user info:', error);
    return null;
  }
};

export default axiosInstance;
