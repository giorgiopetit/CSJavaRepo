/**
 * 
 */

/**
 * 
 */

import java.util.Scanner;
public class userlogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Create Strings to hold correct username and password
		//Correct usernameCorrect: Test
		//Correct passwordCorrect: p@$$
	Scanner input = new Scanner (System.in);
		String correctUsername = "Test";
		String correctPassword = "p@$$";
		
		System.out.print("Enter Username: ");
		String username = input.next();
		
		
		
		
		
	
	if (username != "Test" )
	{
	System.out.println("Correct");	
	}

	System.out.println("Enter Password: " ) ;		
	
		if( correctPassword != "p@$$")	
			{	
			System.out.print("Correct");
			}
	
	

	
	
	
	
	
		
	}
}