package com.ratings.RoadRatingsService.model;

import java.util.Arrays;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class RequestPOJO {

	private String[] locations = new String[2];

	public String[] getLocations() {
		return locations;
	}

	public void setLocations(String[] locations) {
		this.locations = locations;
	}

	public RequestPOJO(String[] locations) {
		super();
		this.locations = locations;
	}

	public RequestPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RequestPOJO [locations=" + Arrays.toString(locations) + "]";
	}
	
	
}
