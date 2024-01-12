/**
 * This is the main class when rolling the dice. 
 * It will roll an electronic dice and give the output. 
 */
public class DiceRoller 

	public static void main(String[] args) 
	{
		int i = 0;  
		while (i<201)
		{
			//this will generate a random number generator that generate 200 times 
			//and find a numbers between 1-17 inclusive. 
			int randomNum = (int)(Math.random() *17 +1);
			//print all 200 random number generator numbers
			System.out.println(randomNum);
			i++;
		}	
	//this is the character the method will be  searching for	
	char myChar = 'k';
	//this is the string where the character will be searched in  
	String newString = "lkjhgfrtyuiokkkjhgfdcvbn";
	//prints out the method
	System.out.println("There are " + countchars(newString,myChar) + " 'k's in the "
	 		+ "string.");
}
/**
 * this method counts how  many 'k's there is in the string 
 * the char shows up in the string and prints the number
 */
	private static int countchars(String str, char myChar) 
	{
		int count = 0;
		//for loop  to check the  amount that the character occurs in the string
		for (int  i =0; i < str.length(); i++)
		{
			if(str.charAt(i) == myChar)
				count ++;
		}
		return count;
	}
}	
