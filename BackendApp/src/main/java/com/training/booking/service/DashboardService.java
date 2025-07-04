package com.training.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.booking.dto.DashboardResponse;
import com.training.booking.entity.Property;
import com.training.booking.repo.PropertyRepository;

@Service
public class DashboardService {

	@Autowired
	private PropertyRepository propertyRepository;

	public DashboardResponse getDashboardData() {
		DashboardResponse response = new DashboardResponse();
		response.setResponse("Success");
		response.setLatestAddedProperty(getAllProperty());
		response.setLatestBookedProperty(getAllProperty());
		response.setTotalAvailableProperty(1);
		response.setTotalBookedProperty(1);
		response.setTotalProperty(propertyRepository.count());
		return response;
	}

	private List<Property> getAllProperty() {
		return propertyRepository.findAll();
	}

}
