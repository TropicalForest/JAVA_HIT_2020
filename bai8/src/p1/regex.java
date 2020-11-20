package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] args) {
		Matcher matcher;
		String regexUsername = "^[a-zA-Z0-9]{6,}$";
		String regexPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[0-9a-zA-Z]+$";
		
		String username = "tuanmc28";
		String password = "fjo3232g4HH23";
		
		Pattern patternUsername = Pattern.compile(regexUsername);
		Pattern patternPassword = Pattern.compile(regexPassword);
		
		matcher = patternUsername.matcher(username);
		System.out.println("Check username: "+ patternUsername.matcher(username).find());
		matcher = patternPassword.matcher(password);
		System.out.println("Check password: "+ matcher.find());
	}
}
