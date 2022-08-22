package CodesString;

public class CheckStringContainOnlyDigits {

	public static void main(String[] args) {
		
		String str = "123";
		
		System.out.println(checkStringContainsOnlyDigit(str));
		
	}
		public static boolean checkStringContainsOnlyDigit(String str)
		{
			
			for(int i=0;i<str.length();i++)
			{
				if(!Character.isDigit(str.charAt(i)))
				return false;
			}
			
			return true;
					
				
		}

}