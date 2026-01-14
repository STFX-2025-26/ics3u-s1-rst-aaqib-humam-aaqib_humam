package aaqibJavaCode;
public class ContainsIntegers {

	
	public static boolean hasNumbers (String a) {
		
		if (a.matches(".*\\d+.*")) {
			
			return true;
		}
		
		else {
			
			return false;
		}
			
		
	}
	
}
