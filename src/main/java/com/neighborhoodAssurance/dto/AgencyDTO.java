package com.neighborhoodAssurance.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AgencyDTO {

	@SerializedName("ori")
	@Expose
	private String ori;
	@SerializedName("agency_name")
	@Expose
	private String agencyName;
	@SerializedName("agency_type_name")
	@Expose
	private String agencyTypeName;
	@SerializedName("state_name")
	@Expose
	private String stateName;
	@SerializedName("state_abbr")
	@Expose
	private String stateAbbr;
	@SerializedName("division_name")
	@Expose
	private String divisionName;
	@SerializedName("region_name")
	@Expose
	private String regionName;
	@SerializedName("county_name")
	@Expose
	private String countyName;
	@SerializedName("latitude")
	@Expose
	private Double latitude;
	@SerializedName("longitude")
	@Expose
	private Double longitude;
	
	public String getOri() {
		return ori;
	}
	public void setOri(String ori) {
		this.ori = ori;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getAgencyTypeName() {
		return agencyTypeName;
	}
	public void setAgencyTypeName(String agencyTypeName) {
		this.agencyTypeName = agencyTypeName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateAbbr() {
		return stateAbbr;
	}
	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}
	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public String toString() {
		return ori + " " + agencyName + " " + agencyTypeName + " " + stateName + " " + stateAbbr + " " + divisionName + " " + regionName + " " + countyName + " " + latitude + " " + longitude;
	}
	
}
