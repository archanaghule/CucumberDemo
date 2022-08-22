package arrays.com;

public class CheckGivenNumberIspalindromeOrNot {

	public static void main(String[] args) {
	    
		 int n = 121; // reverseNumber = 321
		 int reverseNumber = 0;
		 
		 int num = n;
		 while(num!=0)
		 {
			
			 int reminder =num %10;
			 reverseNumber = reverseNumber*10+reminder;
			 num  = num/10;
		 }
	
		 System.out.println("reverse number is :"+reverseNumber);
		 
		 if(reverseNumber==n)
		 {
			 System.out.println("given number is palindrome");
		 }
		 else
		 {
			 System.out.println("given number is not palindrome");
		 }
		
	}

}
