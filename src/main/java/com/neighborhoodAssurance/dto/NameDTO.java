package com.neighborhoodAssurance.dto;

public class NameDTO {

	private int id;
	private String neighborhoodName;
	private String city;
	private String state;
	private Double crimeRate;
	private int year;
	
	public int getID() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getNeighborhood() {
		return neighborhoodName;
	}
	
	public void setNeighborhoodName(String neighborhoodName) {
		this.neighborhoodName = neighborhoodName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Double getCrimeRate() {
		return crimeRate;
	}
	
	public void setCrimeRate(double crimeRate) {
		this.crimeRate = crimeRate;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
