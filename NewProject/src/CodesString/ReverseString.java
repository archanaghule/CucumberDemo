package CodesString;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "lalita";
		String reverse = " ";
		
		for(int i = str.length()-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("reverse string is : "+reverse);
		
	}

}
