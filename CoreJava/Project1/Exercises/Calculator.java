package Exercises;

public class Calculator {

	
	
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	
	public void add(double x, double y) {
		System.out.println(x+y);
	}
	
	public void add(int x, double y) {
		System.out.println(x+y);
	}
	
	public void add(double x, int y) {
		System.out.println(x+y);
	}
	
	
	
	
	
	public void mul(int x, int y) {
		System.out.println(x+y);
	}
	
	public void mul(double x, double y) {
		System.out.println(x*y);
	}
	
	public void mul(int x, double y) {
		System.out.println(x*y);
	}
	
	public void mul(double x, int y) {
		System.out.println(x*y);
	}
	
	
	
	
	
	
	
	public void div(int x, int y) {
		System.out.println(x/y);
	}
	
	public void div(double x, double y) {
		System.out.println(x/y);
	}
	
	public void div(int x, double y) {
		System.out.println(x/y);
	}
	
	public void div(double x, int y) {
		System.out.println(x/y);
	}
	
	
	
	
	
	
	public void sub(int x, int y) {
		System.out.println(x-y);
	}
	
	public void sub(double x, double y) {
		System.out.println(x-y);
	}
	
	public void sub(int x, double y) {
		System.out.println(x-y);
	}
	
	public void sub(double x, int y) {
		System.out.println(x-y);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		c.add(4, 5);
		c.add(4.5, 4);
		c.add(4, 5.5);
		c.add(4.5, 5.5);
		
		c.mul(4, 5);
		c.mul(4.5, 4);
		c.mul(4, 5.5);
		c.mul(4.5, 5.5);
		
		c.div(4, 5);
		c.div(4.5, 4);
		c.div(4, 5.5);
		c.div(4.5, 5.5);
		
		c.sub(4, 5);
		c.sub(4.5, 4);
		c.sub(4, 5.5);
		c.sub(4.5, 5.5);
	}

}
