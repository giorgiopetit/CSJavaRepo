/**
 * 
 */

/**
 * 
 */
public class L06MathCharsStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double randomDouble = Math.random();
		int randomInt = (int) Math.random();
		randomInt = (int) (Math.random() * 10);
		randomInt = (int) (Math.random() * 10 + 1);

		
		
		char middleInitial = 'M';
		int charAsciiValue = (int)middleInitial; 
		String firstName = "Elaine";
		
		
		char charTest= 'a';
		int charAsciiValue= (int)charTest;
		String firstName = "Heriberto";
		System.out.printf("char: %c ascii value: %d \n", charTest, charAsciiValue);
		System.out.println("Hello " + name);	
		int stringLength = firstName.length();
		char firstInitial = firstName.charAt(0);

	}
}

