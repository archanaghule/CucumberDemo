package arrays.com;

public class CheckmissingNumberInArray {

	public static void main(String[] args) {
		
		int array[] = {1, 2,3,5};
		int sum =0;
		int sum1 =0;
		
		for(int i=0;i<array.length;i++)
		{
			sum = sum+array[i];
		}

		System.out.println("sum of array element is:"+sum);
		
	    
		for(int i=1;i<=5;i++)
		{
			sum1 = sum1+i;
		}
		
		System.out.println("sum of the element is:"+sum1);
		
		int missingNumber= sum1-sum;
		
		System.out.println("array missing number is :"+missingNumber);
	}

}
