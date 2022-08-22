package com.pom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseOrIterateArrayList {

	public static void main(String[] args) {
		// Different ways to trasverse or iterate the arraylist
		
		 List<Integer> arrayList = new ArrayList<Integer>();
		    arrayList.add(10);
		    arrayList.add(20);
		    arrayList.add(10);
		    arrayList.add(30);
		    arrayList.add(20);
		    
		    System.out.println(arrayList);
		    
		    //simple for loop
		    
		    System.out.println("print the arraylist using normal for loop");
		    
		    for(int i=0;i<arrayList.size();i++)
		    {
		    	System.out.println(arrayList.get(i));
		    }
		    
		    
		    System.out.println("print the arraylist using advanced for loop");
		    // advanced for loop
		    
		    for(Integer element : arrayList)
		    {
		    	System.out.println(element);
		    }

		    System.out.println("print arraylist element using iterator");
		    
		    Iterator it = arrayList.iterator();
		    while(it.hasNext())
		    {
		    	System.out.println(it.next());
		    }
		    
	}

}
