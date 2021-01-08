package com.jdc.life;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class SecurityListener {

	@PrePersist
	private void prePersist(Object obj) {
		
		if(obj instanceof SecureEntity) {
			SecureEntity sec = (SecureEntity) obj;
			sec.getSecurity().setCreation(LocalDateTime.now());
		}
		
	}
	
	@PreUpdate
	private void preUpdate(Object obj) {
		
		if(obj instanceof SecureEntity) {
			SecureEntity sec = (SecureEntity) obj;
			sec.getSecurity().setModification(LocalDateTime.now());
		}
	}
}
