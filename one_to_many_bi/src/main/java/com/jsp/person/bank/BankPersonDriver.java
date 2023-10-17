package com.jsp.person.bank;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankPersonDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
	     EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("shivani");
		person.setAddress("nehrul");
		
		BankAccount b1=new BankAccount();
		b1.setIfsc("1234567");
		
		BankAccount b2=new BankAccount();
		b2.setIfsc("1234567");
		
		BankAccount b3=new BankAccount();
		b3.setIfsc("1234567");
		
		BankAccount b4=new BankAccount();
		b4.setIfsc("1234567");
		
		List<BankAccount> accountes=new ArrayList<BankAccount>();
		accountes.add(b1);
		accountes.add(b2);
		accountes.add(b3);
		accountes.add(b4);
		
		person.setAccountes(accountes);
		
		b1.setPerson(person);
		b2.setPerson(person);
		b3.setPerson(person);
		b4.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
		
		
		
	}

}
