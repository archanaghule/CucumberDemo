package CodesString;

public class StringPanagram {

	public static void main(String[] args) {
		
		String str = "Hello Word";   // the string having all 26 character that string is called panagram string
		panagram(str);
		
	}

	private static boolean panagram(String str) {
	
		if(str.length()<26)
		{
			return false;
		}
		else
		{
		   for(char ch='a';ch<='z';ch++)
		   {
			   if(str.indexOf(ch)<0)
			   return false;
		   }
		}
			
		return true;
		
	}

}
