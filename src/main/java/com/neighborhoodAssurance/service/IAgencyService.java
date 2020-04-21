package com.neighborhoodAssurance.service;

import java.util.List;

import com.neighborhoodAssurance.dao.IAgencyDAO;
import com.neighborhoodAssurance.dto.AgencyDTO;

public interface IAgencyService {

	AgencyDTO fetchByORI(String ORI);

	boolean save(AgencyDTO agencyDTO) throws Exception;
	
	List<AgencyDTO> fetchAgencies(String string) throws Exception;

	void setAgencyDAO(IAgencyDAO agencyDAO);

	IAgencyDAO getAgencyDAO();

}