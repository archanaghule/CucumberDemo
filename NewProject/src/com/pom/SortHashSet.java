package com.pom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortHashSet {

	public static void main(String[] args) {
		
		// sort hashset with the help of arraylist
		
		Set<String> hashset = new HashSet<String>();
		hashset.add("lalita");
		hashset.add("ashivini");
		hashset.add("priyanka");
		hashset.add("babu");
		
		System.out.println(hashset);
		
		List<String> arrayList = new ArrayList<String>(hashset);
		
		// sort data in asending order
		Collections.sort(arrayList);
		
		System.out.println(arrayList);
		
		//sort data in desending order.
		
		Collections.sort(arrayList,Collections.reverseOrder());
		
		System.out.println(arrayList);
		
		
		/*********************2nd approches *****************/
		
		TreeSet<String> treeSet = new TreeSet<String>(hashset);
		System.out.println(treeSet);
		
		

	}

}
