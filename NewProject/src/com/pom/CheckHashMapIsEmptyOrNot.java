package com.pom;

import java.util.HashMap;

public class CheckHashMapIsEmptyOrNot {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(4, "lalita");
		hashMap.put(2, "sonali");
		hashMap.put(5, "priya");
		hashMap.put(3, "sachin");
		hashMap.put(1, "tina");
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.isEmpty());
		
	//	if hashmap is empty then return - true
	//	if hashmap is not empty then false		

	}

}
