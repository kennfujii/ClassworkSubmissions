
public class TwoDArrayPractice 
{

	public static void main(String[] args) 
	{
		String[][] strings = {{"A", "B"},
							  {"A1", "B1"},
							  {"A2", "B2"}};
		print2DArray(strings);
		
		
		double[][] doubles = {{0.0, 0.1},
							{1.0, 1.1},
							{2.0, 2.1}};
		allOnes2D(doubles);
	}
		

	//Task 1: Create a method print2DArray() that is passed a 2D String array and will print
		//out each element in row-major order (instead of column-major order like we did yesterday). 
		public static void print2DArray (String [][] strings)
		{
			int  rows = strings.length;
			int  column = strings[0].length;
			System.out.print("Task 1: " );
			for (int i = 0;  i < rows; i++)
			{
				for (int j= 0; j < column; j++)
				{
					System.out.print(strings [i][j] + " ");
				}
			}
		}
		
	//Task 2: Create a method allOnes2D() that is passed a 2D double array, makes an array of the 
	//same column and row length but all its literals are 0.0 called copyArr, and then changes 
	//each element inside to 1.0 and returns copyArr. (So it is passed a 2D array and returns a 2D 
	//array with all 0.0).	
		public static double [][] allOnes2D(double[][] doubles) {
			int columns  = doubles[0].length;
			int rows = doubles.length;
			
			double [][] copyArr =  new double [rows][columns];
			for  (int i = 0; i< doubles.length; i++)
			{
				for (int j=0; j< doubles[0].length; j++)
				{
					copyArr[i][j] = 1.0;
				}
			}
			return copyArr;
		}
}
