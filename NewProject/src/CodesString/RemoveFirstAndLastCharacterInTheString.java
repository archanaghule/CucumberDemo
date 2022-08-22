package CodesString;

public class RemoveFirstAndLastCharacterInTheString {

	public static void main(String[] args) {

     String str = "lalita";
     String finalString = "";
     
     for(int i=0;i<str.length();i++)
     {
    	  finalString = str.substring(1, str.length()-1);
     }
     System.out.println(finalString);
	}

}
