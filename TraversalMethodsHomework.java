
public class traversalMethodsHomework {

	public static void main(String[] args) {
		
		int[] nums1 = { 2, 6, 3, 9, 1, 1, 4};
		System.out.println("Task 1: " + returnHighestValue(nums1));
		
		double[] nums2 = { 3.1, 4.2, 5.0, 6.2, 6.9};
		System.out.println("Task 2: " + findDoubleAverage(nums2));
		
		int[] nums3 = {1,5,8};
		System.out.println("Task 3: " + checkIfAnyEven(nums3));
		
		int[] nums4 = { 1, 6, 9};
		System.out.println("Task 4: " + checkIfAllEven(nums4));

		double[] nums5 = { 2.0, 8.8, 8.8, 8.8, 9.0, 3.1};
		System.out.println("Task 5: " + checkThreeSame(nums5));
		
	}
	//TASK 1:  Make a method that is passed an int array and returns 
	//the highest value in that array.
		//Ex: { 2, 6, 3, 9, 1, 1, 4} ---> returns 9
	public static int returnHighestValue(int[] nums) 
	{
		int value = nums[0]; 
		for(int i = 0; i<nums.length; i++)
		{
			if(nums[i] > value)
			{
				value = nums[i];
			}
		}
		return value;
	}

	
	//TASK 2: Make a method that is passed an array of doubles and returns
	//a double array consisting of their average. 
		//Ex: { 3.1, 4.2, 5.0, 6.2, 6.9} --> returns 5.08	
	public static double findDoubleAverage(double[] nums)
	{
		double sum = 0; 
		int length = nums.length;
		for(int i =0; i < nums.length; i++)
		{
			sum += nums[i];
		}
		double average = sum / length;
		return average;
	}
	
	
	//TASK 3: Make a method that is passed an int array and returns 
	//whether or not the array has any even numbers in it.
		//Ex: { 1, 6, 9} --> returns true
		//Ex: { 1, 5, 7} --> returns false
	public static boolean checkIfAnyEven(int[] nums)
	{
		boolean anyIsEven = false;  
		for(int i = 0;i < nums.length; i++)
		{
			if (nums[i] % 2 ==0)
			{
				anyIsEven = true;
			}			
		}
		return anyIsEven;
	}
	
	
	//TASK 4: Make a method that is passed an int array and returns 
	//whether or not the array has ALL even numbers in it.
		//Ex: { 1, 6, 9} --> returns false
		//Ex: { 4, 2, 18} --> returns true
	public static boolean checkIfAllEven(int[] nums)
	{
		boolean isEven = false; 
		for(int i = 0;i < nums.length; i++)
		{
			if (nums[i] % 2 !=0)
			{
				isEven = false;
			}
			else
			{
				isEven  = true;
			}
		}
		return isEven;
	}
	
	
	//TASK 5: Make a method that is passed a double array and returns 
	//whether or not three consecutive doubles of the same value appear in the array.
		//Ex: { 2.0, 8.8, 8.8, 8.8, 9.0, 3.1} --> returns true
		//Ex: {3.1, 7.1, 6.6, 9.3} --> returns false
	//completed in class together
	public static boolean checkThreeSame(double[] nums)
	{
		int traverser = 0;
		boolean hasThree=false; 
		for(;traverser <= nums.length-3; traverser++)
		{
			if(nums[traverser] == nums[traverser + 1] && nums[traverser] == nums[traverser +2])
			{
				hasThree = true;
			}
		}
		return hasThree;		
  }
}
