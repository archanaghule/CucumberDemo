package arrays.com;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int number =5;
		int fact =1;
		
		for(int i=number;i>=1;i--)
		{
			fact = fact*i;
		}

     System.out.println("factorial of given number is:"+fact);		
 	}

}
