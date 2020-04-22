package com.neighborhoodAssurance.dao;

import java.util.List;

import com.neighborhoodAssurance.dto.AgencyDTO;
import com.neighborhoodAssurance.dto.HawaiiAgencies;

public interface IAgencyDAO {
	
	boolean save(AgencyDTO agencyDTO) throws Exception;

	List<HawaiiAgencies> fetch(String searchFilter) throws Exception;

	boolean save(List<HawaiiAgencies> hawaiiAgencies) throws Exception;

}