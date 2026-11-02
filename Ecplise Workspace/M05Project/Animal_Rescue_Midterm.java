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
public class Animal_Rescue_Midterm {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        //  User Story 1: Program Overview 
        displayOverview();
 
        // Ask how many animals will be entered (must be a whole number > 0)
        int numAnimals = getValidPositiveInt(input, "Enter number of animals: ");
 
        
        //arrays store animal data
        String[] names = new String[numAnimals];
        double[] dailyFoods = new double [numAnimals];
        double[] weeklyFoods = new double [numAnimals];
        
        
        
        
        // Process each animal one at a time: enter, calculate, categorize, display
        for (int i = 1; i <= numAnimals; i++) {
 
            System.out.println();
            System.out.println("Enter data for animal " + i);
 
            //  User Story 3: Enter and Validate Animal Data 
            String name = getAnimalName(input, "Enter animal name: ");
            double weight = getValidPositiveDouble(input, "Enter weight in pounds: ");
            double dailyFood = getValidPositiveDouble(input, "Enter daily food amount: ");
 
            // User Story 4: Calculate Weekly Food Amount 
            double weeklyFood = calculateWeeklyFood(dailyFood);
 
            //User Story 5: Determine Animal Weight Category 
            String category = determineWeightCategory(weight);
 
            //  Display Individual Animal Summary 
            displayAnimalSummary(name, weight, category, dailyFood, weeklyFood);
            
            // Save this animal's data in the arrays (index starts at 0)
            names[animalNumber - 1] = name;
            dailyFoods[animalNumber - 1] = dailyFood;
            weeklyFoods[animalNumber - 1] = weeklyFood;
        }
        //Total WeeklyFood Required
        	double totalWeeklyFood = calculateTotal(weeklyFoods);
        	
        // User Story 8: Average Daily Food Amount -----
            double averageDailyFood = calculateAverage(calculateTotal(dailyFoods), numAnimals);
     
        // Display the rescue summary, then the animals at or above average
            displayRescueSummary(numAnimals, totalWeeklyFood, averageDailyFood);
     
        //  User Story 9: Animals At or Above Average Daily Food 
            displayAboveAverage(names, dailyFoods, averageDailyFood);
        
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
        System.out.println("      Small: less than 20 lbs");
        System.out.println("      Medium: 20 to less than 50 lbs");
        System.out.println("      Large: 50 to less than 100 lbs");
        System.out.println("      Extra Large: 100 lbs or greater");
        System.out.println("  calculate the average daily food amount for all animals");
        System.out.println("  identify animals that eat at or above the average daily food amount");
        System.out.println("  calculate the total amount of food needed for all animals for one week");
        System.out.println();
        System.out.println("The program displays each animal's information and a summary of the rescue's food needs.");
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
  

 		

    public static double calculateTotal(double[] amounts) {
    	double total = 0;
			
	for (int animalNumber = 0; animalNumber < amounts.length; animalNumber++)
	{
		total += amounts[animalNumber];
	}
		return total;
	}
    public static double calculateAverage(double total, int numAnimals) {
    	return total / numAnimals;
}








    
    
    
    
    
    
    
 // Lists each animal that eats at or above the average 3
    public static void displayAboveAverage(String[] names, double[] dailyFoods,
                                            double averageDailyFood) {
        System.out.println();
        System.out.println("Animals At or Above Average Daily Food Amount:");
 
        for (int animalNumber = 0; animalNumber < names.length; animalNumber++) {
            if (dailyFoods[animalNumber] >= averageDailyFood) {
                System.out.printf("%s: %.2f cups%n", names[animalNumber], dailyFoods[animalNumber]);
            }
        }
    }
}
