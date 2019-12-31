package Exception_Handlings;

class Demo3{
	public void display() throws InterruptedException 
	{
		System.out.println("before");
		Thread.sleep(2000);
		System.out.println("after");
	}
}

public class Throw_demo {
	public static void main(String[] args) throws Exception {
		Demo3 d = new Demo3();
		d.display();
	}
}
