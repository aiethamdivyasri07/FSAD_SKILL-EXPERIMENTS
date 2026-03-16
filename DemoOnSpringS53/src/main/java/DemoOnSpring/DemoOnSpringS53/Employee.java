package DemoOnSpring.DemoOnSpringS53;

public class Employee {
int empId;
String empName;
double salary;
boolean active;
 
public Employee(int empId, String empName, double salary, boolean active) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
	this.active = active;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
@Override
public String toString() {
	return "Employee Id=" + empId + "\n " + 
           "Employee Name=" + empName + "\n" + 
		   "Employee salary=" + salary + "\n" +
           "Status of Active=" + active ;
}

}
