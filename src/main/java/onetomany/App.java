package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import onetoone.Student;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
        System.out.println( "Hello World!" );
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		Department dpt=new Department();
		dpt.setDname("IT");
		
		Employee emp=new Employee();
		emp.setEname("arjun");
		emp.setEaddress("gadag");
		emp.setEsalary("2000000");
		emp.setDepartment(dpt);
		
		Employee emp1=new Employee();
		emp1.setEname("arjun");
		emp1.setEaddress("gadag");
		emp1.setEsalary("2000000");
		emp1.setDepartment(dpt);
		
		List<Employee> listemployee=new ArrayList();

		listemployee.add(emp);
		listemployee.add(emp1);
		dpt.setEmployeelist(listemployee);
		
		session.save(dpt);
//		session.save(emp);
//		session.save(emp1);
		txn.commit();

	}

}
