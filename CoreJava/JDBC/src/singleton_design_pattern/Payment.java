package singleton_design_pattern;

public class Payment {

	private static Payment payment = new Payment();

	private Payment() {
		System.out.println("payment memory allocated");
	}

	public static Payment getPaymentObject() {
		return payment;
	}

	public void pay(int amount) {
		System.out.println("Payment done for INR " + amount);
	}
}
