package oops;

public class Employee {
	public int empId;
	public String empName;
	public String empAddress;
	public int salary;
	
	public void takeSalary(int empId2, String empName2, String empAddress2, int salary2) {
		empId = empId2;
		empName = empName2;
		empAddress =empAddress2;
		salary = salary2;				
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
	
	public void printEmployeeDetails() {
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee empName : "+empName);
		System.out.println("Employee empAddress : "+empAddress);
		System.out.println("Employee salary : "+salary);	
	}
}
 