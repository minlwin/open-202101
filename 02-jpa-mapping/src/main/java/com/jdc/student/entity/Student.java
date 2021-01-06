package com.jdc.student.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "MST_STUDENT")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String name;
	@Column(name = "education")
	@Enumerated(EnumType.STRING)
	private Education lastEducation;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String phone;
	private String email;
	@Lob
	private String remark;

	@Transient
	private boolean selected;

	public enum Education {
		BEHS, College, Mater, Others
	}

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

	public Education getLastEducation() {
		return lastEducation;
	}

	public void setLastEducation(Education lastEducation) {
		this.lastEducation = lastEducation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
