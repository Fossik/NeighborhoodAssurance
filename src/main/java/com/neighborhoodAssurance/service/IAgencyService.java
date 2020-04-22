package com.neighborhoodAssurance.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.neighborhoodAssurance.dao.IAgencyDAO;
import com.neighborhoodAssurance.dto.AgencyDTO;
import com.neighborhoodAssurance.dto.HawaiiAgencies;

@Component
public interface IAgencyService {

	AgencyDTO fetchByORI(String ORI);

	boolean save(AgencyDTO agencyDTO) throws Exception;
	
	List<HawaiiAgencies> fetchAgencies(String string) throws Exception;

	void setAgencyDAO(IAgencyDAO agencyDAO);

	IAgencyDAO getAgencyDAO();

	boolean save(List<HawaiiAgencies> hawaiiAgencies) throws Exception;

}