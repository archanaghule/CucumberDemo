package arrays.com;

public class OccuranceOfNumberInArray {

	public static void main(String[] args) {


		// input - 1,2,4,5,6,2
		//output - occurance of 2 is 2 
		
		int[] array = new int[] {1,2,4,5,6,2};
		int x =2;
		int count=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==x)
			{
				count++;
			}
			
		}

		System.out.println("occurance of 2 is :"+count);
	}

}
