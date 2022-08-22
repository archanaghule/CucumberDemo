package CodesString;

import java.util.LinkedHashMap;

public class longestSubstring {

	public static void main(String[] args) {
		
		String str = "java";
		
		String longestSubstring = "";
		int longestSubstringLength = 0;
		
		LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<Character,Integer>();
		
        for(int i=0;i<str.length();i++)
        {
        	char ch = str.charAt(i);
        	
        	if(linkedHashMap.containsKey(ch))
        	{
        		i = linkedHashMap.get(ch);
        		linkedHashMap.clear();
        	}
        	else
        	{
        		linkedHashMap.put(ch, i);   //j-0, a-1 ,v-2
        	}
        	
        	 if(linkedHashMap.size()>longestSubstringLength)
             {
             	longestSubstringLength = linkedHashMap.size();
             	longestSubstring = linkedHashMap.keySet().toString();
             }
             
        }
		
       
        System.out.println("longest substrin in the hashmap is:"+longestSubstring);
        System.out.println("longest substrin in the hashmap is:"+longestSubstringLength);
        
        

	}

}
