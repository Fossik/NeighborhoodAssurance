package com.neighborhoodAssurance.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationDataMain {
private LocationData HI;

public LocationData getHI() {
	return HI;
}
@JsonProperty("HI")
public void setHI(LocationData hI) {
	HI = hI;
}



}
