package com.neighborhoodAssurance.dto;

import org.json.JSONObject;

public class CrimeDataByStateDTO {
	public CrimeDataByStateDTO() {
		
	}
	
	public CrimeDataByStateDTO(JSONObject crimeDataJSONObject) {
		this.stateId = crimeDataJSONObject.getInt("state_id");			
		this.stateAbbreviation = crimeDataJSONObject.getString("state_abbr");
		this.year = crimeDataJSONObject.getInt("year");
		try {			
			this.population = crimeDataJSONObject.getInt("population");
		} catch(Exception e) {
			this.population = null;
		}
		try {			
			this.violentCrime = crimeDataJSONObject.getInt("violent_crime");
		} catch(Exception e) {
			this.violentCrime = null;
		}
		try {			
			this.homicide = crimeDataJSONObject.getInt("homicide");
		} catch(Exception e) {
			this.homicide = null;
		}
		try {			
			this.rapeLegacy = crimeDataJSONObject.getInt("rape_legacy");
		} catch(Exception e) {
			this.rapeLegacy = null;
		}
		try {			
			this.rapeRevised = crimeDataJSONObject.getInt("rape_revised");
		} catch(Exception e) {
			this.rapeRevised = null;
		}
		try {			
			this.robbery = crimeDataJSONObject.getInt("robbery");
		} catch(Exception e) {
			this.robbery = null;
		}
		try {			
			this.arson = crimeDataJSONObject.getInt("arson");
		} catch(Exception e) {
			this.arson = null;
		}
		try {			
			this.aggravatedAssault = crimeDataJSONObject.getInt("aggravated_assault");
		} catch(Exception e) {
			this.aggravatedAssault = null;
		}
		try {			
			this.propertyCrime = crimeDataJSONObject.getInt("property_crime");
		} catch(Exception e) {
			this.propertyCrime = null;
		}
		try {			
			this.burglary = crimeDataJSONObject.getInt("burglary");
		} catch(Exception e) {
			this.burglary = null;
		}
		try {			
			this.larceny = crimeDataJSONObject.getInt("larceny");
		} catch(Exception e) {
			this.larceny = null;
		}
		try {			
			this.motorVehicleTheft = crimeDataJSONObject.getInt("motor_vehicle_theft");
		} catch(Exception e) {
			this.motorVehicleTheft = null;
		}
	}
	
	private int stateId;
	private String stateAbbreviation;
	private int year;
	private Integer population;
	private Integer violentCrime;
	private Integer homicide;
	private Integer rapeLegacy;
	private Integer rapeRevised;
	private Integer robbery;
	private Integer aggravatedAssault;
	private Integer propertyCrime;
	private Integer burglary;
	private Integer larceny;
	private Integer motorVehicleTheft;
	private Integer arson;
	
	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateAbbreviation() {
		return stateAbbreviation;
	}

	public void setStateAbbreviation(String stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Integer getViolentCrime() {
		return violentCrime;
	}

	public void setViolentCrime(Integer violentCrime) {
		this.violentCrime = violentCrime;
	}

	public Integer getHomicide() {
		return homicide;
	}

	public void setHomicide(Integer homicide) {
		this.homicide = homicide;
	}

	public Integer getRapeLegacy() {
		return rapeLegacy;
	}

	public void setRapeLegacy(Integer rapeLegacy) {
		this.rapeLegacy = rapeLegacy;
	}

	public Integer getRapeRevised() {
		return rapeRevised;
	}

	public void setRapeRevised(Integer rapeRevised) {
		this.rapeRevised = rapeRevised;
	}

	public Integer getRobbery() {
		return robbery;
	}

	public void setRobbery(Integer robbery) {
		this.robbery = robbery;
	}

	public Integer getAggravatedAssault() {
		return aggravatedAssault;
	}

	public void setAggravatedAssault(Integer aggravatedAssault) {
		this.aggravatedAssault = aggravatedAssault;
	}

	public Integer getPropertyCrime() {
		return propertyCrime;
	}

	public void setPropertyCrime(Integer propertyCrime) {
		this.propertyCrime = propertyCrime;
	}

	public Integer getBurglary() {
		return burglary;
	}

	public void setBurglary(Integer burglary) {
		this.burglary = burglary;
	}

	public Integer getLarceny() {
		return larceny;
	}

	public void setLarceny(Integer larceny) {
		this.larceny = larceny;
	}

	public Integer getMotorVehicleTheft() {
		return motorVehicleTheft;
	}

	public void setMotorVehicleTheft(Integer motorVehicleTheft) {
		this.motorVehicleTheft = motorVehicleTheft;
	}

	public Integer getArson() {
		return arson;
	}

	public void setArson(Integer arson) {
		this.arson = arson;
	}
}
