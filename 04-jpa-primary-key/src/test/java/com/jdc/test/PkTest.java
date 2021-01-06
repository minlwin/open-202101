package com.jdc.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.entity.Course;
import com.jdc.entity.Student;

class PkTest {
	
	static EntityManagerFactory EMF;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		EMF = Persistence.createEntityManagerFactory("primary-key");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		EMF.close();
	}

	@Test
	void test() {
		
		EntityManager em = EMF.createEntityManager();
		em.getTransaction().begin();
		
		Course c = new Course();
		c.setName("Java SE");
		em.persist(c);
		
		Student s = new Student();
		s.setName("Aung Aung");
		em.persist(s);
		
		em.getTransaction().commit();
	}

}
