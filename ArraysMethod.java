
public class ArraysTutorial {

	public static void main(String[] args) {
		
		//declare an int array without any values 
		int[] arr1  = null; 
		
		//declare an int array of four default values  
		int[] arr2  = new int[4];
		
		//declare an array with three values we want to set t he literals  of 4,12, 28  
		int[] arr3 = {4,12,28};
		
		//print its contents? 
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);

		//print its first elements
		System.out.println("First element is " + arr3[0]);
		
		//print its last elements
		System.out.println("Last element is " +arr3[arr3.length-1]);
		
		//call method to print first and last element, then changes them both to 1
		printAndChangeFirstLast(arr3);
		
		//print its first element
		System.out.println("The first element is " + arr3[0]);
		
		//print its last element 
		System.out.println("The last element is " + arr3[arr3.length-1]);
		
		//call method to return sum of two  indices 
		int sum = sumOfTwoElements(arr3, 0, 2);
		System.out.println("The sum is " + sum);
		
		//call method to  return a new array with the same length but all zeros 
		int[] newArr = makeSameLengthArrayWithZeros(arr3);
	
	
		int[] arr4 = {6, 9, 11, 3};
		//TASK  1: make a method  that  returns an ARRAY of the first  
		//and the last elements of a passed array 
			//for example [4, 7, 12, 3} ----returns ---> {4,3}
		System.out.println(getFirstAndLastElement(arr4));
		
		//TAKS 2: make a method that changes as array. It should be 
		//passed the array and the index you want to change. It will 
		//divide specified index by 2 
			//for example ( {2, 4, 6, 8,}, 2 ) -->  {2, 4, 3, 8}
		System.out.println(divideByTwo(arr4, 0));
		
	}

	private static int[] divideByTwo(int[] arr4, int i) {
	//make  an array that divides the i by 2 within the specified array 
	arr4[i] = arr4[i] / 2;
	//return the new divided array
    return arr4;
    
	}

	private static int[] getFirstAndLastElement(int[] arr4) {
		//make an array to get the first and last element
		int[] task1Arr = {arr4[0], arr4[arr4.length-1]};
		//return the new array 
		return task1Arr;

	}

	private static int[] makeSameLengthArrayWithZeros(int[] arr) 
	{
		//make an array of all 0s with same length as the passed array 
		int[] tempArr  = new int[arr.length];
		
		//return the new one we made 
		return tempArr;
	}

	private static int sumOfTwoElements(int[] arr, int first, int second) 
	{
		//return the sum of the first and second number in the array 
		return (arr[first] + arr[second]);
		
	}

	public static void printAndChangeFirstLast(int[] arr)
	{
		//print out the first and last elements 
		System.out.println("The first and last elements are " + arr[0] + " and " +
		arr[arr.length-1] + ".");
		
		//change these elements to  1  
		//change first to 1 
		arr[0] =  1;  
		
		//change last to 1
		arr[arr.length -1]  = 1; 
		
		//print out the first and last elements 
		//System.out.println("The new first and new last elements are " + arr[0] + 
			//" and " + arr[arr.length-1] + ".");
	}
	
}
