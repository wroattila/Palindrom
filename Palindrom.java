package HWAK_Akademia_Palindrom;

import java.util.Scanner; 

public class Palindrom {

	

	public static void main(String[] args) {
		
	    StringBuilder input = new StringBuilder();
	    System.out.println("Enter your word");
	    Scanner scanner = new Scanner(System.in);
	    String userWord = scanner.nextLine();
	    input.append(userWord);
	    input.reverse();
	    
	    scanner.close();
	    
	    if (userWord.equals(input.toString())) {
	    	System.out.println("The word typed by You is palindrom");
	    }
	    else System.out.println(input);

	
	
	}

}
