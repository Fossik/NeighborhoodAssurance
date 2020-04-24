package com.neighborhoodAssurance.service;

import java.util.List;

import com.neighborhoodAssurance.model.WSClientCrimeDataResponse;
import com.neighborhoodAssurance.model.WSClientResponse;

public interface StateService {
/*
	List<WSClientResponse> getStateDetails();
*/
	WSClientCrimeDataResponse[] getCrimeDetails(String name);

}
