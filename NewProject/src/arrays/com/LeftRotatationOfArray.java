package arrays.com;

import java.util.Arrays;

public class LeftRotatationOfArray {

	public static void main(String[] args) {

		int[] array = new int[] {10,20,30,40,50};    //20,30,40,50,10
		int temp = array[0];
		
		for(int i=1;i<array.length;i++)
		{
			array[i-1]= array[i];
		}
		
		array[array.length-1] = temp;
		
		System.out.println(Arrays.toString(array));

	}

}
