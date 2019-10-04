package com.demo4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Country {
	private String countryName;
	
	private Map<String, String> states;

	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	

	public void setStates(Map<String, String> states) {
		this.states = states;
	}
	
public void printCountryDetails(){
	
	System.out.println("country name :"+countryName);
	Set<Entry<String,String>> enteryset=states.entrySet();
	for(Entry<String,String>e: enteryset){
		System.out.println(e.getKey()+":"+e.getValue());
	}
	
	
}


	
	
	
	
	

}
