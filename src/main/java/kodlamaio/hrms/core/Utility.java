package kodlamaio.hrms.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean validateEmail(String emailStr) {
		    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		    return matcher.find();
	}
	
	public static void sendActivationEmail(String email) {
		System.out.println(email + " adresine doğrulama linki gönderildi");
	}

}
