package DemoOnSpring.DemoOnSpringS53;

import java.util.List;

public class Employees {
int empId;
String empName;
double empSalary;
boolean empActive;
List<String> empList;

//generate setter and getter methods
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
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public boolean isEmpActive() {
	return empActive;
}
public void setEmpActive(boolean empActive) {
	this.empActive = empActive;
}
public List<String> getEmpList() {
	return empList;
}
public void setEmpList(List<String> empList) {
	this.empList = empList;
}

//generate toString() method to display the output
@Override
public String toString() {
	return "Employee Id=" + empId + "\n" + 
			"Employee Name=" + empName + "\n" +
			"Employee Salary=" + empSalary + "\n" +
			"EmpActive=" + empActive + "\n" +
			 "Employee skill List=" + empList;
}
void displaysEmpDetails() {
	System.out.println("Employee Id=" + empId);
	System.out.println("Employee Name=" + empName);
	System.out.println("Employee Salary=" + empSalary);
	System.out.println("Employee Active=" + empActive);
	System.out.println("Employee Skill List=" + empList);
	
}


}
