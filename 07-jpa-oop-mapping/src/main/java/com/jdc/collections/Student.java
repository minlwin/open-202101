package com.jdc.collections;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;

@Entity
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String name;
	@CollectionTable(name = "hobbies")
	@ElementCollection
	private Set<String> hobbies;
	@CollectionTable(name = "certificates")
	@ElementCollection
	private List<Certificate> certificates;
	
	@CollectionTable(name = "others")
	@MapKeyColumn(name = "title")
	@ElementCollection
	private Map<String, String> others;

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

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public Map<String, String> getOthers() {
		return others;
	}

	public void setOthers(Map<String, String> others) {
		this.others = others;
	}

}
