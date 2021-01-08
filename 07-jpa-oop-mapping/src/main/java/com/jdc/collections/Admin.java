package com.jdc.collections;

import javax.persistence.Entity;

@Entity
public class Admin extends Account {

	private static final long serialVersionUID = 1L;

	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
