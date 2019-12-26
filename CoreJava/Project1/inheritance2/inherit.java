package inheritance2;


class Animal {
	public final int UPPER_AGE = 120;
	
	public void eat() {
		System.out.println("Animal eats");
	}
}


class Dog extends Animal{
	public void eat() {
//		super.eat();
		System.out.println("Dog eats");
	}
}


class Cat extends Animal{
	public void eat() {
		System.out.println("Cat eats");
	}
}


public class inherit {
	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.eat();
		a = new Cat();
		a.eat();
		
		
		
	}
}


