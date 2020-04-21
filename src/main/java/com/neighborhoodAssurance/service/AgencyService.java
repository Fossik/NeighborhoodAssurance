package com.neighborhoodAssurance.service;

import java.util.List;

import com.neighborhoodAssurance.dao.IAgencyDAO;
import com.neighborhoodAssurance.dto.AgencyDTO;

public class AgencyService implements IAgencyService {

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
	public List<AgencyDTO> fetchAgencies(String string) throws Exception {
		// TODO Auto-generated method stub
		return null;
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

}
