package NestingClasses;


interface ChangePass1 {
	void doChange();
}


public class Anonymous_Class {
	public static void main(String[] args) {
		ChangePass1 c = new ChangePass1() {

			@Override
			public void doChange() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	
}
