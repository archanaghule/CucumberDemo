package CodesString;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacterInTheString {

	public static void main(String[] args) {
		
		String str = "laliata";//output :  l=2, a=2,i=1,t=1
		char array[] = str.toCharArray();
		
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		
		for(char c : array)
		{
			if(hashMap.containsKey(c))
			{
				hashMap.put(c, hashMap.get(c)+1);
			}
			else
			{
				hashMap.put(c, 1);
			}
		}
		
		System.out.println(hashMap);
		
		char maxKey= 0;
		int maxCount = 0;
		
		for(Map.Entry<Character,Integer> entry: hashMap.entrySet())
		{
			if(entry.getValue()>maxCount)
			{
				maxCount = entry.getValue();
				maxKey= entry.getKey();
			}
		}

		System.out.println("maxiumum occurance of character in the string is :"+maxKey);
	}

}
