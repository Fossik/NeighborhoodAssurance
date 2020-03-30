package com.neighborhoodAssurance.dto;

public class AgencyDTO {

	/**
	 * Private variables
	 */
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
	
	/**
	 * getter and setter
	 * @return ori
	 */
	public String getOri() {
		return ori;
	}
	public void setOri(String ori) {
		this.ori = ori;
	}
	
	/**
	 * getter and setter
	 * @return agencyName
	 */
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	
	/**
	 * getter and setter
	 * @return agencyTypeName
	 */
	public String getAgencyTypeName() {
		return agencyTypeName;
	}
	public void setAgencyTypeName(String agencyTypeName) {
		this.agencyTypeName = agencyTypeName;
	}
	
	/**
	 * getter and setter
	 * @return stateName
	 */
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	/**
	 * getter and setter
	 * @return stateAbbr
	 */
	public String getStateAbbr() {
		return stateAbbr;
	}
	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}
	
	/**
	 * getter and setter
	 * @return divisionName
	 */
	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	
	/**
	 * getter and setter
	 * @return regionName
	 */
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	/**
	 * getter and setter
	 * @return countyName
	 */
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	
	/**
	 * getter and setter
	 * @return latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * getter and setter
	 * @return longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * getter and setter
	 * @return ori
	 * @return agencyName
	 * @return agencyTypeName
	 * @return stateName
	 * @return stateAbbr
	 * @return divisionName
	 * @return regionName
	 * @return countyName
	 * @return latitude
	 * @return longitude
	 */
	@Override
	public String toString() {
		return ori + " " + agencyName + " " + agencyTypeName + " " + stateName + " " + stateAbbr + " " + divisionName + " " + regionName + " " + countyName + " " + latitude + " " + longitude;
	}
}
