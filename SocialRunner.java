package ifs;
//Import scanner
import java.util.Scanner;
//Import social class
import ifs.Social;

public class SocialRunner {
	public static void main (String args[] ) {
	
	//Create new scanner
	Scanner keyboard = new Scanner(System.in);
	
	//Get user input for social security number
	System.out.println("Enter a social security number: ");
	String social = keyboard.next();
	
	//Create new social object
	Social ref = new Social();
	
	//Run new method and print output
	System.out.println(ref.Social_Check(social));
	
	
	

}
}
