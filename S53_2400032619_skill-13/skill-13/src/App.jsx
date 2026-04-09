import { useEffect, useState } from "react";

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("/api/message")   
      .then((res) => res.text())
      .then((data) => setMessage(data))
      .catch((err) => console.error("Error fetching API:", err));
  }, []);

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>Full Stack Application</h1>
      <h2>{message}</h2>
    </div>
  );
}

export default App;