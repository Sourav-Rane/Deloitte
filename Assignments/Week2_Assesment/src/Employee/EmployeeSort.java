package Employee;

import java.util.Comparator;

public class EmployeeSort implements Comparator<EmployeeVo> {

	

	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		int itax= (int)o2.getIncometax()-(int)o1.getIncometax();
		if(itax >0) {
			return 1;
		}
		else if(itax==0) {
			return 0;
		}
		else if(itax<0) {
			return -1;
		}
		return 0;
	}
}
