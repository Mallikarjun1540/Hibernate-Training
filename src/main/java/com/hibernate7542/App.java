package com.hibernate7542;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate7542.entity.StudentEntity;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
        System.out.println( "Hello World!" );
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		  StudentEntity obj=new StudentEntity();
		  
		  Criteria cr=session.createCriteria(StudentEntity.class);
		  
		  //cr.addOrder(Order.desc("studentName"));
		  //cr.addOrder(Order.asc("studentName"));
		 
//		  cr.setFirstResult(1);
//		  cr.setMaxResults(3);
		  
		  
		  
		  //cr.add(Restrictions.ge("studentId",3));
		  
		//cr.setProjection(Projections.rowCount());
		
//		 cr.setProjection(Projections.avg("studentId"));
		  cr.setProjection(Projections.countDistinct("studentName"));
		  List<StudentEntity> studentlist=cr.list();
		  System.out.println(studentlist.get(0));
//		  for(StudentEntity sl:studentlist)
//		  {
//			  System.out.println(sl);
//		  }
//		  
		  
		//  Query query= session.createQuery("from StudentEntity as s where s.studentId=:id");
		 // Query query= session.createQuery("from StudentEntity as s where s.studentId=?1");
		 // Query query= session.createQuery("update StudentEntity as s set s.studentAddress=:add  where s.studentId=:id");
		 // Query query= session.createQuery("delete StudentEntity as s where s.studentId=:id");
//	  query.setFirstResult(0);
//		  query.setMaxResults(2);
		
		  //query.setParameter("id",2);
		  
//		  int c=query.executeUpdate();
//		  if(c>0)
//		  {
//			  System.out.println(c);
//		  }
//		  else
//		  {
//			  System.out.println("not updated");
//		  }
		
//		  obj.setStudentId(1);
//		 obj.setStudentName("Arjun"); 
//		 obj.setStudentEmail("arjun@gmail.com");
//		 obj.setStudentContact("852014796"); 
//		 obj.setStudentAddress("Gadag");
//		 session.save(obj);
//		  txn.commit();
//		  
		  
		 
    }
}
