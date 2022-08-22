package arrays.com;

public class CheckNumberIsAmstrongOrNot {

	public static void main(String[] args) {
		
		int number = 153;
		int sum =0;
		
		int originalNumber =number;
		
		while(number!=0)
		{
			int reminder = number%10;
			sum= sum+reminder*reminder*reminder;
			number= number/10;
			
		}
		int newNumber =sum;
		System.out.println(newNumber);
		
		if(originalNumber==newNumber)
		{
			System.out.println("given number is armstrong number");
		}
		else
		{
			System.out.println("given number is not armstrong");
		}
	}

}
