package CodesString;

public class PrintFirstLetterofEachWordInString {

	public static void main(String[] args) {
		
		String str = "learn java concept";
		
		String array[] = str.split(" ");
		
		for(int i=0;i<array.length;i++)
		{
			String word =array[i];
			System.out.println(word.charAt(0));
		}
		
	}

}
