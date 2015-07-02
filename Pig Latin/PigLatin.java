/**
 * This program asks the user for input and then translates the input to Pig Latin
 */

import javax.swing.JOptionPane;		//Needed for input box


public class PigLatin {

	public static void main(String[] args) {
		String input;			//User's input
		
		//Get input
		input = 
				JOptionPane.showInputDialog("Enter a sentence and I will translate it into Pig Latin: ");
		//Convert everything to lower case so translated input is all lower case
		input = input.toLowerCase();
		//Split input based on where there are spaces to translate each word separately
		String[] words = input.split(" ");
		
		//Iterate through each word
		for(int i =0; i<words.length; i++)
		{
			//Separate first letter of the word
			char firstChar = words[i].charAt(0);
			//The rest of the word
			String restOfWord = words[i].substring(1);
			//Pig translates the word into Pig Latin
			String pig = restOfWord + firstChar + "ay" + " ";
			//Prints out translated word
			System.out.print(pig);
		}
		
			
		}
		
		
		
	}


