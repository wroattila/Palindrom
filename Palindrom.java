package HWAK_Akademia_Palindrom;

import java.util.Scanner; 

public class Palindrom {

	

	private static final String USER_WORD = "Enter your word";

	public static void main(String[] args) {
		
	    
	    System.out.println(USER_WORD);
	    Scanner scanner = new Scanner(System.in);
	    String userWord = scanner.nextLine();
	    StringBuilder input = new StringBuilder();
	    reverseString(userWord, input);
	    
	    scanner.close();
	    
	    palindromValidation(input, userWord);

	
	
	}

	private static void reverseString(String userWord, StringBuilder input) {
		input.append(userWord);
	    input.reverse();
	}

	private static void palindromValidation(StringBuilder input, String userWord) {
		if (userWord.equals(input.toString())) {
	    	System.out.println("The word typed by You is palindrom");
	    }
	    else System.out.println(input); {
	    	
	    }
	}

}
