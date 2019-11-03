package ifs;
public class Social {
	//New method to check if social is valid
	public String Social_Check(String social) {
		String output;
		//Saves character 3 in variable
		char hyphen_3 = social.charAt(3);
		//Saves character 6 in variable
		char hyphen_6 = social.charAt(6);
		char hyphen = '-';
		
		//Social valid if hyphen at 3 and 6
		if (hyphen_3 == hyphen && hyphen_6 == hyphen) {
			//Saves length of social
			int len = social.length();
			//Print last 4 digits of number
			output = social.substring(len - 4, len);
		}
		
		//If not valid, output is bad
		else {
			output = "bad";
		
		}
		
		return output;
	}

}
