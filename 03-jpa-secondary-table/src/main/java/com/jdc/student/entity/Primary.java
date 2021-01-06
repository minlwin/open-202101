package com.jdc.student.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE1")
@SecondaryTables({
	@SecondaryTable(name = "TABLE2"),
	@SecondaryTable(name = "TABLE3")
})
public class Primary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String colOne;
	
	@Column(table = "TABLE2")
	private String colTwo;
	
	@Column(table = "TABLE3")
	private String colThree;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColOne() {
		return colOne;
	}

	public void setColOne(String colOne) {
		this.colOne = colOne;
	}

	public String getColTwo() {
		return colTwo;
	}

	public void setColTwo(String colTwo) {
		this.colTwo = colTwo;
	}

	public String getColThree() {
		return colThree;
	}

	public void setColThree(String colThree) {
		this.colThree = colThree;
	}

}
