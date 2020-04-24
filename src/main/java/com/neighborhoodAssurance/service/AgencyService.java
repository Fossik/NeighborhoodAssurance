package com.neighborhoodAssurance.service;

import java.util.List;

import com.neighborhoodAssurance.dao.IAgencyDAO;
import com.neighborhoodAssurance.dto.AgencyDTO;
import com.neighborhoodAssurance.dto.HawaiiAgencies;

public class AgencyService implements IAgencyService {

	IAgencyDAO agencyDAO;
	
	@Override
	public AgencyDTO fetchByORI(String ORI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(AgencyDTO agencyDTO) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HawaiiAgencies> fetchAgencies(String searchTerm) throws Exception {
		// TODO Auto-generated method stub
		return agencyDAO.fetch(searchTerm);
	}

	@Override
	public void setAgencyDAO(IAgencyDAO agencyDAO) {
		// TODO Auto-generated method stub

	}

	@Override
	public IAgencyDAO getAgencyDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(List<HawaiiAgencies> hawaiiAgencies) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
