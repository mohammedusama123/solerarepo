package dayFiveAssignment;
import java.io.*;
public class NoOfVowelsAndConsonants {
	// Java Program to count vowels, consonant, digits and
	// special character in a given string
	

	

		// Function to count number of vowels, consonant,
		// digitsand special character in a string.
		static void countCharacterType(String str)
		{
			// Declare the variable vowels, consonant, digit
			// and special characters
			int vowels = 0, consonant = 0;
				
		
			// str.length() function to count number of
			// character in given string.
			for (int i = 0; i < str.length(); i++) {
				
				char ch = str.charAt(i);
		
				if ( (ch >= 'a' && ch <= 'z') ||
					(ch >= 'A' && ch <= 'Z') ) {
		
					// To handle upper case letters
					ch = Character.toLowerCase(ch);
		
					if (ch == 'a' || ch == 'e' || ch == 'i' ||
						ch == 'o' || ch == 'u')
						vowels++;
					else
						consonant++;
				}
				
			}
			
			System.out.println("Vowels: " + vowels);
			System.out.println("Consonant: " + consonant);
			
		}
		
		public static void main(String[] args)
		{
			String str = "geeks for geeks121";
			
			countCharacterType(str);
		}
	}




