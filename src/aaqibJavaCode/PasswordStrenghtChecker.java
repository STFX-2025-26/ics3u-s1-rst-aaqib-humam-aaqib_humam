package aaqibJavaCode;
import java.util.Scanner;
public class PasswordStrenghtChecker {
	
	public static void main(String[] args) {
		
		
		// variables
		String password = "";
		boolean validLength = true;
		boolean hasLetters = true;
		boolean hasNumbers = true;
		boolean hasSpecialChar = true;
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
		
		// if false
		if (validLength == false) {
			
			//check if password contains letters
			hasLetters = ContainsLetters.letterCheck(password);
			
			if (hasLetters == false) {
				
				System.out.println("weak password");
				
			}
			
			if (hasLetters == true) {
				
				//check if password contains numbers
				hasNumbers = ContainsIntegers.hasNumbers(password);
				
				if (hasNumbers == false) {
					
					System.out.println("weak password");
					
				}
				
				if (hasNumbers == true) {
					
					//check for special characters
					hasSpecialChar = ContainsSpecChars.hasSpecChars(password);
					
					if (hasSpecialChar == true) {
						
						System.out.println("strong password but short");
				
					}
					
					if (hasSpecialChar == false) {
						
						System.out.println("okay password but short");
						
					} // end of spec char == false
			
				} // end of has number == true
					
			}  // end of has letter == true
		
		} // end of valid length == false
		
		
		if (validLength == true) {
			
			//check if password contains letters
			hasLetters = ContainsLetters.letterCheck(password);
			
			if (hasLetters == false) {
				
				System.out.println("weak password");
				
			}
			
			if (hasLetters == true) {
				
				//check if password contains numbers
				hasNumbers = ContainsIntegers.hasNumbers(password);
				
				if (hasNumbers == false) {
					
					System.out.println("weak password");
					
				  }
				
				if (hasNumbers == true) {
					
					//check for special characters
					hasSpecialChar = ContainsSpecChars.hasSpecChars(password);
					
					if (hasSpecialChar == true) {
						
						System.out.println("strong password");
				
					}
					
					if (hasSpecialChar == false) {
						
						System.out.println("okay password");
						
					} // end of spec char == false	
					
				} //end of has numbers == true
				
			} // end of has letters == true
			
		} //end of valid lenght == true
	
	} // end of main method
	
} //end of public class
