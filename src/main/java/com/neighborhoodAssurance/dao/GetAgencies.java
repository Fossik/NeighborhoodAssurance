package com.neighborhoodAssurance.dao;

import com.neighborhoodAssurance.dto.HawaiiAgenciesList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetAgencies {
	
	@GET("/api/agencies?API_KEY=9Swi2aeyB5WlKtg3QXD0wduDwty7PsQdXqPoQRs5")
	Call<HawaiiAgenciesList> getHawaiiAgencies();
	
}