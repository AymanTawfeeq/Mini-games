// Ayman Tawfeeq

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		System.out.println("Please type your word and it will be translated into Pig Latin. Enter q to quit."); //prompt the user to enter words
		Scanner in  = new Scanner( System.in ); 		//accept the first word the user inputs
		String input = in.nextLine();
		
		while (!input.equals("q")) { //if it's not "q", translate it ,print the translation to the console
	
			translate(input);
			input = in.next();
			
		
	}
		System.out.print("Thank you for using the translator!");
		
		
	}
		
		//get the next word from the user, go back to if it's not "q", translate it
		//thank the user for using the translator

	
		
		
	public static void translate(String word) { 	//takes an English word with any capitalization and return a Pig Latinword with
		//correct capitalization
	
	word =  word.toLowerCase();//format word as all lowercase
	
	if (word.startsWith("a")  || word.startsWith("e") ||word.startsWith( "i") || word.startsWith("o")||word.startsWith("u") ) {  //does it start with a vowel
		System.out.println(word + "Way"); //add Way to the end
		
	} else {      //does it not start with a vowel
		String firstLetter = word.substring(0,1);    //copy the first letter 
		firstLetter = firstLetter.toUpperCase();  // and capitalize it
		
		String newWord = word.substring(1, word.length());    //remove the first letter from the word
		String output = ">" + newWord + firstLetter + "ay";
		System.out.println(output);    //add the copied and formatted letter to the end , 	add "ay" to the end, return our modified word
		//return our modified word
	
	}
	}
}	