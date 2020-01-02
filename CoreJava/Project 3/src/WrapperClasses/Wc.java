package WrapperClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Wc {
	public static void main(String[] args) {

		List<Customer> c = new ArrayList<Customer>();

		c.add(new Customer(101, "Sourav", 12344));
		c.add(new Customer(104, "Abhisshek", 1644));
		c.add(new Customer(103, "Sandeep", 344));
		c.add(new Customer(102, "subarna", 1244));

		Iterator<Customer> ci = c.iterator();

//		while (ci.hasNext()) {
//			Customer str = ci.next();
//			System.out.println(str);
//		}

		Collections.sort(c);

		ci = c.iterator();

		while (ci.hasNext()) {
			Customer str = ci.next();
			System.out.println(str);
		}

		System.out.println("Sort on 1) Id 2) Name 3) Salary ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		if (choice == 3) {
			System.out.println("Salary");
			Collections.sort(c);
			System.out.println(c);

		}

		if (choice == 2) {
			Collections.sort(c, new NameComparator());
			System.out.println("Name");
			System.out.println(c);

		}

		if (choice == 1) {
			System.out.println("ID");
			Collections.sort(c, new Comparator<Customer>() {

				public int compare(Customer o1, Customer o2) {
					if (o1.getCustomerid() >= o2.getCustomerid())
						return 0;
					return -1;
				}
			});
			System.out.println(c);

		}

//		System.out.println(c);
//		
//		
//		Set<String> names = new LinkedHashSet<String>();
//	
//		
//		names.add("jay");
//		names.add("Veeru");
//		names.add("Neha");
//		names.add("Spring");
//	
//		Iterator<String> it = names.iterator();
//		
//		while(it.hasNext()) {
//			String str = it.next();
//			if(!str.equals("Neha"))
//				System.out.println(str);
//		}
//		
//		System.out.println(names);
//		

		// iterator

	}
}
