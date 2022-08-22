package com.pom;

import java.util.HashMap;
import java.util.Map;

public class CheckGivenKeyPresentInHashMapOrNot {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(4, "lalita");
		hashMap.put(2, "sonali");
		hashMap.put(5, "priya");
		hashMap.put(3, "sachin");
		hashMap.put(1, "tina");
		
		System.out.println(hashMap);

		for(Map.Entry entry :hashMap.entrySet())
		{
           System.out.println(entry.getKey()+ " "+entry.getValue());			
		}
		
		if(hashMap.containsKey(2))
		{
			System.out.println("given key is present in the hashmap");
		}
		else
		{
			System.out.println("given key is not present in the hashmap");
		}
	}

}
