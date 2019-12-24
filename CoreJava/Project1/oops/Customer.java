package oops;

public class Customer {

		public int customerId ;
		public String customerName;
		public String customerAddr;
		public int billAmount = 1000;
		
		public Customer() {
			customerId = 1001;
			customerAddr = "NA";
			customerName = "NA";
			billAmount = 500;
			System.out.println("Created ! ");
		}
		
		

		public void billDetails() {
			System.out.println(customerName);
			System.out.println(customerId);
			System.out.println(customerAddr);
			System.out.println(billAmount);
		}
		
	
		public Customer(int customerId, String customerName) {
			this(); // this line calls first the default constructor
			this.customerId = customerId;
			this.customerName = customerName;
		}



		public Customer(int customerId, String customerName, String customerAddr, int billAmount) {
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerAddr = customerAddr;
			this.billAmount = billAmount;
		}
		
		public static void main(String[] args) {
				Customer c1 = new Customer();
				c1.billDetails();
				
				Customer c2 = new Customer(1001, "Mohan" ,"Pune", 20202);
				c2.billDetails();
				
				
				
	
		}


}
