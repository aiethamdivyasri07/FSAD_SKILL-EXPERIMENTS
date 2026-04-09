import { useState, useEffect } from "react";
import { addStudent, updateStudent } from "../services/studentService";

function AddStudent({ selectedStudent, reload }) {
  const [student, setStudent] = useState({
    name: "",
    email: "",
    course: "",
  });

  useEffect(() => {
    if (selectedStudent) setStudent(selectedStudent);
  }, [selectedStudent]);

  const handleChange = (e) => {
    setStudent({ ...student, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (student.id) {
      updateStudent(student.id, student).then(() => reload());
    } else {
      addStudent(student).then(() => reload());
    }

    setStudent({ name: "", email: "", course: "" });
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>{student.id ? "Update Student" : "Add Student"}</h2>

      <input
        name="name"
        placeholder="Name"
        value={student.name}
        onChange={handleChange}
        required
      />

      <input
        name="email"
        placeholder="Email"
        value={student.email}
        onChange={handleChange}
        required
      />

      <input
        name="course"
        placeholder="Course"
        value={student.course}
        onChange={handleChange}
        required
      />

      <br />

      <button type="submit">
        {student.id ? "Update" : "Add"}
      </button>
    </form>
  );
}

export default AddStudent;