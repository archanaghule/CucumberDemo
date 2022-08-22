package com.pom;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapDataUsingKey {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hashMap = new HashMap<>();
		hashMap.put("lalita", 10);
		hashMap.put("ashi", 50);
		hashMap.put("rani", 20);
		hashMap.put("golya",40);
		
		System.out.println(hashMap);   // doesnot maintain insertion order
		
		TreeMap<String,Integer> treeMap = new TreeMap<>(hashMap);
	
		System.out.println(treeMap);
		
		for(Map.Entry<String,Integer> entry : treeMap.entrySet())
		{
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		// if you want to print only keys 
		
	   for(String key : treeMap.keySet())
	   {
		   System.out.println(key);
	   }
	   
	   // if you want to print only values 
	   
	   for(Integer value : treeMap.values()) 
	   {
		   System.out.println(value);
	   }
		
	}     
}
