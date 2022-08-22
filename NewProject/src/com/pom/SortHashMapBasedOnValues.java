package com.pom;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMapBasedOnValues {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hashMap = new HashMap<>();
		hashMap.put("lalita", 10);
		hashMap.put("ashi", 50);
		hashMap.put("rani", 20);
		hashMap.put("golya",40);
		
		System.out.println(hashMap);  
		
		List<Map.Entry<String,Integer>>list = new LinkedList<Map.Entry<String,Integer>>(hashMap.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>()
	{
	   public int compare(Map.Entry<String, Integer> o1,
                          Map.Entry<String, Integer> o2)
       {
           return (o1.getValue()).compareTo(o2.getValue());
       }	
  });
		
		  HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
	        for (Map.Entry<String, Integer> entry : list) {
	            System.out.println(entry.getKey()+" "+entry.getValue());
	        }
		
		
	}

}
