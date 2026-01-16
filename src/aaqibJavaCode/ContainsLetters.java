package aaqibJavaCode;

public class ContainsLetters {

	
	
	public static boolean letterCheck (String a) {
		
		if (a.matches(".*[a-zA-Z].*")) {
			
			return true;
			
		}
		
		else
			return false;
		
	}
	
}
