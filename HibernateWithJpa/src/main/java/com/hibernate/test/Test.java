package com.hibernate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		EntityTransaction tx=null;
		try {
			// 1. Use to load driver, create connection, prepare Statement
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("StdDATA");
			System.out.println(emf.getClass().getName());
			
			// 2. Use to Perform Operation insert, update.....
			EntityManager em=emf.createEntityManager();
			System.out.println(em.getClass().getName());
			
			// 3. create Transaction
			tx=em.getTransaction();
			System.out.println(tx.getClass().getName());
			
			// 4. begin transaction
			tx.begin();
			
			// 5. save data to database
			Student std=new Student();
			std.setId("std101");
			std.setName("Mohit Kumar");
			std.setFee(200000);
			std.setCourse("MCA");
			em.persist(std);
			
			// 6. commit
			tx.commit();
			
			// 7. close
			emf.close();
		}
		catch(Exception e) {
			//8. rollback if any problem
			tx.rollback();
			e.printStackTrace();
		}

	}

}
