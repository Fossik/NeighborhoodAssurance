package com.neighborhoodAssurance.service;

import com.neighborhoodAssurance.dto.AgencyDTO;
import org.springframework.stereotype.Component;

@Component
public class AgencyServiceStub implements IAgencyService {

	/**
	 * Assigned agencyDTO different characteristics
	 * In this example, the agency is based in Hawaii
	 * @return agencyDTO
	 */
	@Override
	public AgencyDTO fetchByOri(String ori) {
		AgencyDTO agencyDTO = new AgencyDTO();
		agencyDTO.setOri("HI0010000");
		agencyDTO.setAgencyName("Hawaii Police Department County Sheriff's Office");
		agencyDTO.setAgencyTypeName("County");
		agencyDTO.setStateName("Hawaii");
		agencyDTO.setStateAbbr("HI");
		agencyDTO.setDivisionName("Pacific");
		agencyDTO.setRegionName("West");
		agencyDTO.setCountyName("HAWAII");
		agencyDTO.setLatitude("19.716698");
		agencyDTO.setLongitude("-155.08688");
		return agencyDTO;
	}
	
	@Override
	public void save(AgencyDTO agencyDTO) {
		
	}
	
}