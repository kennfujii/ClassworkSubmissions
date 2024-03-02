public class printPrevNextElement {

//Make a method that is passed an array of doubles nums and an int n. 
//The method should print out the number before and after the n'th element.
	public static void main(String[] args) 
	{
		//given array
		double[] arr = { 3.26, 8.84, 9.63, -4.22, 12.80 } ;

		//given index
		int index = 2;

		//given method name and parameters
		printPrevnextElement( arr, index );
	}

private static void printPrevnextElement(double[] arr, int index) {
	
	System.out.println("The number before the element at index " + index + " is " +
			arr[index  -1] + " and the number after the element at index " + index + 
			" is " +arr[index+1] + ".");
	
}

}
