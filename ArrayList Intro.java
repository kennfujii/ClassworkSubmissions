import java.util.ArrayList;

public class ArrayListIntro 
{

	public static void main(String[] args) 
	{
		//Task 1: Create an empty ArrayList studentNames of Strings.
		ArrayList <String> studentName = new ArrayList  <String> ();
		
		//Task 2: Add the following String literals to studentNames: 
		//"Alice", "Charlie", "Dave", "Elizabeth", "Fieri", "Gwen". 
		//The ArrayList should hold them in this order. Print the ArrayList 
		//to make sure it is organized correctly.
		studentName.add("Alice");
		studentName.add("Charlie");
		studentName.add("Dave");
		studentName.add("Elizabeth");
		studentName.add("Fieri");
		studentName.add("Gwen");
		System.out.println("Task 2: " + studentName);

		
		//Task 3: Now add "Brittany" directly after "Alice."
		studentName.add(1, "Brittany");
		System.out.println("Task 3: " + studentName);
		
		//Task 4: Charlie got expelled. Remove him from the ArrayList. 
		studentName.remove(3);
		System.out.println("Task 4: " + studentName);
		
		//Task 5: I forgot who is at the 2 index. Please get the value of the 
		//String literal at index 2 and then print studentNames.
		System.out.println("Task 5: " + studentName.get(2));
		
		//Task 6: Elizabeth had a name change. Set the value of the String 
		//literal where "Elizabeth" is to "Evan".
		studentName.set(3, "Evan");
		System.out.println("Task 6: " + studentName);		
		
	}

}
