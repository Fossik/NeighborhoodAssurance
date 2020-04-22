package com.neighborhoodAssurance.dto;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HawaiiAgenciesList {
	
	@SerializedName("HI")
	@Expose
	private List<HawaiiAgencies> hiAgencies = null;
	
	public List<HawaiiAgencies> getHIAgencies() {
		return hiAgencies;
	}
	
	public void setHIAgencies(List<HawaiiAgencies> hiAgencies) {
		this.hiAgencies = hiAgencies;
	}
}