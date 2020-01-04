package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Object[] calculator= {new Add(),new Sub(),new Mul(),new Div()};
		System.out.println("Enter\t1 for Add\n\t2 for Subtract\n\t3 for Multiply\n\t4 for Division");
		int choice=sc.nextInt();
		System.out.println("Enter 2 numbers one by one ");
		int num1=((Arithmetic) calculator[choice-1]).read();
		int num2=((Arithmetic) calculator[choice-1]).read();
		int result=((Arithmetic) calculator[choice-1]).calculate(num1, num2);
		((Arithmetic) calculator[choice-1]).display(result);
		
	}
}
