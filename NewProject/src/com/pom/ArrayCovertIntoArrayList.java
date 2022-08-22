package com.pom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCovertIntoArrayList {

	public static void main(String[] args) {

    Integer[] array = new Integer[] {1,2,3,4,5};
    List<Integer> arrayList = Arrays.asList(array);
    System.out.println(arrayList);
//    
//    arrayList.add(2);
//    arrayList.add(3);
//    arrayList.add(6);
//    
//    System.out.println("after adding the element in the array="+arrayList);
    
    
    
    // 2nd question 
    
    Integer[] array1 = new Integer[] {1,2,3,4,5};
    List<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(array1));
    System.out.println(arrayList1);
    
    arrayList1.add(2);
    arrayList1.add(3);
    arrayList1.add(6);
    
    System.out.println("after adding the element in the array="+arrayList1);
    
    
    

	}

	
	
	
}
