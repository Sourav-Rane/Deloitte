package WrapperClasses;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if ((o1.getCustomerName().compareTo(o2.getCustomerName())) > 0)
			return 0;
		return -1;
	}

}
