package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student s1=new Student();
	s1.setName("shivani");
	
	Student s2=new Student();
	s2.setName("shraddha");
	
	Student s3=new Student();
	s3.setName("shardul");
	
	Student s4=new Student();
	s4.setName("Jb");
	
	Course c1=new Course();
	c1.setName("WEBTECH");
	c1.setDuration(1);
	
	Course c2=new Course();
	c2.setName("JAVA");
	c2.setDuration(1);
	
	Course c3=new Course();
	c3.setName("SQL");
	c3.setDuration(1);
	
	ArrayList<Course> course=new ArrayList<Course>();
	course.add(c1);
	course.add(c2);
	course.add(c3);
	
	ArrayList<Student> student=new ArrayList<Student>();
	student.add(s1);
	student.add(s2);
	student.add(s3);
	student.add(s4);
	
	s1.setCourses(course);
	s2.setCourses(course);
	s3.setCourses(course);
	s4.setCourses(course);
	
	c1.setStudents(student);
	c2.setStudents(student);
	c3.setStudents(student);
	
	
	entityTransaction.begin();
	entityManager.persist(s1);
	entityManager.persist(s2);
	entityManager.persist(s3);
	entityManager.persist(s4);
	entityTransaction.commit();

	
}
}
