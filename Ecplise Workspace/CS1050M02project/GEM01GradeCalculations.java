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
		 
			double CPG = 70.1;
			double GEG = 70.1;
			double QG = 70.2;
			double PG = 70.1;
			double FDG = 70.2;
		
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
			
			else if(finalGrade <= 89 )
			{
			
			
				String letterGrade = "B";
				System.out.print("Final Grade = ");
				System.out.print(letterGrade);
			
			}
			
			else if(finalGrade <= 79 )
			{
				String letterGrade = "C";
				System.out.print("Final Grade = ");
				System.out.print(letterGrade);
			}

	}

}
