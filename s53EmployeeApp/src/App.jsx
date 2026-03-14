import { useEffect, useState } from 'react'
const App=()=> {
//Here actual logic code will be written
const [employees,setEmployees]=useState([]);
const [empid, setEmpid] = useState("");
  const [ename, setEname] = useState("");
  const [salary, setSalary] = useState("");
  const [empActive, setEmpActive] = useState(false)
  const [searchId,setSearchId] = useState("");
    const [foundEmployee,setFoundEmployee] = useState(null);
  
// ==========================
// GET-EmployeeBy ID
// ==========================
const getEmpById=()=>{
  fetch('http://localhost:8081/emp/$(searchId}')
  .then(response=>{
    if(!response.ok) {
      throw new Error("Employee not found");
    }
    return response.json();
  })
  .then(data=>{
    setFoundEmployee(data);
  })
  .catch
}
 // ============================
  // POST - To Save Employee Data
  // ============================
   const saveEmployee = () => {
    const employeeData = {
      empid: parseInt(empid),
      ename: ename,
      salary: parseFloat(salary),
      empActive: empActive
    }
    fetch("http://localhost:8081/emp/save",{
      method:"POST",
      headers:{
        "Content-Type":"application/json"
      },
      body:JSON.stringify(employeeData)
    })
    .then(response => response.text())
    .then(data => {
      alert(data);
      // Refresh the employee list after saving
      return fetch("http://localhost:8081/emp/all");
    })
    .then(response => response.json())
    .then(message => { alert(message); clearForm();})
    .catch(error => console.log(error));    
  }

  // =========================
  // Clear Form
  // =========================
  const clearForm = () => {
    setEmpid("");
    setEname("");
    setSalary("");
    setEmpActive(false);
  };
useEffect(()=>{
  fetch("http://localhost:8081/emp/all")
  .then(response=>response.json())
  .then(data=>setEmployees(data))
  .catch(error=>console.log(error))
},[]);
  return (
    <div style={{ padding: "20px" }}>

  <h2>Enter Employee data to save in MySQL </h2> 
<input type="number" placeholder="Employee ID"
        value={empid}
        onChange={e => setEmpid(e.target.value)}
      /><br /><br /> 
<input type="text" placeholder="Employee Name" value={ename} 
onChange={e => setEname(e.target.value)} /><br /><br />
<input type="number" placeholder="Employee Salary" value={salary}
onChange={e => setSalary(e.target.value)} /><br /><br />
<label>
  Employee Active Status:
  <input type="checkbox" checked={empActive} 
  onChange={e => setEmpActive(e.target.checked)} />
</label>
<button onClick={saveEmployee}>Save Employee</button>
<br /><br />  


       <h1> Get All Employees Data</h1>
      <table border="1" cellPadding="10">
       <thead>
        <tr>
          <th>Employee ID</th>
          <th>Employee Name</th>
          <th>Employee Salary</th>
          <th>Employee Active Status</th>
        </tr>
       </thead> 
       <tbody>
        {
          employees.map(i=>(
            <tr key={i.empid}>
              <td>{i.empid}</td>
              <td>{i.ename}</td>
              <td>{i.salary}</td>
              <td>{i.empActive ? "Active" : "Inactive"}</td>
            </tr>
          ))
        }
       </tbody>
        </table>
   
    
  </div>
  )
}

export default App