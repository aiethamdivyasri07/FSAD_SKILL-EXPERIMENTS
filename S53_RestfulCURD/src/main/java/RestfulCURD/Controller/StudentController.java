package RestfulCURD.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestfulCURD.Model.Student;

@RestController
@RequestMapping("/students")

public class StudentController {
	@GetMapping("/{id}")
	public Student getData(@PathVariable int id) {
		Student s=new Student();
		s.setId(32619);
		s.setName("Divya");
		s.setCgpa(9.16);
		s.setDropout(true);
		return s;    //the output will be displayed in browser in Json format
	}
	//to perform create operation 
	@PostMapping("/add")
public String addStudent(@RequestBody Student s) {
	return "Data added: \n"+ "Student Id= "+s.getId() + "\n"
+ "Student Name : "+s.getName() + "\n" 
			+ "Student cgpa:"+s.getCgpa() + "\n"
+ "Student dropout status : " +s.isDropout(); 
}
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id) {
		return ResponseEntity.ok("Student data " +id +"deleted");
	}
	@PutMapping("/update/{name}")
	public String updateStudent(@PathVariable String name,@RequestBody Student s) {
		s.setName(name);
		return "Student Id " + s.getId() + "\n"+
	           "Student Name updated" +s.getName() + "\n" +
			   "Student CGPA" +s.getCgpa() + "\n"+
	           "Student dropout Status" +s.isDropout();
	}
}
