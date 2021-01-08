package com.jdc.collections;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private LocalDate certifiedDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getCertifiedDate() {
		return certifiedDate;
	}

	public void setCertifiedDate(LocalDate certifiedDate) {
		this.certifiedDate = certifiedDate;
	}

}
