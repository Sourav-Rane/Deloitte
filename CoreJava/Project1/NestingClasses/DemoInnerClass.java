package NestingClasses;



interface ChangePass {
	void doChange();
}


class ChangePasswordImpl implements ChangePass{
	@Override
	public void doChange() {
		System.out.println("password changed");
	}
}



 
public class DemoInnerClass {
	
	public static void main(String[] args) {
		ChangePass p = new ChangePasswordImpl();
		p.doChange();
	}

	
}
