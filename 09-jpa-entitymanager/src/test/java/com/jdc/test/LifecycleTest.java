package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jdc.life.Course;

class LifecycleTest {
	
	static EntityManagerFactory EMF;
	
	EntityManager em;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		EMF = Persistence.createEntityManagerFactory("09-jpa-entitymanager");
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
		Course course = new Course();
		course.setName("Java Basic");
		em.persist(course);
		
		em.detach(course);
		
		course.setFees(200000);
		course.setContents(List.of("Language Fundamentals", "OOP", "API", "JDBC"));
		course.setTags(List.of("Basic", "Entrance"));
		
		em.merge(course);
		
		em.getTransaction().commit();
	}
	
	@Test
	void test2() {
		
		Course c = em.find(Course.class, 1);
		assertNotNull(c);
		assertEquals("Java Basic", c.getName());
		assertEquals(200000, c.getFees());
		
		em.clear();
		
		for(String str : c.getContents()) {
			System.out.println(str);
		}
	}
	
	@Test
	void test3() {
		em.getTransaction().begin();
		em.remove(em.find(Course.class, 1));
		em.getTransaction().commit();
	}

	@Test
	void test4() {
		Course c = em.find(Course.class, 1);
		assertNull(c);
	}
}
