package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {
	public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		//create person object
		Person person=new Person();
		person.setName("shivani");
		person.setEmail("shivani@mail.com");
		person.setCno(2376950);
		
		
		//create pan object
		Pan pan=new Pan();
		pan.setAddress("MUMBAI");
		
		//setting pan with the specified person
		pan.setPerson(person);
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
        entityTransaction.commit();		
		
	}
}
