package arrays.com;

public class PrintFirstAndLastDigitOfNumber {

	public static void main(String[] args) {
		
		int number = 123;
		int firstDigit = 0;
		int lastDigit = 0;

		lastDigit = number%10;
		
		while(number!=0)
		{
			firstDigit=number%10;
			number = number/10;
		}
		
		System.out.println(firstDigit+" "+lastDigit);
		
	}

}
