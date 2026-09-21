/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Madlav {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //questions system asks user
		
		        Scanner input = new Scanner(System.in);
		 
		        System.out.print("Enter a first name: ");
		        String firstName = input.next();
		 
		        System.out.print("Enter a last name: ");
		        String lastName = input.next();
		 
		        System.out.print("Enter a noun: ");
		        String noun = input.next();
		 
		        System.out.print("Enter a verb ending in -ing: ");
		        String verb = input.next();
		 
		        System.out.print("Enter an adjective: ");
		        String adjective = input.next();
		 
		        System.out.print("Enter a place: ");
		        String place = input.next();
		 
		       
		        System.out.print("Enter your favorite letter: ");
		        String favoriteLetterInput = input.next();
		 		        char favoriteLetter = favoriteLetterInput.charAt(0);
		 
		        // Extract the first character of the first name.
		        char firstInitial = firstName.charAt(0);
		 
		        // Extract the first character of the last name 
		        char lastInitial = lastName.charAt(0);
		 
		       
		        String text = "Once upon a time, " + firstName + " " + lastInitial
		                + " was " + verb + " through the " + place + " with a "
		                + noun + ". It was a very " + adjective + " day. "
		                + "Their favorite letter was " + favoriteLetter + ".";
		 
		        // Print the finished Mad Lib story.
		        System.out.println(text);
		 
		        input.close();
		    }
			
		
		
		
		
		
		

	}


