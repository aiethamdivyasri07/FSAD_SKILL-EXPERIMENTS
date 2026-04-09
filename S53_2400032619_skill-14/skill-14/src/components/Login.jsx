import { useState } from "react";
import axios from "axios";
import { useNavigate, Link } from "react-router-dom";

export default function Login() {
  const [data, setData] = useState({ username: "", password: "" });
  const navigate = useNavigate();

  const handleLogin = async () => {
    try {
      const res = await axios.post(
        "http://localhost:8080/api/users/login",
        data
      );

      localStorage.setItem("userId", res.data.id);
      navigate("/home");
    } catch {
      alert("Invalid Credentials");
    }
  };

  return (
    <div>
      <h2>Login</h2>

      <input
        placeholder="Username"
        onChange={(e) => setData({ ...data, username: e.target.value })}
      />

      <input
        type="password"
        placeholder="Password"
        onChange={(e) => setData({ ...data, password: e.target.value })}
      />

      <br />

      <button onClick={handleLogin}>Login</button>

      <p>
        New user? <Link to="/register">Register</Link>
      </p>
    </div>
  );
}