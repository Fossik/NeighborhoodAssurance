package com.neighborhoodAssurance;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	public final static String BaseCrimeDataUrl = "https://api.usa.gov/crime/fbi/sapi/api/";
	public final static String CrimeByStateUrlPart = "summarized/estimates/states/";
	public final static String CrimeDataAPIKey = "9Swi2aeyB5WlKtg3QXD0wduDwty7PsQdXqPoQRs5";
	
	public static final Map<String, String> statesToAbbreviation = new HashMap<String, String>()
	{/**
		 * 
		 */
		private static final long serialVersionUID = -47966324568149342L;
	{
		put("alabama", "AL");
		put("alaska","AK");
		put("arizona","AZ");
		put("arkansas","AR");
		put("british columbia","BC");
		put("california","CA");
		put("colorado","CO");
		put("connecticut","CT");
		put("delaware","DE");
		put("district of columbia","DC");
		put("florida","FL");
		put("georgia","GA");
		put("hawaii","HI");
		put("idaho","ID");
		put("illinois","IL");
		put("indiana","IN");
		put("iowa","IA");
		put("kansas","KS");
		put("kentucky","KY");
		put("louisiana","LA");
		put("maine","ME");
		put("manitoba","MB");
		put("maryland","MD");
		put("massachusetts","MA");
		put("michigan","MI");
		put("minnesota","MN");
		put("mississippi","MS");
		put("missouri","MO");
		put("montana","MT");
		put("nebraska","NE");
		put("nevada","NV");
		put("new hampshire","NH");
		put("new jersey","NJ");
		put("new mexico","NM");
		put("new york","NY");
		put("north carolina","NC");
		put("north dakota","ND");
		put("ohio","OH");
		put("oklahoma","OK");
		put("oregon","OR");
		put("pennsylvania","PA");
		put("rhode island","RI");
		put("south carolina","SC");
		put("south dakota","SD");
		put("tennessee","TN");
		put("texas","TX");
		put("utah","UT");
		put("vermont","VT");
		put("virgin islands","VI");
		put("virginia","VA");
		put("washington","WA");
		put("west virginia","WV");
		put("wisconsin","WI");
		put("wyoming","WY");
	}};

	public static String ConvertStateToAbbreviation(String state) {
		if(state == null || state.isBlank()) {
			return state;
		}
		String returnState = statesToAbbreviation.get(state.toLowerCase());
		if (returnState == null) {
			returnState = state;
		}
		return returnState;
	}
}