package singleton_design_pattern;

public class Bank {
	public static void main(String[] args) {
		Payment payment1 = Payment.getPaymentObject();
		payment1.pay(1000);

		Payment payment2 = Payment.getPaymentObject();
		payment2.pay(200);

		Payment payment3 = Payment.getPaymentObject();
		payment3.pay(400);

	}
}
