/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class ConcertTickets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		 
        
 
        System.out.println("Enter one character for section - F: Front  C: Center  S: Side  U: Upper");
        char section = input.next().charAt(0);
 
        // Convert to uppercase so both "f" and "F" are accepted.
        section = Character.toUpperCase(section);
 
        
        // (F, C, S, U) 
        String sectionName;
        switch (section) {
        	case 'F':
                sectionName = "Front";
                break;
            case 'C':
                sectionName = "Center";
                break;
            case 'S':
                sectionName = "Side";
                break;
            case 'U':
                sectionName = "Upper";
                break;
            default:
                System.out.println("Invalid section");
                input.close();
                return; // end the program, no valid section entered
        }
 
        System.out.println("Selected " + sectionName + " Section");
 
        //ticket price section
 
        System.out.println("Enter row");
        int row = input.nextInt();
 
       
       
        int price;
        if (row < 1 | row > 60) 
        {
            System.out.println("Invalid row");
            input.close();
            return; // end the program, no valid row entered
        } 
        else if (row <= 15) {
            price = 450;
        } 
        else if (row <= 30) {
            price = 300;
        } 
        else { // row is between 31 and 60
            price = 200;
        }
 
        System.out.println("Section " + section + " row " + row + " price: $" + price);
 
        input.close();
    

		
	}

}
