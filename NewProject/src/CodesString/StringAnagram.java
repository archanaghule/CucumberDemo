package CodesString;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		String str1 = "slient";
		String str2 = "listen";
		Boolean status = true;
		
		if(str1.length()!=str2.length())
		{
			status = false;
			System.out.println(status);
		}
		else
		{
		   char array1[] = str1.toCharArray();
		   char array2[]= str2.toCharArray();
		   Arrays.sort(array1);
		   Arrays.sort(array2);
		   
		   Boolean result  = Arrays.equals(array1, array2);
		   if(result==true)
		   {
			   System.out.println("Both the string are anagram");
		   }
		   else
		   {
			   System.out.println("Both the string are not anagram");
		   }
		}
		

	}

}
