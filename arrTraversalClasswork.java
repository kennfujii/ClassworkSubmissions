
public class arrTraversalClasswork 
{

	public static void main(String[] args) 
	{
				
		//TASK  1
		double [] nums = {3.1, 2.1,  8.4};
		System.out.println(sumArrElements(nums));
		
		//TASK 2
		int[] numsTwo = {3, 17, 12, 8, 9, 4, 12};
		makeEveryOtherOne(numsTwo);
		
	}

	public static double sumArrElements(double[] nums) 
	{
		//create the traverser
		double sum =0;
		
		//the for loop will take  in the traverser and each time will add 
		//one to the index
		for (int i =0; i<= nums.length-1; i++ )
		{
			//then to add it, you have to take in the array and 
			double adder = nums[i];
			sum += adder;
		}
		return sum;
	}

	private static void makeEveryOtherOne(int[] numsTwo) {
		//create the for loop that will loop to skip to the next number 
		for  (int j = 1;  j <= numsTwo.length -1; j+=2)
		{
			//it will change that number to 1
			numsTwo[j] =1;
		}
	}
}

