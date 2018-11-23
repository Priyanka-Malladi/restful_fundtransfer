package com.cg.springRESTful.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;

public class JPAManager {

	public static EntityManager createEntityManager(){
		System.out.println("Entity....");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		return em;
	}
	
	public static void closeResources(EntityManager em){
		em.close();
		
	}

	
	

}
