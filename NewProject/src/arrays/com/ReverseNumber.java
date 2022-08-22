package arrays.com;

public class ReverseNumber {

	public static void main(String[] args) {
    
		 int n = 123; // reverseNumber = 321
		 int reverseNumber = 0;
		 
		 while(n!=0)
		 {
			 
			 int reminder =n %10;
			 reverseNumber = reverseNumber*10+reminder;
			 n  = n/10;
		 }
	
		 System.out.println("reverse number is :"+reverseNumber);
		
	}

	
}

