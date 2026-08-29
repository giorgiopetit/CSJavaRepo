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
		
		//Variables for grades 
		 
		double CPG = 67.4;
		double GEG = 60.9;
		double QG = 100.0;
		double PG = 72.4;
		double FDG = 87.3;
		
		//Grade Weights (Constants)
		
		final double GradeWeightCP = .15;
		final double GradeWeightGE = .20;
		final double GradeWeightQ = .25;
		final double GradeWeightP = .20;
		final double GradeWeightFD = .20;
		
		//Equation for calculating grade
		
		double result = CPG * GradeWeightCP;
		double result2 = GEG * GradeWeightGE;
		double result3 = QG * GradeWeightQ;
		double result4 = PG * GradeWeightP;
		double result5 = FDG * GradeWeightFD;
		
		System.out.print("Final Grade = ");
		System.out.print(result+result2+result3+result4+result5);
		
		// TODO Auto-generated method stub

	}

}
