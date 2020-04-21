package com.neighborhoodAssurance.service;

import com.neighborhoodAssurance.dao.IAgencyDAO;
import com.neighborhoodAssurance.dto.AgencyDTO;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AgencyServiceStub implements IAgencyService {

	private IAgencyDAO agencyDAO;
	
	@Override
	public AgencyDTO fetchByORI(String ORI) {
		AgencyDTO agencyDTO = new AgencyDTO();
		agencyDTO.setOri("HI0010000");
		agencyDTO.setAgencyName("Hawaii Police Department County Sheriff's Office");
		agencyDTO.setAgencyTypeName("County");
		agencyDTO.setStateName("Hawaii");
		agencyDTO.setStateAbbr("HI");
		agencyDTO.setDivisionName("Pacific");
		agencyDTO.setRegionName("West");
		agencyDTO.setCountyName("HAWAII");
		agencyDTO.setLatitude("19.716698");
		agencyDTO.setLongitude("-155.08688");
		return agencyDTO;
	}
	
	@Override
	public boolean save(AgencyDTO agencyDTO) throws Exception {
		boolean result = agencyDAO.save(agencyDTO);
		return result;
	}

	@Override
	public List<AgencyDTO> fetchAgencies(String string) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAgencyDAO(IAgencyDAO agencyDAO) {
		this.agencyDAO = agencyDAO;		
	}

	@Override
	public IAgencyDAO getAgencyDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	
}