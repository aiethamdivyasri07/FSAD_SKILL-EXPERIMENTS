import { useState } from "react";
import axios from "axios";

function Register() {
  const [user, setUser] = useState({
    username: "",
    email: "",
    password: ""
  });

  // handle input change
  const handleChange = (e) => {
    setUser({
      ...user,
      [e.target.name]: e.target.value
    });
  };

  // handle form submit
  const handleSubmit = async (e) => {
    e.preventDefault(); // 🔥 important

    console.log("Sending data:", user); // debug

    try {
      const response = await axios.post(
        "http://localhost:8080/api/register",
        user
      );

      console.log("Response:", response.data);
      alert("Registered Successfully ✅");

      // clear form
      setUser({
        username: "",
        email: "",
        password: ""
      });

    } catch (error) {
      console.error("Error:", error);
      alert("Registration Failed ❌");
    }
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h2>Register</h2>

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="username"
          placeholder="Enter Username"
          value={user.username}
          onChange={handleChange}
          required
        />
        <br /><br />

        <input
          type="email"
          name="email"
          placeholder="Enter Email"
          value={user.email}
          onChange={handleChange}
          required
        />
        <br /><br />

        <input
          type="password"
          name="password"
          placeholder="Enter Password"
          value={user.password}
          onChange={handleChange}
          required
        />
        <br /><br />

        <button type="submit">Register</button>
      </form>
    </div>
  );
}

export default Register;