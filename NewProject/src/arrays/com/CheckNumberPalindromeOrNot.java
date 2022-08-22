package arrays.com;

public class CheckNumberPalindromeOrNot {

	public static void main(String[] args) {
		
		int number = 121;
		
		int reverseNumber = 0;
		
		int originalNumber = number;
		
		while(number!=0)
		{
			int reminder = number%10;
			reverseNumber = reverseNumber*10+reminder;
			number = number /10;
			
		}
		
		System.out.println(reverseNumber);
		
		if(originalNumber==reverseNumber)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}

	}

}
