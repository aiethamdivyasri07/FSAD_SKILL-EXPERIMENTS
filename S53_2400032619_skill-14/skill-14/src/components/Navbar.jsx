import { Link, useNavigate } from "react-router-dom";

function Navbar() {
  const navigate = useNavigate();

  const logout = () => {
    localStorage.removeItem("userId");
    navigate("/");
  };

  return (
    <div>
      <Link to="/home">Home</Link> |{" "}
      <Link to="/profile">Profile</Link> |{" "}
      <button onClick={logout}>Logout</button>
    </div>
  );
}

export default Navbar;