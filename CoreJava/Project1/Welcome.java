import finanace.*;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to eclipse!");
		
		Bye b = new Bye();
		b.sayThanks();
		
		Apple a = new Apple();
		a.sayApple();
		
		Deloitte d = new Deloitte();
		d.sayDeloitte();
		
		Salary s = new Salary();
		
		int sal = s.calSal(34232, 2023420);
		System.out.println(sal);
		
//		https://bit.ly/2scwC1F
	}

}
