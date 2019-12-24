package oops;

public class BlockDemo {
	W w = new W();
	{
		System.out.println("Instance block");
	}
	
	
	static 
	{
		System.out.println("Static block");
	}
	
	public BlockDemo() {
		System.out.println("Z cons");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main");
		new BlockDemo();
		new BlockDemo();
	}

}
