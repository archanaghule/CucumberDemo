package arrays.com;

public class CheckGivenNumberIsStrongOrNot {

	public static void main(String[] args) {

      int number = 145;
      int num = number;
      int sum=0;
      
      while(number!=0)
      {
    	  int reminder=number%10;
    	  
    	  int fact =1;
    	  for(int i = reminder;i>=1;i--)
    	  {
    		  fact = fact*i;
    	  }
    	  
    	  sum = sum+fact;
    	  number = number/10;
      }
      
     if(sum==num)
     {
    	 System.out.println("given number is strong number");
     }
     else
     {
    	 System.out.println("given number is not strong number");
     }

	}

}
