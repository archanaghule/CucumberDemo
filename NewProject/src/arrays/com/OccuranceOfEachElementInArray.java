package arrays.com;

import java.util.HashMap;

public class OccuranceOfEachElementInArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,2,3,5}; // output : {1=1,2=2,3=2,5=1}
		
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		
		for(int ele : array)
		{
			if(hashMap.containsKey(ele))
			{
				hashMap.put(ele, hashMap.get(ele)+1);
			}
			else
			{
				hashMap.put(ele, 1);
			}
		}
		
		System.out.println(hashMap);

	}

}
