/**
 * This program asks the user to enter a sentence with no spaces
 * and then separates the sentence into separate words based on 
 * where there are capital letters
 */

import javax.swing.JOptionPane;			//Needed for input box

public class WordSeparator {

	public static void main(String[] args) {
		String input;					//User's input
		String newString = " ";			//New string to hold separated sentence
		
		//Get input 
		input =
				JOptionPane.showInputDialog("Enter a sentence with no spaces: "
						+ "(ex: StopAndSmellTheRoses) ");
	
		//Loops through input
		for(int index=0; index< input.length(); index++)
		{
			//If there is an upper case letter then separate it from input
			char c = input.charAt(index);
			if(Character.isUpperCase(c)) 
				//If the first letter is capital add no space
				if(index==0)
					newString = "" + c;
				else 
				{
					newString += " " + c;
				}
			//If there is not a capital letter then keep iterating through input
			else
			{
				newString +=c;
			}
		}
		//Print out new sentence
		System.out.println(newString);
	}

}
