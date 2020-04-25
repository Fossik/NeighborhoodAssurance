package com.neighborhoodAssurance.dao;
import java.util.List;
import java.util.ArrayList;
import com.neighborhoodAssurance.dto.CrimeDataByStateDTO;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neighborhoodAssurance.Constants;

@Component
public class CrimeDataByStateDAO implements ICrimeDataByStateDAO {
	@Autowired
	NetworkDAO networkDAO;
	
	@Override
	public List<CrimeDataByStateDTO> fetch(String stateAbbr, int startingYear, int endingYear) throws Exception{
		List<CrimeDataByStateDTO> crimeData = new ArrayList<CrimeDataByStateDTO>();
		
		String requestUrl = Constants.BaseCrimeDataUrl + Constants.CrimeByStateUrlPart + stateAbbr + "/" + Integer.toString(startingYear) + "/" + Integer.toString(endingYear) + "?API_KEY=" + Constants.CrimeDataAPIKey;
		String rawJson = networkDAO.request(requestUrl);
		
		JSONObject root = new JSONObject(rawJson);
		
		JSONArray crimeDataJSONArray = root.getJSONArray("results");
		
		for(int i = 0; i < crimeDataJSONArray.length(); i++) {
			JSONObject jsonCrimeData = crimeDataJSONArray.getJSONObject(i);
			int year = jsonCrimeData.getInt("year");
			if(year >= startingYear && year <= endingYear) {
				CrimeDataByStateDTO crimeDataByStateDTO = new CrimeDataByStateDTO(jsonCrimeData);
				crimeData.add(crimeDataByStateDTO);
			}
		}
		
		return crimeData;
	}
}
