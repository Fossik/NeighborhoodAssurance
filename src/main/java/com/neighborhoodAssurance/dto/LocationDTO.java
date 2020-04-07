package com.neighborhoodAssurance.dto;

public class LocationDTO { 
    //declare variables
    private int userId;
	private String firstName;
	private String lastName;
	private String Zipcode;
	private String State;
    
    public int getId() {
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String Zipcode) {
		this.Zipcode = Zipcode;
	}
	public String getState() {
		return State;
	}
	public void setstate(String State) {
		this.State = State;
	}
	
    @Override
    public String toString() {
		// TODO Auto-generated method stub
		return firstName + " " + lastName;

	}

}