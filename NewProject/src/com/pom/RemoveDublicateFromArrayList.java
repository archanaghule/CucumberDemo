package com.pom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicateFromArrayList {

	public static void main(String[] args) {

    List<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(10);
    arrayList.add(30);
    arrayList.add(20);
    
    System.out.println(arrayList);
    
    Set<Integer> hashSet = new HashSet<Integer>(arrayList);
    System.out.println(hashSet);

	}

}
