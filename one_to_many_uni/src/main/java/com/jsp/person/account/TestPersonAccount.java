package com.jsp.person.account;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonAccount {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Person person= new Person();
	person.setName("shivani");
	person.setEmail("shiv@mail.com");
	person.setCno(34567890);
	
	
	Account account1 =new Account();
	account1.setBank_name("HDFC");
	account1.setIfsc_code("hdfc123");
	account1.setAccno(123456);
	
	Account account2 =new Account();
	account2.setBank_name("BOI");
	account2.setIfsc_code("boi5467");
	account2.setAccno(6963245);
	
	
	Account account3 =new Account();
	account3.setBank_name("SBI");
	account3.setIfsc_code("sbi8670");
	account3.setAccno(12345);
	
	
	ArrayList<Account> accounts=new ArrayList<Account>();
	accounts.add(account3);
	accounts.add(account2);
	accounts.add(account1);
	
	//SET A PERSON WITH MULTIPLE BANK ACCOUNTS
	person.setAccounts(accounts);
		
	
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(account1);
	entityManager.persist(account2);
	entityManager.persist(account3);
	entityTransaction.commit();
}
}
