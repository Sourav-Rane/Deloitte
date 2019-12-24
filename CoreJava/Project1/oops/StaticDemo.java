package oops;

public class StaticDemo {

	int num1 = 10;
	static int num2 = 20;

	void change() {
		num2++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo d1 = new StaticDemo();
		StaticDemo d2 = new StaticDemo();
		
		d1.change();
		
		System.out.println(d1.num1);
		System.out.println(d1.num2);
		System.out.println(num2);
		System.out.println(d2.num2);
	}

}
