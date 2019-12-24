package inheritance;

class Animal {
	
	public Animal() {
		System.out.println("Animal constr");
	}
	
	public Animal(String aniName) {
		System.out.println("Animal cons called "+aniName);
	}

}


class Dog extends Animal {
	public Dog() {
		System.out.println("Animal constr");
	}
	
	public Dog(String aniName) {
		System.out.println("Animal cons called "+aniName);
	}

}


public class inherit 
{
	public static void main(String[] args) {
		Dog d = new Dog();
		Dog d2 = new Dog("Tom");
	}
}