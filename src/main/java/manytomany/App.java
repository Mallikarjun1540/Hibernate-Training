package manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
        System.out.println( "Hello World!" );
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		
		Employee1 emp=new Employee1();
		emp.setEname("arjun");
		emp.setEaddress("gadag");
		emp.setEsalary("100000");
		
		Employee1 emp1=new Employee1();
		emp1.setEname("aj");
		emp1.setEaddress("gadag");
		emp1.setEsalary("200000");
		
		Project pro=new Project();
		pro.setPname("JAVA");
	
		Project pro1=new Project();
		pro1.setPname("PYTHON");
		
		Project pro2=new Project();
		pro2.setPname("AWS");
		
		List<Project> projectlist=new ArrayList<Project>();
		projectlist.add(pro);
		projectlist.add(pro1);
		projectlist.add(pro2);
		
		List<Employee1> emplist=new ArrayList<Employee1>();
		emplist.add(emp);
		emplist.add(emp1);
	
		emp.setProjectlist(projectlist);
		emp1.setProjectlist(projectlist);
		
		pro.setEmplist(emplist);
		pro1.setEmplist(emplist);
		pro2.setEmplist(emplist);
		
		session.save(emp);
		session.save(emp1);
		
		txn.commit();
		
	
	
		
		
		
	}

}
