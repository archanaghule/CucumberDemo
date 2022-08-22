package arrays.com;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot
{
   public static void main(String[] args)
   {
     int array[] = {1,3,4,5};
     System.out.println(isSorted(array));
   }
     public  static boolean isSorted(int[] array) {
		 
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]<array[i+1])
			{
				return true;
			}
		}
		return false;
     
     }

}
