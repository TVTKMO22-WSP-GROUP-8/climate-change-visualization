import React, { useState, useEffect } from 'react';
import axiosInstance from './axiosInstance';

function UserManagement() {
	const [users, setUsers] = useState([]); // Replace this with your actual users data
	const [newUsername, setNewUsername] = useState('');

	
	const handleAddUser = (e) => {
		e.preventDefault();
	};
	useEffect(() => {
	  fetchUsers();
	}, []);

	const fetchUsers = async () => {
	  try {
		const response = await axiosInstance.get('/api/users');
		setUsers(response.data);
	  } catch (error) {
		console.error('Error fetching users:', error);
	  }
	};

	const deleteUser = async (userId) => {
	  try {
		await axiosInstance.delete(`/api/users/${userId}`);
		fetchUsers();
	  } catch (error) {
		console.error('Error deleting user:', error);
	  }
	};

	const addUser = async (newUser) => {
	  try {
		await axiosInstance.post('/api/users', newUser);
		fetchUsers();
	  } catch (error) {
		console.error('Error adding user:', error);
	  }
	};

	return (
		<div>
		  {/* Table for displaying user list */}
		  <table>
			<thead>
			  <tr>
				<th>ID</th>
				<th>Username</th>
				<th>Email</th>
				<th>Phone</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gender</th>
				<th>Action</th>
			  </tr>
			</thead>
			<tbody>
			  {users.map((user) => (
				<tr key={user.id}>
				  <td>{user.id}</td>
				  <td>{user.username}</td>
				  <td>{user.email}</td>
				  <td>{user.phone}</td>
				  <td>{user.firstName}</td>
				  <td>{user.lastName}</td>
				  <td>{user.gender}</td>
				  <td>
					<button onClick={() => deleteUser(user.id)}>Delete</button>
				  </td>
				</tr>
			  ))}
			</tbody>
		  </table>
	  
		  {/* Form for adding new users */}
		  <form onSubmit={handleAddUser}>
			<input
			  type="text"
			  placeholder="Username"
			  value={newUsername}
			  onChange={(e) => setNewUsername(e.target.value)}
			/>
			{/* Additional input fields for email, phone, first name, last name, and gender */}
			{/* ... */}
			<button type="submit">Add User</button>
		  </form>
		</div>
	  );
}
export default UserManagement;
