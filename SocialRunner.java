package ifs;
import java.util.Scanner;
import ifs.Social;

public class SocialRunner {
	public static void main (String args[] ) {
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a social security number: ");
	String social = keyboard.next();
	
	Social ref = new Social();
	
	System.out.println(ref.Social_Check(social));
	
	
	

}
}