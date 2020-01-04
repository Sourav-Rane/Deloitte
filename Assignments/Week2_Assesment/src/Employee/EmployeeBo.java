package Employee;


public class EmployeeBo {

	public void calincomeTax(EmployeeVo e) {
		
		double a=e.getAnnualincome();
		if(a<250000) {
			e.setIncometax(0);
		}
		else if(a<=500000)
		{
			e.setIncometax(0.2*a);
		}
		else
		{
			e.setIncometax(0.3*a);
		}
		
		
	}
}
