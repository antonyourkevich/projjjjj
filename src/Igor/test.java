package Igor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

	public static boolean test(String testString){
	 Pattern p = Pattern.compile("[a-z]{4}");
	 Matcher m = p.matcher(testString);
	 return m.matches();
	 
	
	}
	
	public static void main(String [] args)
	{

		 System.out.println(test("fghh"));
	}
}
