package demo;

import java.util.Scanner;

public class Demo1 {

	public void swap() {
		Scanner sc = new Scanner(System.in);
		int a , b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("a and b before : "+a+" "+b);
		
		int t;
		t = a;
		a = b;
		b = t;
		
		System.out.println("a and b after : "+a+" "+b);
	}
	
	
	public void check() {
		System.out.println("Enter your year");
		Scanner sc = new Scanner(System.in);
		 int y = sc.nextInt();
		if((y%4==0) &&(y%100!=0) || (y%400==0) )
			System.out.println("Leap year");
		else
			System.out.println("Not a Leap year");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d = new Demo1();
		d.swap();
		d.check();
		
	}

}
