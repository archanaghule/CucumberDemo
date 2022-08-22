package CodesString;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
		
		String str = "lalita";
		char[] array = str.toCharArray();
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
