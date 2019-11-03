package ifs;

public class Social {
	
	public String Social_Check(String social) {
		String output;
		char hyphen_3 = social.charAt(3);
		char hyphen_6 = social.charAt(6);
		char hyphen = '-';
		
		if (hyphen_3 == hyphen && hyphen_6 == hyphen) {
			int len = social.length();
			output = social.substring(len - 4, len);
		}
		
		else {
			output = "bad";
		
		}
		
		return output;
	}

}
