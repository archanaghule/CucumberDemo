package CodesString;

public class LengthOfstring {

	public static void main(String[] args) {

     String str = "lalita";
     int count=0;
      
     char[] array = str.toCharArray();
     
     for(int i=0;i<array.length;i++)
     {
    	 count++;
     }
    System.out.println("length of the string is:"+count);

	}

}
