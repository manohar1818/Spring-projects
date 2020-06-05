package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		
        Laptop laptop = new Laptop();
        laptop.setId(101);
        laptop.setLname("Dell");
        
        Student student = new Student();
        student.setRollno(1);
        student.setName("manohar");
        student.setMarks(90);
        student.getLaptop().add(laptop);
        
        laptop.setStudent(student);
        
        // .getLaptop gets arraylist , later u can add to the arraylist

        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(laptop);
        session.save(student);
        tx.commit();		
	}

}
