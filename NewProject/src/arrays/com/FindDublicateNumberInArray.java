package arrays.com;

public class FindDublicateNumberInArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,2,5,3,5};
		int count=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println("dublicate number is :"+array[j]);
					count++;
				}
			}
		}
		System.out.println("count of dublicate number is:"+count);
		
	}

}
