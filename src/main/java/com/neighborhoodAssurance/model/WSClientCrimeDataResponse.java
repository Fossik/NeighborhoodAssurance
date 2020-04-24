package com.neighborhoodAssurance.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class WSClientCrimeDataResponse {
	

	private String state_id;
	private String state_abbr;
	private String year;
	private String population;
	private String violent_crime;
	private String homicide;
	private String rape_legacy;
	private String rape_revised;
	private String robbery;
	private String aggravated_assault;
	private String property_crime;
	private String burglary;
	private String larceny;
	private String motor_vehicle_theft;
	private String arson;
	
	public String getState_id() {
		return state_id;
	}
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
	public String getState_abbr() {
		return state_abbr;
	}
	public void setState_abbr(String state_abbr) {
		this.state_abbr = state_abbr;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getViolent_crime() {
		return violent_crime;
	}
	public void setViolent_crime(String violent_crime) {
		this.violent_crime = violent_crime;
	}
	public String getHomicide() {
		return homicide;
	}
	public void setHomicide(String homicide) {
		this.homicide = homicide;
	}
	public String getRape_legacy() {
		return rape_legacy;
	}
	public void setRape_legacy(String rape_legacy) {
		this.rape_legacy = rape_legacy;
	}
	public String getRape_revised() {
		return rape_revised;
	}
	public void setRape_revised(String rape_revised) {
		this.rape_revised = rape_revised;
	}
	public String getRobbery() {
		return robbery;
	}
	public void setRobbery(String robbery) {
		this.robbery = robbery;
	}
	public String getAggravated_assault() {
		return aggravated_assault;
	}
	public void setAggravated_assault(String aggravated_assault) {
		this.aggravated_assault = aggravated_assault;
	}
	public String getProperty_crime() {
		return property_crime;
	}
	public void setProperty_crime(String property_crime) {
		this.property_crime = property_crime;
	}
	public String getBurglary() {
		return burglary;
	}
	public void setBurglary(String burglary) {
		this.burglary = burglary;
	}
	public String getLarceny() {
		return larceny;
	}
	public void setLarceny(String larceny) {
		this.larceny = larceny;
	}
	public String getMotor_vehicle_theft() {
		return motor_vehicle_theft;
	}
	public void setMotor_vehicle_theft(String motor_vehicle_theft) {
		this.motor_vehicle_theft = motor_vehicle_theft;
	}
	public String getArson() {
		return arson;
	}
	public void setArson(String arson) {
		this.arson = arson;
	}
	
	
}
