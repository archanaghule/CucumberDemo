package com.pom;

import java.util.Arrays;

public class MinAndMaxElementInArray {

	public static void main(String[] args) {

    int[] array = new int[] {10,50,60,30,20};
    Arrays.sort(array);
    System.out.println("minimum element in the array="+array[0]);
    System.out.println("maximum element in the array="+array[array.length-1]);
    System.out.println("2nd maximum element in the array="+array[array.length-2]);    

}
}