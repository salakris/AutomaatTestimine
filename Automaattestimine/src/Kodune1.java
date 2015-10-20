import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Kodune1 {

	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static Pattern pattern;
	private static Matcher matcher;
	
	public static void main(String[] args) {
		System.out.println(emailVerifier("mari.maasikas@hot.ee")); // true
		System.out.println(emailVerifier(".marimaasikas@hot.ee")); // false
		System.out.println(emailVerifier("b4n4n4@gmail.com")); // true
		System.out.println(emailVerifier("t.e.r.e@tere")); // false
		System.out.println(emailVerifier("email@tere.e")); // false
		System.out.println(getDomain("iti0011@cs.ttu.ee")); // cs.ttu.ee
		System.out.println(getDomain("mail.ee")); // NULL	
		System.out.println(getDomain("salakris@gmail.com")); // gmail.com
	}
 
	/**
	* Checks if given email address is valid.
	* 1. Email address is made up of local-part, an @ symbol and a domain part.
	* 2. Email contains only alphanumeric characters (a-z, A-Z, 0-9), point (.) and @ symbol.
	* 3. Local-part can contain zero or one point ('.' character), but it can not be first or last character of local-part
	* 	(Example: john.smith -> true; .johnsmith -> false)
	* 4. Domain part has to contain at least one point ('.' symbol), which can not be first or last character of domain part
	* 	(Example: gmail.com -> true; gmailcom. -> false)
	* 5. The length of the last part of domain (what comes after the last point) has to be between 2 and 6 (both inclusive).
	* 	(Example: hell.o -> false (too short) and long.something (too long) -> false; gmail.com -> true)
	* 
	* @param email
	* @return true if email is valid, false otherwise
	*/
	public static boolean emailVerifier (String email) {
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
 
	/**
	* Given an correct email returns the domain part
	* Domain part comes after @ symbol
	* Example: 
	* Input - john.smith@gmail.com; return - gmail.com
	* @param email
	* @return domain
	*/
	public static String getDomain (String email) {
		if (pattern.matcher(email).equals(false)){
			return null;
		}else {
			String[] tokens = email.split("@");
			return tokens[0];
		}
		
			    
	}

}
