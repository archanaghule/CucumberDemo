package arrays.com;

import java.util.Arrays;

public class RightRotationOfArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {10,20,30,40,50};   //50,10,20,30,40
		
		int last = array[array.length-1];   //50
		
		for(int i=array.length-1;i>0;i--)
		{
			array[i]=array[i-1];
		}
		
		array[0] = last;

		
		
		System.out.println(Arrays.toString(array));
	}

}
