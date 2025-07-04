package com.training.booking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavePropertyResponse {

	private long propertyId;

	private String response;

	public long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	

}
