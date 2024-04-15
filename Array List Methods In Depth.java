import java.util.ArrayList;

public class ArrayListMethodsInDepth 
{

	public static void main(String[] args) 
	{
		//instatiates an empty ArrayList foods that stores Strings.
		ArrayList <String> foods = new ArrayList  <String> ();
		
		//add the following Strings to foods: "Apples", "Bread", "Cookies".
		//After each task (except task 1) print out the length of the foods 
		//ArrayList.
		
		//Task 1: Print out the length of the foods ArrayList. 
			//in general it prints out the length of the array list
			//in this case, it prints - "3"
		//this adds apple to the array list
		foods.add("Apple");
		//this prints the array list size at this point
		System.out.println(foods.size());
		
		//this adds bread to the array list
		foods.add("Bread");
		//this prints the array list size at this point
		System.out.println(foods.size());
		
		//this adds cookie to the array list
		foods.add("Cookies");
		//this prints the array list size at this point
		System.out.println(foods.size());

		//Task 2: Inside of a print statement, add the String "Dole Whip" to 
		//foods. In the line comment for this code, state what it prints.
			//this method will always print true no matter what it is passed
		System.out.println(foods.add("Dole Whip"));
		//this prints "true"
			//this prints the array list size at this point
		System.out.println(foods.size());

		
		//Task 3: Inside of a print statement, use the .set(E) method to change 
		//"Bread" in foods to "Butter". Comment what it prints. 
			//In general, this prints the old value that was passed
			//In this case, it prints "bread" 
		System.out.println(foods.set(1, "Butter"));
		//this prints "bread"
			//this prints the array list size at this point
		System.out.println(foods.size());

		
		//Task 4: Inside of a print statement, use the .remove(int) method to 
		//remove "Cookies" from foods. Comment what it prints.
			//in general, this prints the value that is removed
			// in this case, it prints -  "cookies"
		System.out.println(foods.remove(2));
		// this prints "cookies"
		//this prints the array list size at this point
		System.out.println(foods.size());

		//Task 5: For each task, go back and comment what the method you are 
		//calling does, and what the method returns (both in general and in 
		//this case).
	}
}
