package arrays.com;

import java.util.Arrays;

public class MoveAllZeroToTheEndOfArray {

	public static void main(String[] args) {

		int[] array = new int[] { 10, 0, 20, 30, 0 };
		
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[count++] = array[i]; // 0 - 10 1-20 2-30 3
			}

		}

		
		 while(count<array.length) 
		  { 
			 array[count++] =0; 
		  }
		 
		 System.out.println(Arrays.toString(array));

	}

}
