package demo;

import java.util.Scanner;

public class Leap_Year {
	public void check_LP() {
		System.out.println("Enter your year");
		Scanner sc = new Scanner(System.in);
		 int y = sc.nextInt();
		if((y%4==0) &&(y%100!=0) || (y%400==0) )
			System.out.println("Leap year");
		else
			System.out.println("Not a Leap year");
		sc.close();
	}
}
