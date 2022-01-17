package com.ratings.RoadRatingsService.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsePojo {

	float distance;
	boolean hasTimedRestriction;
	float fuelUsed;

	
	
	public float getFuelUsed() {
		return fuelUsed;
	}

	public void setFuelUsed(float fuelUsed) {
		this.fuelUsed = fuelUsed;
	}

	public boolean isHasTimedRestriction() {
		return hasTimedRestriction;
	}

	public void setHasTimedRestriction(boolean hasTimedRestriction) {
		this.hasTimedRestriction = hasTimedRestriction;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	

	

	public ResponsePojo(float distance, boolean hasTimedRestriction, float fuelUsed) {
		super();
		this.distance = distance;
		this.hasTimedRestriction = hasTimedRestriction;
		this.fuelUsed = fuelUsed;
	}

	public ResponsePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ResponsePojo [distance=" + distance + ", hasTimedRestriction=" + hasTimedRestriction + ", fuelUsed="
				+ fuelUsed + "]";
	}

	

	
	
}
