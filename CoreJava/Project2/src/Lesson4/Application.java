package Lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {
	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();

		hs.add(new Employee("Mike", 3500, "Accounting"));
		hs.add(new Employee("Paul", 3500, "Admin"));
		hs.add(new Employee("Peter", 3500, "IT"));
		hs.add(new Employee("Angel", 3500, "Maint"));

		ArrayList<Employee> list1 = new ArrayList<Employee>(hs);

		Collections.sort(list1);
		System.out.println(list1);

	}
}
