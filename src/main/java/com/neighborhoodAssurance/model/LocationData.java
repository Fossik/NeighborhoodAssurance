package com.neighborhoodAssurance.model;

import java.util.List;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/*@Data

@Entity*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationData {
	/*private WSClientResponse ldObj;

	public WSClientResponse getLdObj() {
		return ldObj;
	}

	public void setLdObj(WSClientResponse ldObj) {
		this.ldObj = ldObj;
	}*/
	
	private List<WSClientResponse> ldObj;

	public List<WSClientResponse> getLdObj() {
		return ldObj;
	}

	public void setLdObj(List<WSClientResponse> ldObj) {
		this.ldObj = ldObj;
	}

	

}
