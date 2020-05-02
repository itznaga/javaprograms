package javaProgram;

public class NumCharSpecialChar {

	public static void main(String[] args) {
		NumCharSpecialChar obj = new NumCharSpecialChar();
		obj.method("abcABC12#$%");
		obj.DigitNum('a');

	}

	public void method(String str)
	{
		String replaceAll = str.replaceAll("[^a-z A-Z]", "");
		System.out.println("Only Characters = "+replaceAll);
		int length = replaceAll.length();
		System.out.println("Total Num of Characters given in the String = " + length);

		String replaceAll1 = str.replaceAll("[^0-9]", "");
		System.out.println("Only Numbers = "+replaceAll1);
		int length1 = replaceAll1.length();
		System.out.println("Total Num of Numbers given in the String = " + length1);

		String replaceAll2 = str.replaceAll("[0-9 a-z A-Z]", "");
		System.out.println("Only Special Characters = "+replaceAll2);
		int length2 = replaceAll2.length();
		System.out.println("Total Num of Special Characters given in the String = " + length2);

	}


	public void DigitNum(Character chr)
	{
		if(Character.isLetter(chr))
		{
			System.out.println("The input Character is Alphabet");
		}

		else if(Character.isDigit(chr))
		{
			System.out.println("The input Character is Number");
		}
		else
		{
			System.out.println("The input Character is Special Character");
		}
	}


}
