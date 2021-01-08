package com.jdc.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jdc.cascade.Course;
import com.jdc.cascade.Student;

class CascadeTest {
	
	static EntityManagerFactory EMF;
	EntityManager em;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		EMF = Persistence.createEntityManagerFactory("10-jpa-cascade");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		EMF.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = EMF.createEntityManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@Test
	void test1() {
		em.getTransaction().begin();
		
		Course c = new Course();
		c.setName("Java Basic");
		c.setFees(200000);
		
		em.persist(c);
		
		Student s = new Student();
		s.setName("Aung Aung");
		s.getCourses().add(c);
		
		em.persist(s);
		
		em.getTransaction().commit();
	}
	
	@Test
	void test2() {
		Course c = em.find(Course.class, 1);
		assertNotNull(c);
		
		Student s = em.find(Student.class, 1);
		assertNotNull(s);
	}

}
