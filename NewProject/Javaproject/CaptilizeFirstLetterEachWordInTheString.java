package CodesString;

public class CaptilizeFirstLetterEachWordInTheString {

	public static void main(String[] args) {
		
		String str = "lalita funde";
	//	System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
		
		String[] array = str.split(" ");
		
		for(int i=0;i<array.length;i++)
		{
			String word = array[i];
			String firstUpperCase =Character.toUpperCase(word.charAt(0))+word.substring(1);
			System.out.println(firstUpperCase);
	
	}

	}
}