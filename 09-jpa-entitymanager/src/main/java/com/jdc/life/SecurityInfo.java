package com.jdc.life;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

@Embeddable
public class SecurityInfo {

	private LocalDateTime creation;
	private LocalDateTime modification;

	public LocalDateTime getCreation() {
		return creation;
	}

	public void setCreation(LocalDateTime creation) {
		this.creation = creation;
	}

	public LocalDateTime getModification() {
		return modification;
	}

	public void setModification(LocalDateTime modification) {
		this.modification = modification;
	}

}
