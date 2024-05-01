import java.util.ArrayList;

public class ArrayListSorters 
{

	public static void main(String[] args) 
	{
	//Task 1: In the main method, instantiate two ArrayLists nums and names of 
	//Integers (remember ints wouldn't work for ArrayLists) and Strings respectively. 
	//Fill them with five unsorted values (nums out of numerical order and names out 
	//of alphabetical order). 
		ArrayList <Integer> nums = new ArrayList  <Integer> ();
			nums.add(1);
			nums.add(7);
			nums.add(4);
			nums.add(6);
			nums.add(9);
		ArrayList <String> names = new ArrayList  <String> ();
			names.add("Paige");
			names.add("Abby");
			names.add("Nua");
			names.add("Carl");
			names.add("Fran");
			
		//Task 2: Create a void method bubbleSortNumbers that is passed an 
		//ArrayList and bubble sorts it just like we did for arrays. 	
		System.out.println(nums);
		bubbleSortNumbers(nums);
		System.out.println("Sorted nums: " + nums);	

		//Task 3: Create a void method bubbleSortStrings that is passed an ArrayList 
		//and bubble sorts it into alphabetical order. 
		System.out.println(names);
		bubbleSortStrings(names);
		System.out.println("Sorted names: " + names);
	}
	
	private static void bubbleSortNumbers(ArrayList<Integer> nums) 
	{
			for (int i=0; i < nums.size(); i++) 
	        {
	            for (int j=0; j < nums.size()-i -1; j++) 
	            {
	            	if (nums.get(j) > nums.get(j+1))
	            	{
	            		Integer temp  = nums.get(j);
	            		nums.set(j,nums.get(j+1));
	            		nums.set(j + 1, temp);
	            	}
	            }
	        }
	}
	
	private static void bubbleSortStrings(ArrayList<String> names) 
	{
		for (int i=0; i < names.size(); i++) 
        {
            for (int j=0; j < names.size()-i -1; j++) 
            {
            	if (names.get(j).compareTo(names.get(j+1)) > 0)
            	{
            		String temp  = names.get(j);
            		names.set(j,names.get(j+1));
            		names.set(j + 1, temp);
            	}
            }
        }		
	  }
	
}	
		
