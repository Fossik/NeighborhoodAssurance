package com.neighborhoodAssurance.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data

@Entity
@JsonIgnoreProperties
public class WSClientResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id 
	@Column(name="id", length =45)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String ori;
	private String agency_name;
	private String agency_type_name;
	private String state_name;
	private String state_abbr;
	private String division_name;
	private String region_name;
	private String region_desc;
	private String county_name;
	private String nibrs;
	private String latitude;
	private String longitude;
	private String nibrs_start_date;
	public String getOri() {
		return ori;
	}
	public void setOri(String ori) {
		this.ori = ori;
	}
	public String getAgency_name() {
		return agency_name;
	}
	public void setAgency_name(String agency_name) {
		this.agency_name = agency_name;
	}
	public String getAgency_type_name() {
		return agency_type_name;
	}
	public void setAgency_type_name(String agency_type_name) {
		this.agency_type_name = agency_type_name;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getState_abbr() {
		return state_abbr;
	}
	public void setState_abbr(String state_abbr) {
		this.state_abbr = state_abbr;
	}
	public String getDivision_name() {
		return division_name;
	}
	public void setDivision_name(String division_name) {
		this.division_name = division_name;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public String getRegion_desc() {
		return region_desc;
	}
	public void setRegion_desc(String region_desc) {
		this.region_desc = region_desc;
	}
	public String getCounty_name() {
		return county_name;
	}
	public void setCounty_name(String county_name) {
		this.county_name = county_name;
	}
	public String getNibrs() {
		return nibrs;
	}
	public void setNibrs(String nibrs) {
		this.nibrs = nibrs;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getNibrs_start_date() {
		return nibrs_start_date;
	}
	public void setNibrs_start_date(String nibrs_start_date) {
		this.nibrs_start_date = nibrs_start_date;
	}
	
	

}
