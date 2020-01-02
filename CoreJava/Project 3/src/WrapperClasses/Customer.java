package WrapperClasses;

public class Customer implements Comparable<Customer> {
	int customerid;
	String customerName;
	int salary;

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", salary=" + salary + "]\n";
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Customer(int customerid, String customerName, int salary) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.salary = salary;
	}

	@Override
	public int compareTo(Customer o) {
		if (this.salary > o.salary)
			return 1;
		else if (this.salary < o.salary)
			return -1;
		return 0;

	}

}
