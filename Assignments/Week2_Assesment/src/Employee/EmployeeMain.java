package Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		long empid;
		String empname;
		double annualincome , incometax;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Employees:");
		int n = sc.nextInt();
		EmployeeBo EB = new EmployeeBo();
		EmployeeVo[] allEmployees = new EmployeeVo[n];
		
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter Emp details ");
			empid = sc.nextLong();
			empname = sc.next();
			annualincome = sc.nextDouble();
			incometax = 0;
			allEmployees[i] = new EmployeeVo(empid, empname, annualincome, incometax);
		}
		
		
		System.out.println("DETAILS OF ALL THE EMPLOYEES");
		for (EmployeeVo emp : allEmployees) {
			EB.calincomeTax(emp);
			System.out.println(emp);
		}
		
		
		
		System.out.println("SORTED ORDER OF EMPLOYEES");
		List<EmployeeVo> sortedlist = Arrays.asList(allEmployees);
		Collections.sort(sortedlist, new EmployeeSort());
		System.out.println(sortedlist);
	}

}
