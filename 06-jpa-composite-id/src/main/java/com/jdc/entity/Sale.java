package com.jdc.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Sale implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalePK pk;
	
	private int total;

	public SalePK getPk() {
		return pk;
	}

	public void setPk(SalePK pk) {
		this.pk = pk;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
