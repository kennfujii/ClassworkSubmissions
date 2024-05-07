
public class TwoDArrayTrav {

	public static void main(String[] args) 
	{

	//Task 1: Declare a 2D array of Strings with 7 rows and 6 columns. 
	String[][] name = new String[7][6];
	
	String[][] name1 = {{"A", "B", "C", "D", "E", "F"},
						{"A1", "B1", "C1", "D1", "E1", "F1"},
						{"A2", "B2", "C2", "D2", "E2", "F2"},
						{"A3", "B3", "C3", "D3", "E3", "F3"},
						{"A4", "B4", "C4", "D4", "E4", "F4"},
						{"A5", "B5", "C5", "D5", "E5", "F5"},
						{"A6", "B6", "C6", "D6", "E6", "F6"}};

	//Task 2: One by one, print out the first element in each row, from top to bottom. 	
	System.out.print ("Task 2: ");
	System.out.print(name1 [0][0]+" ");
	System.out.print(name1 [1][0]+" ");
	System.out.print(name1 [2][0]+" ");
	System.out.print(name1 [3][0]+" ");
	System.out.print(name1 [4][0]+" ");
	System.out.print(name1 [5][0]+" ");
	System.out.print(name1 [6][0]+" ");
	System.out.println();
	
	//printing the first element of each row using a for loop 
	int  rows = name1.length;
	int  column = name1[0].length;
	
	//Task 3: The code from Task 2 looks like it could be done using a loop. 
	//Use a loop to print out each row's first element. 
	System.out.print ("Task 3: ");
	for (int i = 0; i<rows; i++)
		{
			System.out.print(name1 [i][0]+ " ");
		}
	System.out.println();

	//Task 4: One by one, print out each element in the first row only, from left to right. 
		//print the elements in the first row
	System.out.print ("Task 4: ");
	System.out.print(name1 [0][0]+" ");
	System.out.print(name1 [0][1]+" ");
	System.out.print(name1 [0][2]+" ");
	System.out.print(name1 [0][3]+" ");
	System.out.print(name1 [0][4]+" ");
	System.out.print(name1 [0][5]+" ");
	System.out.println();
	
	//Task 5: Huh, that last task also looks like it could be done using a loop. 
	//Please use a loop to print out each element in the first row. 
	System.out.print( "Task 5: ");
	for (int i = 0; i<column; i++)
	{
		System.out.print(name1 [0][i] + " ");
	}
	System.out.println();
	
	//Task 6: Copy your code from task 3 and paste it wherever you are doing this task. 
	//Edit it so it prints every element in each row, instead of just the first element. 
	//(Hint: first, make it print the first AND second elements of each row. Then make it print 
	//the first, second, AND the third element of each row. See a patern? If you turn this code into 
	//a loop, your nested loops will print out every element.) 
	System.out.print("Task 6: ");
	for (int j = 0; j<=column; j++)
	{
		for (int k  = 0;  k < column; k++)
		{
		System.out.print(name1 [j][k]+" ");
		}
	}
}
}	
	
