package CodesString;

public class SumOfAllNumberPresentInTheString {

	public static void main(String[] args) {
		
		String str = "jklmn489pjro635ops";
		
		int sum =0;
		
		for(int i=0;i<str.length();i++)
		{
		     char ch = str.charAt(i);
		     
		     if(Character.isDigit(ch))
		     {
		    	 int num = Integer.parseInt(str.valueOf(ch));
		    	 sum = sum+num;
		     }
		}
		System.out.println("sum of all digit present in the string:"+sum);

	}

}
