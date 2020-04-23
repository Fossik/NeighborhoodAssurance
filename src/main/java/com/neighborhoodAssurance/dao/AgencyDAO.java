package com.neighborhoodAssurance.dao;

import com.neighborhoodAssurance.dto.AgencyDTO;
import com.neighborhoodAssurance.dto.HawaiiAgencies;
import com.neighborhoodAssurance.dto.HawaiiAgenciesList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AgencyDAO implements IAgencyDAO {

	@Override
	public boolean save(List<HawaiiAgencies> hawaiiAgencies) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HawaiiAgencies> fetch(String searchFilter) throws Exception {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://api.usa.gov/crime/fbi/sapi")
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		
		GetAgencies getAgencies = retrofit.create(GetAgencies.class);
		
		Call<HawaiiAgenciesList> hawaiiAgencies = getAgencies.getHawaiiAgencies();
		Response<HawaiiAgenciesList> execute = hawaiiAgencies.execute();
		HawaiiAgenciesList hawaiiAgenciesList = execute.body();
		
		List<HawaiiAgencies> hiAgencies = hawaiiAgenciesList.getHIAgencies();
		
		// TODO Auto-generated method stub
		return hiAgencies;
	}

	@Override
	public boolean save(AgencyDTO agencyDTO) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
}