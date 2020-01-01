package Lesson3;

import java.util.HashSet;

public class Application {
	public static void main(String[] args) {
		HashSet<Animal> values = new HashSet<Animal>();
		
		Animal a1 = new Animal("dog", 12);
		Animal a2 = new Animal("Cat", 43);
		Animal a3 = new Animal("Bird", 4);
		Animal a4 = new Animal("dog", 12);
		Animal a5 = new Animal("Kangaroo", 8);
		
		values.add(a1);
		values.add(a2);
		values.add(a3);
		values.add(a4);
		values.add(a5);
		
		System.out.println(a1.equals(a4));
		
		System.out.println(a1.hashCode());
		System.out.println(a4.hashCode());
		
		for(Animal a: values)
			System.out.println(a);
	}

}
