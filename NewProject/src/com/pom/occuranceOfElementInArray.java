package com.pom;

public class occuranceOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[] {2,3,1,1,4,5};
		int x=1;
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==x)
			{
				count++;
			}	
		}
		
		System.out.println("occurance of 1 element in the array="+count);

	}

}
