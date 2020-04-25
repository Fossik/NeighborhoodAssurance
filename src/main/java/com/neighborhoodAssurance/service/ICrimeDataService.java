package com.neighborhoodAssurance.service;

import java.util.ArrayList;
import java.util.List;

import com.neighborhoodAssurance.dto.CrimeDataByStateDTO;

public interface ICrimeDataService {
	
	List<CrimeDataByStateDTO> fetchByState(String stateAbbr, int startingYear, int endingYear) throws Exception;

}