package javaPrograms;

public class RegEx {

	public static void main(String[] args) {
		RegEx obj = new RegEx();
		obj.regularExp("abv123!@#");
		obj.withoutRegEx("abv123!@#");

	}

	public void regularExp(String str) {
		String str1 = str.replaceAll("[^a-z]", "");
		System.out.println("Only Alphabets from the String =" + str1);
		String str2 = str.replaceAll("[^0-9]", "");
		System.out.println("Only Numbers from the String =" + str2);
		String str3 = str.replaceAll("[a-z 0-9]", "");
		System.out.println("Only Special Characters from the String =" + str3);
	}

	public void withoutRegEx(String str) {
		String onlyDigit = "";
		String OnlyLetters = "";
		String onlySpecialCharacters = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				onlyDigit = onlyDigit+str.charAt(i);
			} else if (Character.isLetter(str.charAt(i))) {
				OnlyLetters = OnlyLetters+str.charAt(i);
			} else {
				onlySpecialCharacters=onlySpecialCharacters+str.charAt(i);
			}
		}
		System.out.println("Only Digit =" + onlyDigit + "Only Letters ="+OnlyLetters+"Only Special Characters ="+onlySpecialCharacters);
	}

}
