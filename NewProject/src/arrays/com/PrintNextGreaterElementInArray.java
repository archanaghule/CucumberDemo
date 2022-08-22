package arrays.com;

public class PrintNextGreaterElementInArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {10,11,5,4,7};
		int next ,i,j;
		
		for(i=0;i<array.length;i++)
		{
			next = -1;
			for(j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					 next =array[j];
					 break;
				}
				
			}
			
			System.out.println(array[i]+" "+next);
		}
		
	}

}
