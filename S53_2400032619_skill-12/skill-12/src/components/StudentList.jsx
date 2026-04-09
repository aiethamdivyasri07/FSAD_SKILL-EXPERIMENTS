import { useEffect, useState } from "react";
import { getStudents, deleteStudent } from "../services/studentService";

function StudentList({ onEdit }) {
  const [students, setStudents] = useState([]);

  const fetchData = () => {
    getStudents().then((res) => setStudents(res.data));
  };

  useEffect(() => {
    fetchData();
  }, []);

  const handleDelete = (id) => {
    deleteStudent(id).then(() => fetchData());
  };

  return (
    <div>
      <h2>Students</h2>

      <table border="1">
        <thead>
          <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Course</th>
            <th>Actions</th>
          </tr>
        </thead>

        <tbody>
          {students.map((s) => (
            <tr key={s.id}>
              <td>{s.name}</td>
              <td>{s.email}</td>
              <td>{s.course}</td>
              <td>
                <button onClick={() => onEdit(s)}>Edit</button>
                <button onClick={() => handleDelete(s.id)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default StudentList;