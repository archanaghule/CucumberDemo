package arrays.com;

public class PrimeFactors {

	public static void main(String[] args) 
	{

		int number = 36;
	
		for(int i = 2; number>1; i++) 
		{
	         while(number%i == 0) 
	         {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	    }
			  
    }

}


