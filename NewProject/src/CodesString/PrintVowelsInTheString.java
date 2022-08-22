package CodesString;

import java.util.HashSet;

public class PrintVowelsInTheString {
	
	public static boolean isVowels(Character ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='O'||ch=='u')
		{
			return true;
		}
		else
		{
		 return false;
		}
	}
	

	public static void main(String[] args) {
		String str = "lalita";
		
		HashSet<Character> hashSet = new HashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			
			if(isVowels(ch))
			{  		
			   	hashSet.add(ch);
			}
		}
		
		System.out.println(hashSet);

	}

}
