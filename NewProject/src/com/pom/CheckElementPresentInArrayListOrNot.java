package com.pom;

import java.util.ArrayList;
import java.util.List;

public class CheckElementPresentInArrayListOrNot {

	public static void main(String[] args) {
		 List<Integer> arrayList = new ArrayList<Integer>();
		    arrayList.add(10);
		    arrayList.add(20);
		    arrayList.add(10);
		    arrayList.add(30);
		    arrayList.add(20);
		    
		    System.out.println(arrayList);
		    
		    if(arrayList.contains(10))
		    {
		    	System.out.println("element is present");
		    }
		    else
		    {
		    	System.out.println("element is not present");
		    }

	}

}
