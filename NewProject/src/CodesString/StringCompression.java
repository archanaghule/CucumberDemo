package CodesString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {

	public static void main(String[] args) {
		
		String str = "aaabbcc";   // output - a3b2c2
		
		char[] array = str.toCharArray();
		
		HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		
		for(char c : array)
		{
             if(hashmap.containsKey(c))
             {
            	 hashmap.put(c, hashmap.get(c)+1);
             }
             else
             {
            	 hashmap.put(c, 1);
             }
		}
		
		System.out.println(hashmap);
		
		StringBuffer sab = new StringBuffer();
		
		for(Map.Entry<Character, Integer> entry :hashmap.entrySet())
		{
		    sab.append(entry.getKey());
		    sab.append(entry.getValue());
		}
		
		System.out.println(sab);
		
				

	}

}
