package arrays.com;

public class CheckPrimeNumberOrNot {

	public static void main(String[] args) {
		
		int number = 7,count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("Given number is prime number");
		}
		else
		{
			System.out.println("given number is not prime number");
		}

	}

}
