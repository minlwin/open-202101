package com.jdc.test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.AttributeOverrides;

@Entity
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String name;
	private Address address;
	
	@AttributeOverrides({ 
		@AttributeOverride(name = "name", column = @Column(name = "father_name")),
		@AttributeOverride(name = "job", column = @Column(name = "father_job")) 
	})
	private Parent father;

	@AttributeOverrides({ 
		@AttributeOverride(name = "name", column = @Column(name = "mother_name")),
		@AttributeOverride(name = "job", column = @Column(name = "mother_job")) 
	})
	private Parent mother;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Parent getFather() {
		return father;
	}

	public void setFather(Parent father) {
		this.father = father;
	}

	public Parent getMother() {
		return mother;
	}

	public void setMother(Parent mother) {
		this.mother = mother;
	}

}
