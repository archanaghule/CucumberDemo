package arrays.com;

public class LeaderOfAnArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {2,8,5,7,1,4};
		
		for( int i=0;i<array.length;i++)
		{
			boolean flag = false;
	        for(int j=i+1;j<array.length;j++)
	        {
	        	if(array[i]<=array[j])
	        	{
	        		flag = true;
	        		break;
	        	}
	        	
	        }
	        
	        if(flag ==false)
	        {
	        	System.out.println("given element is the leader element="+array[i]);
	        }  
		}
		 
		
	}

}
