package com.neighborhoodAssurance;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Random;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neighborhoodAssurance.model.CrimeData;
import com.neighborhoodAssurance.model.LocationDataMain;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class WSClient {

	public static void main(String[] args) {
		//WSClient obj=new WSClient();
		//obj.getData();
}
	public LocationDataMain getData() {
		// TODO Auto-generated method stub
		LocationDataMain res = new LocationDataMain();
		String output=null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			ClientConfig cc = new DefaultClientConfig();
		    cc.getProperties().put(
		        ClientConfig.PROPERTY_CONNECT_TIMEOUT,1000*30);
		    cc.getProperties().put(
			        ClientConfig.PROPERTY_READ_TIMEOUT,1000*30);
		    Client client = Client.create(cc);
			
		 // Create a trust manager that does not validate certificate chains
		 			TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){
		 			    public X509Certificate[] getAcceptedIssuers(){return null;}
		 			    public void checkClientTrusted(X509Certificate[] certs, String authType){}
		 			    public void checkServerTrusted(X509Certificate[] certs, String authType){}
		 			
		 			}};

		 			// Install the all-trusting trust manager
		 			try {
		 			    SSLContext sc = SSLContext.getInstance("TLS");
		 			    sc.init(null, trustAllCerts, new SecureRandom());
		 			    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		 			} catch (Exception e) {
		 			
		 			}
			//WebResource webResource = client.resource("https://api.usa.gov/crime/fbi/sapi/api/agencies?API_KEY=9Swi2aeyB5WlKtg3QXD0wduDwty7PsQdXqPoQRs5");
			
			try{
			//ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			//output = response.getEntity(String.class);
			//output="{\"message\":\"Transaction successful\",\"transaction_ref\":\"629351\"}";
output="{\"HI\" : { \"HI0010000\" : {\"ori\" : \"HI0010000\",\"agency_name\" : \"Hawaii Police Department County Sheriff's Office\"," + 
"      \"agency_type_name\" : \"County\"," + 
"      \"state_name\" : \"Hawaii\"," + 
"      \"state_abbr\" : \"HI\"," + 
"      \"division_name\" : \"Pacific\"," + 
"      \"region_name\" : \"West\"," + 
"      \"region_desc\" : \"Region IV\"," + 
"      \"county_name\" : \"HAWAII\"," + 
"      \"nibrs\" : false," + 
"      \"latitude\" : 19.716698," + 
"      \"longitude\" : -155.08688," + 
"      \"nibrs_start_date\" : null }"
+ ",\"HI0050000\" : {\"ori\" : \"HI0050000\",\"agency_name\" : \"Maui Police Department County Sheriff's Office\"," + 
"      \"agency_type_name\" : \"County\"," + 
"      \"state_name\" : \"Hawaii\"," + 
"      \"state_abbr\" : \"HI\"," + 
"      \"division_name\" : \"Pacific\"," + 
"      \"region_name\" : \"West\"," + 
"      \"region_desc\" : \"Region IV\"," + 
"      \"county_name\" : \"MAUI\"," + 
"      \"nibrs\" : false," + 
"      \"latitude\" : 20.887321," + 
"      \"longitude\" : -156.48763," + 
"      \"nibrs_start_date\" : null" + 
"    } }}";

			System.out.println(output);

			//res = mapper.readValue(output, LocationDataMain.class);
			System.out.println(output);
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	
	public CrimeData getCrimeData(String type) {
		System.out.println("---------"+type);
		// TODO Auto-generated method stub
		CrimeData res = new CrimeData();
		String output=null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			ClientConfig cc = new DefaultClientConfig();
		    cc.getProperties().put(
		        ClientConfig.PROPERTY_CONNECT_TIMEOUT,1000*30);
		    cc.getProperties().put(
			        ClientConfig.PROPERTY_READ_TIMEOUT,1000*30);
		    Client client = Client.create(cc);
			
		 // Create a trust manager that does not validate certificate chains
		 			TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){
		 			    public X509Certificate[] getAcceptedIssuers(){return null;}
		 			    public void checkClientTrusted(X509Certificate[] certs, String authType){}
		 			    public void checkServerTrusted(X509Certificate[] certs, String authType){}
		 			
		 			}};

		 			// Install the all-trusting trust manager
		 			try {
		 			    SSLContext sc = SSLContext.getInstance("TLS");
		 			    sc.init(null, trustAllCerts, new SecureRandom());
		 			    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		 			} catch (Exception e) {
		 			
		 			}
			WebResource webResource = client.resource("https://api.usa.gov/crime/fbi/sapi/api/summarized/estimates/states/OH/2016/2020?API_KEY=9Swi2aeyB5WlKtg3QXD0wduDwty7PsQdXqPoQRs5");
			
			try{
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			output = response.getEntity(String.class);
			//output="{\"message\":\"Transaction successful\",\"transaction_ref\":\"629351\"}";


			System.out.println(output);

			res = mapper.readValue(output, CrimeData.class);
			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public String getCrimeDataStr() {
		// TODO Auto-generated method stub
		CrimeData res = new CrimeData();
		String output=null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			ClientConfig cc = new DefaultClientConfig();
		    cc.getProperties().put(
		        ClientConfig.PROPERTY_CONNECT_TIMEOUT,1000*30);
		    cc.getProperties().put(
			        ClientConfig.PROPERTY_READ_TIMEOUT,1000*30);
		    Client client = Client.create(cc);
			
		 // Create a trust manager that does not validate certificate chains
		 			TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){
		 			    public X509Certificate[] getAcceptedIssuers(){return null;}
		 			    public void checkClientTrusted(X509Certificate[] certs, String authType){}
		 			    public void checkServerTrusted(X509Certificate[] certs, String authType){}
		 			
		 			}};

		 			// Install the all-trusting trust manager
		 			try {
		 			    SSLContext sc = SSLContext.getInstance("TLS");
		 			    sc.init(null, trustAllCerts, new SecureRandom());
		 			    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		 			} catch (Exception e) {
		 			
		 			}
			//WebResource webResource = client.resource("https://api.usa.gov/crime/fbi/sapi/api/summarized/estimates/states/OH/2016/2020?API_KEY=9Swi2aeyB5WlKtg3QXD0wduDwty7PsQdXqPoQRs5");
			
			try{
			//ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			//output = response.getEntity(String.class);
			//output="{\"message\":\"Transaction successful\",\"transaction_ref\":\"629351\"}";
output="{\"results\" : [ {\"state_id\" : 39,\"state_abbr\" : \"OH\"," + 
		"    \"year\" : 2016," + 
		"    \"population\" : 11622554," + 
		"    \"violent_crime\" : 35759," + 
		"    \"homicide\" : 683," + 
		"    \"rape_legacy\" : 5589," + 
		"    \"rape_revised\" : 5754," + 
		"    \"robbery\" : 12574," + 
		"    \"aggravated_assault\" : 16748," + 
		"    \"property_crime\" : 300945," + 
		"    \"burglary\" : 67081," + 
		"    \"larceny\" : 214102," + 
		"    \"motor_vehicle_theft\" : 19762," + 
		"    \"arson\" : 2537\r\n" + 
		"  }, {\"state_id\" : 39," + 
		"    \"state_abbr\" : \"OH\"," + 
		"    \"year\" : 1981," + 
		"    \"population\" : 10776000," + 
		"    \"violent_crime\" : 53509," + 
		"    \"homicide\" : 799," + 
		"    \"rape_legacy\" : 3339," + 
		"    \"rape_revised\" : null," + 
		"    \"robbery\" : 25529," + 
		"    \"aggravated_assault\" : 23842," + 
		"    \"property_crime\" : 533498," + 
		"    \"burglary\" : 160951," + 
		"    \"larceny\" : 326770," + 
		"    \"motor_vehicle_theft\" : 45777," + 
		"    \"arson\" : null" + 
		"  }}";

			System.out.println(output);

			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}
}

