package com.pom;

import java.util.HashMap;
import java.util.Map;

public class HashMapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hashMap = new HashMap<Integer,String>(); 
		hashMap.put(1, "sachin");
		hashMap.put(2, "lalita");
		hashMap.put(1, "Rohini");
		
		System.out.println(hashMap);
		
		for(Map.Entry mapEntry :hashMap.entrySet())
		{
			System.out.println(mapEntry.getKey()+ " "+mapEntry.getValue());
		}
		 
		
	}

}
