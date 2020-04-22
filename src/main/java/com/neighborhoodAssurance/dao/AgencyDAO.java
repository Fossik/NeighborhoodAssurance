package com.neighborhoodAssurance.dao;

import com.neighborhoodAssurance.dto.AgencyDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AgencyDAO implements IAgencyDAO {
	
	@Autowired
	NetworkDAO networkDAO;
	
	@Override
	public List<AgencyDTO> fetch(String searchFilter) throws Exception {
		List<AgencyDTO> allAgencies = new ArrayList<AgencyDTO>();
		
		String rawJson = networkDAO.request("https://api.usa.gov/crime/fbi/sapi/api/agencies/byStateAbbr/HI?API_KEY=9Swi2aeyB5WlKtg3QXD0wduDwty7PsQdXqPoQRs5");
		
		return allAgencies;
	}

	@Override
	public boolean save(AgencyDTO agencyDTO) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
}