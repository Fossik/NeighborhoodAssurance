package com.neighborhoodAssurance.dao;

import com.neighborhoodAssurance.dto.AgencyDTO;
import com.neighborhoodAssurance.dto.HawaiiAgencies;
import com.neighborhoodAssurance.dto.HawaiiAgenciesList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AgencyDAO implements IAgencyDAO {
	
	@Autowired
	NetworkDAO networkDAO;
	
	public List<AgencyDTO> fetchManual(String searchFilter) throws Exception {
		List<AgencyDTO> allAgencies = new ArrayList<AgencyDTO>();
		
		String rawJson = networkDAO.request("https://api.usa.gov/crime/fbi/sapi/api/agencies?API_KEY=9Swi2aeyB5WlKtg3QXD0wduDwty7PsQdXqPoQRs5");
		
		JSONObject root = new JSONObject(rawJson);
		
		JSONArray HI = root.getJSONArray("HI");
		
		for(int i = 0; i< HI.length(); i++) {
			JSONObject jsonHI = HI.getJSONObject(i);
			AgencyDTO agency = new AgencyDTO();
			String ori = jsonHI.getString("ori");
			String agencyName = jsonHI.getString("agency_name");
			String agencyTypeName = jsonHI.getString("agency_type_name");
			String stateName = jsonHI.getString("state_name");
			String stateAbbr = jsonHI.getString("state_abbr");
			String divisionName = jsonHI.getString("division_name");
			String regionName = jsonHI.getString("region_name");
			String countyName = jsonHI.getString("county_name");
			double latitude = jsonHI.getDouble("latitude");
			double longitude = jsonHI.getDouble("longitude");
			
			agency.setOri(ori);
			agency.setAgencyName(agencyName);
			agency.setAgencyTypeName(agencyTypeName);
			agency.setStateName(stateName);
			agency.setStateAbbr(stateAbbr);
			agency.setDivisionName(divisionName);
			agency.setRegionName(regionName);
			agency.setCountyName(countyName);
			agency.setLatitude(latitude);
			agency.setLongitude(longitude);
			
			allAgencies.add(agency);
		}
		
		return allAgencies;
	}

	@Override
	public boolean save(List<HawaiiAgencies> hawaiiAgencies) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HawaiiAgencies> fetch(String searchFilter) throws Exception {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://api.usa.gov/crime/fbi/sapi")
				.build();
		
		GetAgencies getAgencies = retrofit.create(GetAgencies.class);
		
		Call<HawaiiAgenciesList> hawaiiAgencies = getAgencies.getHawaiiAgencies();
		Response<HawaiiAgenciesList> execute = hawaiiAgencies.execute();
		HawaiiAgenciesList hawaiiAgenciesList = execute.body();
		
		// TODO Auto-generated method stub
		return hawaiiAgenciesList.getHIAgencies();
	}

	@Override
	public boolean save(AgencyDTO agencyDTO) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
}