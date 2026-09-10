/**
 * 
 */

/**
 * 
 */
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
		
		//Variables for grades 
		 
			double CPG = 89.5;
			double GEG = 90.1;
			double QG = 55.9;
			double PG = 89.34;
			double FDG = 40.1;
		
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
			
			if (finalGrade >= 90 );
			{
				
				
				String letterGrade = "A";
				System.out.print("Final Grade = ");
				System.out.print(letterGrade);
			}
		
			if (finalGrade <= 89 );
			{
				String letterGrade = "B";
				System.out.print("Final Grade = ");
				System.out.print(letterGrade);
			
			}
			
			
			

	}

}
