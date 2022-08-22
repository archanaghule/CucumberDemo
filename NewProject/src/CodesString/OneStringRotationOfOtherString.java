package CodesString;

public class OneStringRotationOfOtherString {

	public static void main(String[] args) {
		
		String originalString = "lalita";
		String rotationalString = "talali";
		
		if(originalString.length()!=rotationalString.length())
		{
			System.out.println("rotainal string is not rotataed version of oiginalstring");
		}
		else
		{
			String newString = originalString.concat(originalString);
			
			if(newString.contains(rotationalString))
			{
				System.out.println("one string is rotational of another string");
			}
			else
			{
				System.out.println("one string is not rotational of another string");
			}
		}

	}

}
