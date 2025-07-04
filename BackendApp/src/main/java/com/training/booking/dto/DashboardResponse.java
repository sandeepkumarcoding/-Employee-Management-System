package com.training.booking.dto;

import java.util.List;

import com.training.booking.entity.Property;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DashboardResponse {
	private String response;
	
	private long totalProperty;

	private long totalAvailableProperty;

	private long totalBookedProperty;

	private List<Property> latestAddedProperty;

	private List<Property> latestBookedProperty;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public long getTotalProperty() {
		return totalProperty;
	}

	public void setTotalProperty(long totalProperty) {
		this.totalProperty = totalProperty;
	}

	public long getTotalAvailableProperty() {
		return totalAvailableProperty;
	}

	public void setTotalAvailableProperty(long totalAvailableProperty) {
		this.totalAvailableProperty = totalAvailableProperty;
	}

	public long getTotalBookedProperty() {
		return totalBookedProperty;
	}

	public void setTotalBookedProperty(long totalBookedProperty) {
		this.totalBookedProperty = totalBookedProperty;
	}

	public List<Property> getLatestAddedProperty() {
		return latestAddedProperty;
	}

	public void setLatestAddedProperty(List<Property> latestAddedProperty) {
		this.latestAddedProperty = latestAddedProperty;
	}

	public List<Property> getLatestBookedProperty() {
		return latestBookedProperty;
	}

	public void setLatestBookedProperty(List<Property> latestBookedProperty) {
		this.latestBookedProperty = latestBookedProperty;
	}

	
}
