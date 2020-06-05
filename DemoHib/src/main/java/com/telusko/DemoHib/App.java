package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * This is used to create and insert values to tables;
        Alien telusko = new Alien();
        telusko.setAid(105);
        telusko.setAname("manohar");
        telusko.setColor("brown");
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(telusko);
        tx.commit();
        */
    	
    	/*
    	
    	Alien telusko = null ;   // this is just used to create object.
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        telusko = (Alien)session.get(Alien.class, 104);
        
        //session.save(telusko);
        tx.commit();
        System.out.println(telusko);
        
        */
    	
    	
    	AlienName alienname = new AlienName();
    	alienname.setFname("Gangidi");
    	alienname.setMname("Manohar");
    	alienname.setLname("Reddy");
        Alien telusko = new Alien();
        telusko.setAid(105);
        telusko.setAname(alienname);
        telusko.setColor("brown");
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(telusko);
        tx.commit();
    	

    	
    }
}
