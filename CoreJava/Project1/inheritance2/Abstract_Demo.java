package inheritance2;

abstract class Animal_ab{
	
	public abstract void makeNoise();
	public abstract void eat();
	
	public void sleep() {
		System.out.println("Animal Sleeps");
	}
	
//	public abstract void roam();
	public void roam() {
		System.out.println("Animal roam");
	}
	
}



abstract class Feline extends Animal_ab{
	
	@Override
	public void roam() {
		System.out.println("Feline roaming");
	}
	
}


class Catt extends Feline {
	
	
	@Override
	public void makeNoise() {
		System.out.println("Cat making noise");
	}
	
	
	@Override
	public void eat(){
			System.out.println("cat eating");
	}
	
}


class Lion extends Feline {
	
	
	@Override
	public void makeNoise() {
		System.out.println("Lion making noise");
	}
	
	
	@Override
	public void eat(){
			System.out.println("Lion eating");
	}
}



class Tiger extends Feline {
	
	
	@Override
	public void makeNoise() {
		System.out.println("Tiger making noise");
	}
	
	
	@Override
	public void eat(){
			System.out.println("Tiger eating");
	}
}



class Hippo extends Animal_ab{
	
	
	@Override
	public void makeNoise() {
		System.out.println("Hippo making noise");
	}
	
	
	@Override
	public void eat(){
			System.out.println("Hippo eating");
	}
}


abstract class Canine extends Animal_ab {
	
	public void roam() {
		System.out.println("Canine roams");
	}
}



class Dogg extends Canine{
	
	
	@Override
	public void makeNoise() {
		System.out.println("Dogg making noise");
	}
	
	
	@Override
	public void eat(){
			System.out.println("Dogg eating");
	}
	
}



class Wolf extends Canine{
	
	
	@Override
	public void makeNoise() {
		System.out.println("Wolf making noise");
	}
	
	
	@Override
	public void eat(){
			System.out.println("Wolf eating");
	}
	
}








public class Abstract_Demo {

	public static void main(String[] args) {
		Catt c = new Catt();
		c.roam();
	}
}
