package com.neighborhoodAssurance.service;

import com.neighborhoodAssurance.dto.AgencyDTO;

public class AgencyServiceStub {

	public AgencyDTO fetchByOri(String ori) {
		AgencyDTO agencyDTO = new AgencyDTO();
		agencyDTO.setOri(ori);
		return agencyDTO;
	}
	
	public void save(AgencyDTO agencyDTO) {
		
	}
	
}