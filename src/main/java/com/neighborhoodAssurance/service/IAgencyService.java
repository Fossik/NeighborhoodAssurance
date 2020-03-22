package com.neighborhoodAssurance.service;

import com.neighborhoodAssurance.dto.AgencyDTO;

public interface IAgencyService {

	AgencyDTO fetchByOri(String ori);

	void save(AgencyDTO agencyDTO);

}