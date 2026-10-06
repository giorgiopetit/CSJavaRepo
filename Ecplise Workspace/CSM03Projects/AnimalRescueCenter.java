/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
 
/**
 * L13 Lab - Animal Rescue Center
 *
 * Collects information about animals at a rescue (name, weight, daily
 * food amount), then calculates each animal's weekly food amount and
 * weight category, and displays a summary for each animal.
 */
public class AnimalRescueCenter {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        // ----- User Story 1: Program Overview -----
        displayOverview();
 
        // Ask how many animals will be entered (must be a whole number > 0)
        int numAnimals = getValidPositiveInt(input, "Enter number of animals: ");
 
        // Process each animal one at a time: enter, calculate, categorize, display
        for (int i = 1; i <= numAnimals; i++) {
 
            System.out.println();
            System.out.println("Enter data for animal " + i);
 
            // ----- User Story 3: Enter and Validate Animal Data -----
            String name = getAnimalName(input, "Enter animal name: ");
            double weight = getValidPositiveDouble(input, "Enter weight in pounds: ");
            double dailyFood = getValidPositiveDouble(input, "Enter daily food amount: ");
 
            // ----- User Story 4: Calculate Weekly Food Amount -----
            double weeklyFood = calculateWeeklyFood(dailyFood);
 
            // ----- User Story 5: Determine Animal Weight Category -----
            String category = determineWeightCategory(weight);
 
            // ----- User Story 6: Display Individual Animal Summary -----
            displayAnimalSummary(name, weight, category, dailyFood, weeklyFood);
        }
 
        input.close();
    }
 
    /**
     * Displays the program overview/banner described in User Story 1.
     */
    public static void displayOverview() {
      
        System.out.println("Animal Rescue Center Analysis");
       System.out.println();
        System.out.println("The rescue employee enters the number of animals currently in the rescue.");
        System.out.println("For each animal, the employee enters:");
        System.out.println("-name");
        System.out.println("-weight in pounds");
        System.out.println("-daily food amount in cups");
        System.out.println();
        System.out.println("The program analyzes the animal information to:");
        System.out.println("  calculate each animal's weekly food amount");
        System.out.println("  categorize each animal by weight");
    }
 
    
     //Prompts for and reads an animal's name. Name must be a single word
     //with no spaces, so next() is used instead of nextLine().
     
    public static String getAnimalName(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.next();
    }
 
    
     //Prompts for and validates a decimal value that must be greater
     //than 0. 
    public static double getValidPositiveDouble(Scanner input, String prompt) {
        double value;
 
        System.out.print(prompt);
        value = input.nextDouble();
 
        while (value <= 0) {
            System.out.println("Error: value must be greater than 0.");
            System.out.print(prompt);
            value = input.nextDouble();
        }
 
        return value;
    }
 
    
     //Prompts for and validates a whole number value that must be
     // greater than 0. Re-prompts with an error message until a valid
     // value is entered.
     
    public static int getValidPositiveInt(Scanner input, String prompt) {
        int value;
 
        System.out.print(prompt);
        value = input.nextInt();
 
        while (value <= 0) {
            System.out.println("Error: value must be greater than 0.");
            System.out.print(prompt);
            value = input.nextInt();
        }
 
        return value;
    }
 
    public static double calculateWeeklyFood(double dailyFood) {
        return dailyFood * 7;
    }
 
   
    public static String determineWeightCategory(double weight) {
        String category;
 
        if (weight < 20) {
            category = "Small";
        } else if (weight < 50) {
            category = "Medium";
        } else if (weight < 100) {
            category = "Large";
        } else {
            category = "Extra Large";
        }
 
        return category;
    }
 
   
    public static void displayAnimalSummary(String name, double weight, String category,
                                             double dailyFood, double weeklyFood) {
        System.out.println();
        System.out.println("========== Animal Summary ==========");
        System.out.println();
        System.out.println("Animal Name: " + name);
        System.out.printf("Weight: %.2f lbs%n", weight);
        System.out.println("Weight Category: " + category);
        System.out.printf("Daily food amount: %.2f cups%n", dailyFood);
        System.out.printf("Weekly food amount: %.2f cups%n", weeklyFood);
    }
}