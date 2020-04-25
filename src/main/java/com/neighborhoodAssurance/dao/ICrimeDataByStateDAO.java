package com.neighborhoodAssurance.dao;

import java.util.List;

import com.neighborhoodAssurance.dto.CrimeDataByStateDTO;

public interface ICrimeDataByStateDAO {

	List<CrimeDataByStateDTO> fetch(String stateAbbr, int startingYear, int endingYear) throws Exception;

}