package inheritance;

class Order {

	int i;
	static {
		System.out.println("order class static block");
	}
	
	Order(){
		i = 10;
		System.out.println("Order class constructor "+ i);
		
	}

	{
		System.out.println("order class instance block "+i);
	}
}


class SubOrder extends Order{
	int j=9;
	static {
		System.out.println("suborder class static block");
	}
	SubOrder(){
		j = 15;
		System.out.println("suborder constr "+j);
	}
	
	{
		System.out.println("suborder class instance block "+j);
	}
	
	public static void main(String[] args) {
		new SubOrder();
	}
}