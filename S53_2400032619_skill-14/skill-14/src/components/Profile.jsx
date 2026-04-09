import { useEffect, useState } from "react";
import axios from "axios";
import Navbar from "./Navbar.jsx";

export default function Profile() {
  const [user, setUser] = useState({});

  useEffect(() => {
    const id = localStorage.getItem("userId");

    if (id) {
      axios
        .get(`http://localhost:8080/api/users/${id}`)
        .then((res) => setUser(res.data))
        .catch((err) => console.log(err));
    }
  }, []);

  return (
    <div>
      <Navbar />
      <h2>Profile Page</h2>
      <p>Username: {user?.username}</p>
      <p>Email: {user?.email}</p>
    </div>
  );
}