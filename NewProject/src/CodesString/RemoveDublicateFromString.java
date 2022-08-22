package CodesString;

import java.util.HashSet;

public class RemoveDublicateFromString {

	public static void main(String[] args) {
		String str  = "java";
		char array[] = str.toCharArray();
		
		HashSet<Character> hashSet = new HashSet<Character>();
		
		for(char c :array)
		{
			hashSet.add(c);
		}

		StringBuffer sb = new StringBuffer();
		for(Character c1 : hashSet)
		{
			sb.append(c1);
		}
		
		System.out.println(sb.toString());
		
	}

}
