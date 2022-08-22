package arrays.com;

public class FindLCMOfGivenNumber {

	public static void main(String[] args) {
		
		int num1 = 4 ,num2 =6;  //LCM - least common multiple
		
		int Lcm;
        for(Lcm=1;Lcm<=num1*num2;Lcm++)
        {
        	if(Lcm%num1==0 && Lcm%num2==0)
        	{
        		break;
        	}
        }
		
        System.out.println("lcm of two number is:"+Lcm);
	}

}
