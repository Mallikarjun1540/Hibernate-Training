package onetoone;

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
		Student std=new Student();
		//std.setSid(1);
		std.setSname("arjun");
		std.setSage("23");
		std.setSemail("arjun@gmail.com");
		
		
		Course c=new Course();
		//c.setCid(2);
		c.setCname("MCA");
		c.setCduration("2 years");
		c.setStudent(std);
		
		std.setCourse(c);
		
		session.save(std);
		session.save(c);
		txn.commit();

	}

}
