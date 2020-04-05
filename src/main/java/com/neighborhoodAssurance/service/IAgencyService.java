package com.neighborhoodAssurance.service;

import com.neighborhoodAssurance.dto.AgencyDTO;

public interface IAgencyService {

	AgencyDTO fetchByORI(String ORI);

	void save(AgencyDTO agencyDTO);

}