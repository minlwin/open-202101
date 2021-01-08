package com.jdc.collections;

import javax.persistence.Entity;

@Entity
public class Member extends Account{

	private static final long serialVersionUID = 1L;
	
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
