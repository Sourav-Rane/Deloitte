package Exception_Handlings;

import java.util.InputMismatchException;
import java.util.Scanner;

class demo2{
	
	 int num1 , num2;
	 int result;
	 Scanner sc = new Scanner(System.in);
	 
	 public void display() {
		 try {
			 num1 = sc.nextInt();
			 num2 = sc.nextInt();
			 System.out.println(num1/num2);
			 
		} catch (InputMismatchException e) {
			System.out.println("enter number maen ");
		}
		 
		 catch (ArithmeticException e) {
			System.out.println("dont divide by 0 ");
		}
	 }
}



public class Excep {
	
	
	public static void main(String[] args) {
		demo2 d = new demo2();
		d.display();
		

	}

}
