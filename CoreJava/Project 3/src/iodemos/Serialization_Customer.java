package iodemos;

import java.io.Serializable;
import java.util.Scanner;

public class Serialization_Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7747547365012436975L;
	private int customerid;
	private String customerName;
	private String customerAddress;
	private transient int billAmount;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer id : ");
		customerid = scanner.nextInt();
		System.out.println("Enter customer name : ");
		customerName = scanner.next();
		System.out.println("Enter customer address : ");
		customerAddress = scanner.next();
		System.out.println("Enter bill amount : ");
		billAmount = scanner.nextInt();
	}

	@Override
	public String toString() {
		return "Serialization_Customer [customerid=" + customerid + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", billAmount=" + billAmount + "]";
	}

}
