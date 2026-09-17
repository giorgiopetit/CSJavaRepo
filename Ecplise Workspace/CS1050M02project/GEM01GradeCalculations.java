/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class GEM01GradeCalculations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Name: Giorgio Petit 
  		Class: CS1050 T/TH 
  		Description: Guided Exploration 01       
 		The program will calculate a final grade for this class based on the category weights  
 */ 
		
		//Making someone Input their name
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your name:");
		String name = input.nextLine();
		
		//Inputing Grade and asking what the grade is 
		System.out.print("Enter your Class Participation Grade :");
		double CPG = input.nextDouble();
	
		
		System.out.print("Enter your Guided Exploration Grade: ");
		double GEG = input.nextDouble();
		
		
		System.out.print("Enter your Quiz Grade: ");
		double QG = input.nextDouble();
		
		System.out.print("Enter your Project Grade: ");
		double PG = input.nextDouble();
		
		
		System.out.print("Enter your Final Demenstration Grade: ");
		double FDG = input.nextDouble();
		
		
		//Grade Weights (Constants)
		
			final double GradeWeightCP = .15;
			final double GradeWeightGE = .20;
			final double GradeWeightQ = .25;
			final double GradeWeightP = .20;
			final double GradeWeightFD = .20;
		
		//Equation for calculating grade
		//Varaible names are made by using the first letter of each word, G is grade
		//Exp: CPG = Class Participation Grade
		
			double result = CPG * GradeWeightCP;
			double result2 = GEG * GradeWeightGE;
			double result3 = QG * GradeWeightQ;
			double result4 = PG * GradeWeightP;
			double result5 = FDG * GradeWeightFD;
		
		//Result= answers from equations above
		//Equation below = finalGrade equation 
			
			double finalGrade = result+result2+result3+result4+result5;
		
			
			//showing letter grade based on final grade
			if (finalGrade >= 90 )
			
			{
				
				
				String letterGrade = "A";
				System.out.print("Final Grade = ");
				System.out.print(letterGrade);
			}
			
			else if(finalGrade >= 80 )
			{
			
			
				String letterGrade = "B";
				System.out.print("Final Grade = ");
				System.out.print(letterGrade);
			}
			
			
			else if(finalGrade >= 70 )
			{
				
				String letterGrade = "C";
				System.out.print("Final Grade = ");
				System.out.print(letterGrade);
			}
			
			else if (finalGrade >= 60)
			{
				String letterGrade = "D";
				System.out.print("Final Grade = ");
				System.out.print(letterGrade);
			}
			
			else if (finalGrade < 59)
			{
				String letterGrade = "F";
				System.out.print("Final Grade = ");
				System.out.print(letterGrade);
			}
		input.close();	
		
	}

}
