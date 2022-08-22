package CodesString;

public class FindSumOfNumberInTheString {

	public static void main(String[] args) {
	
		String str = "hello57dk25Gautham";  // output - 57+25 = 82
		
		int sum =0;
		String num ="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				num = num+ch;   //num =57
			}
			else
			{
				if(!num.equals(""))
				{
					sum = sum+Integer.parseInt(num);
					num="";
				}
			}
		}
		
		System.out.println("sum of number is :"+sum);
		

	}

}
