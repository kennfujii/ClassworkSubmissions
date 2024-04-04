
public class BubbleSorter 
{
	
	public static void main(String[] args) 
	{	
		//calls a method that generates an array of random elements
		makeRandom();
		
		//calls a method that will bubble sort the random number generated
		//array from least to greatest
		bubbleSort(makeRandom());
		
		//calls the method to print the bubble sorted array using the random
		//numbers that were generated
		printArr(bubbleSort(makeRandom()));
	}	
	
	/**
	 * This method takes in array and changes each number to a random number
	 * @return
	 */
		private static int[] makeRandom() 
		{
			//the declared int array as 200
			int[] bigNums = new int[2000];
			
			//set int length equal to the new array length
			int len = bigNums.length;
			
			//for loop to traverse the array 
			for (int i = 0; i < len; i++)
			{
				//declare the int random number from 1-1000 
				int randomNumber = (int) ((Math.random() * 1000) + 1);
				
				//set each number of the array equal to a random number 
				bigNums[i] = randomNumber;	
			}
			
			//return the new array 
			return bigNums;
		}
		
		/**
		 * this method will bubble sort an array of any given length
		 * by comparing the index with the number right after it and
		 * will compare which is greater to order the array from least
		 * to greater. 
		 * @param arr
		 * @return
		 */
		private static int[] bubbleSort(int[] arr) 
		{
			//for loop to traverses the array to the last element to i+1
			for (int i = 0; i<=  arr.length-1; i++)
			{
				//nested for loop to traverse the array to compare it
				for(int j = 0; j < arr.length - i -1 ; j++)
				{
					//this will check if the two elements should be switched
						//to see if the index j is  greater than the one at 
						//the index of j +1
					//this is meant to push the greater elements to the back
						//of the array and the lesser elements to the front
					if (arr[j] > arr [j+1])
					{
						//swap temp and arr[i] 
						int  temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] =  temp;
					}
				}
			}	
			//return the new sorted array
			return arr;
		}
		
		/**
		 * This method is passed an array and prints out each element one by one 
		 * @param arr
		 */
			public static void printArr(int[] arr) 
			{
				//TASK 1: make a variable to be the 'traverser'
				int traverser; 
				
				
				//TASK 2: make a loop, we want it to  traverse every character, so it should 
				//go from start to finish of the loop  
				System.out.print("{ ");
				for  ( traverser = 0; traverser  <= arr.length-1; traverser ++)
				{
					//TASK 3: prove that it can count along with right amount of indeces
					System.out.print( arr[traverser] );
					
					if (traverser != arr.length -1)
					{
						System.out.print(", ");
					}
				}
				System.out.print("  }");
			}
	}


