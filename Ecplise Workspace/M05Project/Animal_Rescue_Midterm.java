/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */




public class Animal_Rescue_Midterm {

	static final int daysPerWeek  = 7;
	static final double mediumMin = 20.0;
	static final double largeMin = 50.0;
	static final double extraLargeMin = 100.0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//displayOverview();
		
		int numAnimals = getAnimalNumber(input);
		
		//Parallel arrays: same index = same animal
		
		String[] names = new String[numAnimals];
		double[] weights = new double[numAnimals];
		double[] dailyFood = new double [numAnimals];
		double[] weeklyFood = new double [numAnimals];
		
		System.out.println("Animal Entry");
		
		//Process each animal
		
		for (int index = 0; index < numAnimals; index++)
		{
			System.out.printf("======= Animal %d ===========" index + 1);
			names[index] = getAnimalName(input);
			weights[index] = getPositiveNumber(input, "Enter weight in pounds: ");
			dailyFood[index] = getPositiveNumber(input, "Enter daily food amount in cups: ");
			weeklyFood[index] = calcWeeklyFood(dailyFood[index]);
 
			displayAnimalSummary(names[index], weights[index], dailyFood[index], weeklyFood[index]);
		}
		
		
		
		
	}

}
