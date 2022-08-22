package CodesString;

public class CheckStringImmutable {

	public static void main(String[] args) {
		
		String str = "lalita";   // string are immutable in nature we can not modified the string object
	    str.concat("funde");
		System.out.println(str);

		
		StringBuffer sb = new StringBuffer("lalita");   // mutable in nature    
		sb.append("funde");
		System.out.println(sb);
		
	}

}
