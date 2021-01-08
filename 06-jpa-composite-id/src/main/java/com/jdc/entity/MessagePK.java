package com.jdc.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class MessagePK implements Serializable{

	private static final long serialVersionUID = 1L;

	private LocalDate sendDate;
	private int serialNum;

	public LocalDate getSendDate() {
		return sendDate;
	}

	public void setSendDate(LocalDate sendDate) {
		this.sendDate = sendDate;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sendDate == null) ? 0 : sendDate.hashCode());
		result = prime * result + serialNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessagePK other = (MessagePK) obj;
		if (sendDate == null) {
			if (other.sendDate != null)
				return false;
		} else if (!sendDate.equals(other.sendDate))
			return false;
		if (serialNum != other.serialNum)
			return false;
		return true;
	}

}
