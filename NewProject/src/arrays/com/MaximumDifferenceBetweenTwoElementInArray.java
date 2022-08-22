package arrays.com;

import java.util.Arrays;

public class MaximumDifferenceBetweenTwoElementInArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {10,40,20,50,60};
		
		Arrays.sort(array);
		
		//System.out.println(array[0]);   //minimum element
		
		//System.out.println(array[array.length-1]);  //maximum element in the array
		
		int minimumElement =array[0];
		int maxElement = array[array.length-1];
		
		int maxDifferenceElement = maxElement-minimumElement;
		
		System.out.println(maxDifferenceElement);
		
	
		
		
			
		

	}

}
