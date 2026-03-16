package RestfulJPA.Controller;

import java.util.Optional;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestfulJPA.Model.Employee;
import RestfulJPA.Repository.EmpRepository;
@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/emp")
public class EmpController {
 @Autowired
 EmpRepository empRepository;
 @PostMapping("/save")
 public ResponseEntity<String> addEmployee(@RequestBody Employee e)
 {
  Employee ob = empRepository.save(e); //saves object e in database
  return ResponseEntity.ok("Data saved successfully");
 }
 @GetMapping("/{eid}")
 public ResponseEntity<Employee>getEmpById(@PathVariable int eid){
  
Optional<Employee> e = empRepository.findById(eid);
  if(e.isPresent()) {
   return ResponseEntity.ok(e.get());
  }
  else {
   return ResponseEntity.notFound().build();
  }
 }
 @GetMapping("/all")
 public List<Employee> getAllEmployee()
 {
  return empRepository.findAll();
 }
 //delete the employee
 @DeleteMapping("/{id}")
 public ResponseEntity<String> deleteEmployee(@PathVariable int eid){
  if(empRepository.existsById(eid))
  {
   empRepository.deleteById(eid);
   return ResponseEntity.ok("Record deleted successfully");
  }
  else {
   return ResponseEntity.ok("Record not available");
  }
 }

}