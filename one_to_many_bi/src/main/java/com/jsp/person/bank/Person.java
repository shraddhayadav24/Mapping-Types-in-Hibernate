package com.jsp.person.bank;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private String address;
	
	@OneToMany(mappedBy="person", cascade=CascadeType.ALL)
	private List<BankAccount> accountes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<BankAccount> getAccountes() {
		return accountes;
	}

	public void setAccountes(List<BankAccount> accountes) {
		this.accountes = accountes;
	}
	
	
}
