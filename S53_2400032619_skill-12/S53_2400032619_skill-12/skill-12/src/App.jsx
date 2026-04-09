import { useState } from "react";
import StudentList from "./components/StudentList";
import AddStudent from "./components/AddStudent";

function App() {
  const [selectedStudent, setSelectedStudent] = useState(null);
  const [refresh, setRefresh] = useState(false);

  const reload = () => {
    setRefresh(!refresh);
    setSelectedStudent(null);
  };

  return (
    <div>
      <h1>Student Management System</h1>

      <AddStudent selectedStudent={selectedStudent} reload={reload} />

      <StudentList key={refresh} onEdit={setSelectedStudent} />
    </div>
  );
}

export default App;