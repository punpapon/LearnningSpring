package com.code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.hibernate.demo.entity.Instructor;
import com.code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.springdemo.mvc.Student;

public class CreateDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Student.class)
							.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Instructor tempInstructor = new Instructor("Chad","Darby","darvy@cwac.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("www.xxx.com","Luv 2 code");
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			System.out.println("SAVE :" + tempInstructor);
			
			session.beginTransaction();
			session.save(tempInstructor);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			factory.close();
		}
	}

}
