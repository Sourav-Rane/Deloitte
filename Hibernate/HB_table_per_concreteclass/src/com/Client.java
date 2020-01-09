package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String args[]) {

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		
	

		Transaction tx = session.beginTransaction();
//		Employee employee = new Employee(1223,"Sundhi");
//		session.save(employee);
		
		
		RegularEmployee employeeReg = new RegularEmployee(41000,8908);
		employeeReg.setEmployeeid(1224);
		employeeReg.setEmployeeName("Arjun");
		session.save(employeeReg);

		
		ContractEmployee employeeCon = new ContractEmployee(20,15000);
//		employeeCon.setEmployeeid(1225);
//		employeeCon.setEmployeeName("Tufail");
//		session.save(employeeCon);
		
		
		tx.commit();
		session.close();
		System.out.println("Details saved!!");
		factory.close();

	}
}
