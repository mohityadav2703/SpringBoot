package com.app.maven.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.app.maven.entity.Employee;

public class TestOperation {
	public static void main(String[] args) {
		EntityTransaction tx=null;
		try {
			// 1.(Loads Driver,Creates DB Connections, Prepare stmt)
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");
			System.out.println(emf.getClass().getName());
			
			//2. (TODO Operations--insert,update,...)
			EntityManager em=emf.createEntityManager();
			System.out.println(em.getClass().getName());
			
			//3. (Create Transaction)
			tx=em.getTransaction();
			System.out.println(tx.getClass().getName());
			
			//4. (Start Transaction)
			tx.begin();
			
			//5. (Perform Operation)
			//Save data into DB
			Employee emp=new Employee();
			emp.setEmpId(10);
			emp.setEmpName("Mohit Kumar");
			emp.setEmpSal(150000.00);
			em.persist(emp); //sql insert into ....
			
			//6. (commit)
			tx.commit();
			
			//7. (close)
			emf.close();
		}
		catch(Exception e) {
			//rollback if any problem
			tx.rollback();
			e.printStackTrace();
		}
	}

}