package com.neighborhoodAssurance.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neighborhoodAssurance.dao.ICrimeDataByStateDAO;
import com.neighborhoodAssurance.dto.CrimeDataByStateDTO;

@Component
public class CrimeDataService implements ICrimeDataService {
	@Autowired
	ICrimeDataByStateDAO crimeDataByStateDAO;
	
	@Override
	public List<CrimeDataByStateDTO> fetchByState(String stateAbbr, int startingYear, int endingYear) throws Exception {
		return crimeDataByStateDAO.fetch(stateAbbr, startingYear, endingYear);
	}
}
