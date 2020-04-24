package com.neighborhoodAssurance.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neighborhoodAssurance.WSClient;
import com.neighborhoodAssurance.config.StateDao;
import com.neighborhoodAssurance.model.CrimeData;
import com.neighborhoodAssurance.model.LocationDataMain;
import com.neighborhoodAssurance.model.WSClientCrimeDataResponse;
import com.neighborhoodAssurance.model.WSClientResponse;

@Service
public class StateServiceImpl implements StateService{
	
	private static final Logger logger = LoggerFactory.getLogger(StateServiceImpl.class);


	/*@Override
	public List<WSClientResponse> getStateDetails() {
		// TODO Auto-generated method stub
		WSClient wsclient=new WSClient();
		LocationDataMain ldmainObj=wsclient.getData();
		List<WSClientResponse> ldObjList=ldmainObj.getHI().getLdObj();
		return ldObjList;
		
	}*/

	@Override
	public WSClientCrimeDataResponse[] getCrimeDetails(String name) {
		// TODO Auto-generated method stub
		StateDao dao=new StateDao();
		String type=dao.findStateCrimes(name);
		WSClient wsclient=new WSClient();
		CrimeData crimeDataObj=wsclient.getCrimeData(type);
		WSClientCrimeDataResponse[] wsclientCrimeDataResponse=crimeDataObj.getResults();
		return wsclientCrimeDataResponse;
	}

}
