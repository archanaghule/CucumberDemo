package CodesString;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		
		String reverseString = "";
		
		String  originalString = str;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseString =reverseString+str.charAt(i);
		}		
		
		
		if(originalString.equals(reverseString))
		{
			System.out.println("given string are palindrome");
		}
		else
		{
			System.out.println("given string are not palindrome");
		}
	}

}
