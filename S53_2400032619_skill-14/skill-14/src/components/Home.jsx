import { useEffect } from "react";
import { useNavigate } from "react-router-dom";
import Navbar from "./Navbar.jsx";

export default function Home() {
  const navigate = useNavigate();

  useEffect(() => {
    if (!localStorage.getItem("userId")) {
      navigate("/");
    }
  }, []);

  return (
    <div>
      <Navbar />
      <h2>Home Page</h2>
    </div>
  );
}