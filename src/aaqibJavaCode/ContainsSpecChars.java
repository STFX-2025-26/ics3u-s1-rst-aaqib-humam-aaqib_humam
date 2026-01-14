package aaqibJavaCode;

public class ContainsSpecChars {

	public static boolean hasSpecChars ( String a) {
		
		if (a.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
}
