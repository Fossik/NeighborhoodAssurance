package com.neighborhoodAssurance.dao;

import java.util.List;

import com.neighborhoodAssurance.dto.AgencyDTO;

public interface IAgencyDAO {
	
	boolean save(AgencyDTO agencyDTO) throws Exception;

	List<AgencyDTO> fetch(String searchFilter) throws Exception;

}