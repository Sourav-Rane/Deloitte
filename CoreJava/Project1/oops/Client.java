package oops;

import java.util.Scanner;

public class Client {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int empId = sc.nextInt();
			String empName = sc.next();
			String empAddress = sc.next();
			int salary = sc.nextInt();
			
			
			
			Employee e = new Employee();
			
			e.takeSalary( empId,empName,empAddress,salary);
			e.printEmployeeDetails();
		}
}
