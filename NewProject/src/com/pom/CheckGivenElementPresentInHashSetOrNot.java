package com.pom;

import java.util.HashSet;
import java.util.Set;

public class CheckGivenElementPresentInHashSetOrNot {

	public static void main(String[] args) {

		Set<String> hashset = new HashSet<String>();
		hashset.add("lalita");
		hashset.add("ashivini");
		hashset.add("priyanka");
		hashset.add("babu");
		
		System.out.println(hashset);
		
		for(String element : hashset) 
		{
			System.out.println(element);
		}
		
		if(hashset.contains("lalita"))
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not present");
		}

	}

}
