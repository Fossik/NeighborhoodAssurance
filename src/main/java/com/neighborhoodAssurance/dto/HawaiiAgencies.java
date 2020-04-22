package com.neighborhoodAssurance.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HawaiiAgencies {
	
	@SerializedName("HI0010000")
	@Expose
	private HawaiiAgency1 hawaiiAgency1;
	@SerializedName("HI0050000")
	@Expose
	private HawaiiAgency2 hawaiiAgency2;
	@SerializedName("HI0020000")
	@Expose
	private HawaiiAgency3 hawaiiAgency3;
	@SerializedName("HI0040000")
	@Expose
	private HawaiiAgency4 hawaiiAgency4;
	
	public HawaiiAgency1 getHawaiiAgency1() {
		return hawaiiAgency1;
	}
	public void setHawaiiAgency1(HawaiiAgency1 hawaiiAgency1) {
		this.hawaiiAgency1 = hawaiiAgency1;
	}
	public HawaiiAgency2 getHawaiiAgency2() {
		return hawaiiAgency2;
	}
	public void setHawaiiAgency2(HawaiiAgency2 hawaiiAgency2) {
		this.hawaiiAgency2 = hawaiiAgency2;
	}
	public HawaiiAgency3 getHawaiiAgency3() {
		return hawaiiAgency3;
	}
	public void setHawaiiAgency3(HawaiiAgency3 hawaiiAgency3) {
		this.hawaiiAgency3 = hawaiiAgency3;
	}
	public HawaiiAgency4 getHawaiiAgency4() {
		return hawaiiAgency4;
	}
	public void setHawaiiAgency4(HawaiiAgency4 hawaiiAgency4) {
		this.hawaiiAgency4 = hawaiiAgency4;
	}
	
}