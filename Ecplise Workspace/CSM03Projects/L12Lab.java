/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class L12Lab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Max Int:");
		   int max = input.nextInt();
		
		   max(max);
		
	}
	
	

	
		public static void max (int max) {

		
			for (int i = 1; i <= max; i++) {
			    System.out.println("i = " + i + ", running total = " + max);
			    
			}
			
	
			
	}

}
