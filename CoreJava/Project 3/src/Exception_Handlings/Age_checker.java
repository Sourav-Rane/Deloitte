package Exception_Handlings;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
}


class NewYearParty{
	int eligibleAge = 16;
	Scanner sc = new Scanner(System.in);
	int age;
	
	public void enterClub() throws InvalidAgeException {
		System.out.println("enter your age nibbaa ");
		age = sc.nextInt();
		if(age < eligibleAge) {
			throw new InvalidAgeException("get out noob");
		}else {
			System.out.println("Come pls come womens and mens");
		}
	}
	
}

public class Age_checker {
	public static void main(String[] args) {
		NewYearParty party = new NewYearParty();
		try {
			party.enterClub();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
