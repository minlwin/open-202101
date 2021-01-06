package com.jdc.hello.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Member {

	private String name;
	@Id
	private String loginId;
	private String password;
}
