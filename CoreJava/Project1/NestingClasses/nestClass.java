package NestingClasses;


class ChangePassword{
	static String password = "pass@123";
	 static class EncrpytPassword{
		int passwordlevel = 5;
		public void doEncrypt() {
			System.out.println("The password is "+password);
		}
	}
}


public class nestClass {
	public static void main(String[] args) {
//		if class is default
//		ChangePassword pa = new ChangePassword();
//		ChangePassword.EncrpytPassword e = pa.new EncrpytPassword();
//		e.doEncrypt();
//		
		
		
		
//		if class is static
//		ChangePassword.EncrpytPassword pa = new ChangePassword.EncrpytPassword();
//		pa.doEncrypt();
		
		
		
		
	}
}
