package com.neighborhoodAssurance.service;

import com.neighborhoodAssurance.dto.AgencyDTO;

public interface IAgencyService {
	/**
	 * Get Agency from persistence layer.
	 * @param ori a unique lookup
	 *@return a IAgency with a matching ID.
	 */
	AgencyDTO fetchByOri(String ori);

	void save(AgencyDTO agencyDTO);

}