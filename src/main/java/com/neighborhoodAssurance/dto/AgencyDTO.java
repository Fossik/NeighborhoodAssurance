package com.neighborhoodAssurance.dto;

public class AgencyDTO {

	private String ori;
	private String agencyName;
	private String agencyTypeName;
	private String stateName;
	private String stateAbbr;
	private String divisionName;
	private String regionName;
	private String countyName;
	private String latitude;
	private String longitude;
	
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
	
	@Override
	public String toString() {
		return ori + " " + agencyName + " " + agencyTypeName + " " + stateName + " " + stateAbbr + " " + divisionName + " " + regionName + " " + countyName + " " + latitude + " " + longitude;
	}
}
