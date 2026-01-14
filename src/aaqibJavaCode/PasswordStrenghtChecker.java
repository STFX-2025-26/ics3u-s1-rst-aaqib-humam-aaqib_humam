package aaqibJavaCode;
import java.util.Scanner;
import aaqibJavaCode.StringLength;
public class PasswordStrenghtChecker {

	public static void main(String[] args) {
		
		
		// variables
		String password = "";
		boolean validLength = true;
		boolean hasletters = true;
		boolean hasNumbers = true;
		boolean hasSpecialChar = true;
		boolean isStrong = true;
		Scanner sc = new Scanner (System.in);
		
		// user input
		
		try {
			
			password = sc.next();
			
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//length checker
		
		validLength = StringLength.lengthCheck(password);
		
		if (validLength == true) {
			
			//check if password contains letters
			System.out.println("yes");
			
			
		}
		
	}

}
