package CodesString;

public class swapTwoString {

	public static void main(String[] args) {

		 String a = "lalita";
		 String b = "funde";
		 
		 System.out.println("before swapping of the word="+a+ " "+b);
		 
		 a = a+b;      //lalitafunde
		 
		 b = a.substring(0, a.length()-b.length());
		 
		 a = a.substring(b.length());
		 
		 System.out.println("after swapping the word="+a+" "+b);
	}

}
