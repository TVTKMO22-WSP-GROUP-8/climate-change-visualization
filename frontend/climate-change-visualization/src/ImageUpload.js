import React, { useState } from 'react';
import axios from 'axios';

function ImageUpload() {
  const [imageFile, setImageFile] = useState(null);
  const [imageData, setImageData] = useState(null);

  const handleFileInputChange = (event) => {
    const file = event.target.files[0];
    setImageFile(file);

    const reader = new FileReader();

    reader.readAsDataURL(file);

    reader.onloadend = () => {
      setImageData(reader.result);
    };
  };

  const handleSubmit = async (event) => {
    event.preventDefault();

    const response = await axios.post('/api/upload-image', {
      imageData,
    });

    console.log(response.data);
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input type="file" onChange={handleFileInputChange} />
        <button type="submit">Upload</button>
      </form>
    </div>
  );
}

export default ImageUpload;
