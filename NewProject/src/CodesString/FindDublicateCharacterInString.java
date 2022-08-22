package CodesString;

public class FindDublicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  = "lalita";
		int count=0;
		
		for(int i=0;i<str.length();i++) 
		{
		   for(int j=i+1;j<str.length();j++)
		   {
			 if(str.charAt(i)==str.charAt(j)) 
			 {
				System.out.println("dublicate character in the given string:"+str.charAt(j));
				count++;
			 }
		   }
		}
		
		System.out.println("count of dublicate character is:"+count);
		
	}

}