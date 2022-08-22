package CodesString;

import java.util.Arrays;

public class SortStringArrayBasedOnLength {

	public static void main(String[] args) {
		String S = "No one could disentangle correctly";
        String W[] = S.split(" ");
        Arrays.sort(W, new StringLengthComparator());
        for(String str: W)
        System.out.println(str); //print Your Expected Result.
	}

}
