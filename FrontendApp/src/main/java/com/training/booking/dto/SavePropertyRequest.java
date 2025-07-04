package com.training.booking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavePropertyRequest {
	private long propertyId;

	private String propertyTitle;

	private String location;

	private String propertyTypeId;

	private String city;

	private String pincode;

	private String state;

	private String createdDate;

	public long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyTitle() {
		return propertyTitle;
	}

	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPropertyTypeId() {
		return propertyTypeId;
	}

	public void setPropertyTypeId(String propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public SavePropertyRequest(long propertyId, String propertyTitle, String location, String propertyTypeId,
			String city, String pincode, String state, String createdDate) {
		super();
		this.propertyId = propertyId;
		this.propertyTitle = propertyTitle;
		this.location = location;
		this.propertyTypeId = propertyTypeId;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "SavePropertyRequest [propertyId=" + propertyId + ", propertyTitle=" + propertyTitle + ", location="
				+ location + ", propertyTypeId=" + propertyTypeId + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + ", createdDate=" + createdDate + "]";
	}

	 
}
