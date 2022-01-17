package com.ratings.RoadRatingsService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ratings {
	@Id
	private int id;
	private String userId;
	private String streetName;
	private int postalCode;
	private String city;
	private int count;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserID() {
		return userId;
	}
	public void setUserID(String userId) {
		this.userId = userId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Ratings(int id, String userId, String streetName, int postalCode, String city, int count) {
		super();
		this.id = id;
		this.userId = userId;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.city = city;
		this.count = count;
	}
	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ratings [id=" + id + ", userId=" + userId + ", streetName=" + streetName + ", postalCode=" + postalCode
				+ ", city=" + city + ", count=" + count + "]";
	}
	
}
