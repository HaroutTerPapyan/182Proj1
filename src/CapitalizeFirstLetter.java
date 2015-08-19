/* Harout Ter-Papyan
 * A program that capitalizes the first letter
 *  of each word in a string
 */

import java.util.*;


public class CapitalizeFirstLetter {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = input.nextLine();
		System.out.println(title(str));
		

	}
	
	public static String title(String s)
	{
	    String result = "";
	    String[] words = s.split(" ");

	    for (int i = 0; i < words.length; i++) 
	    {
	        result += words[i].replaceFirst(words[i].charAt(0)+"", Character.toUpperCase(words[i].charAt(0))+"") + " ";
	    }

	    return result;
	}

}
