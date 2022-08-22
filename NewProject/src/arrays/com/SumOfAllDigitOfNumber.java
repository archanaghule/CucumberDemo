package arrays.com;

public class SumOfAllDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 123;
		int sum=0;
		
		while(number!=0)
		{
			int reminder =number%10;
			sum = sum+reminder;
			number= number/10;
		}
		System.out.println("sum of all digit of a number is:"+sum);

	}

}
