package javaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		obj.palindrome1("madamasd");
		obj.palindrome2("madam");
	}
	
	public void palindrome1(String str)
	{
		String str1 = "";
		for(int i=str.length();i>0;i--)
		{
			str1=str1+str.charAt(i-1);
		}
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("The given String is Palindrome");
		}
		else
		{
			System.out.println("The given String is not Palindrome");
		}
	}
	
	public void palindrome2(String stre1)
	{
		StringBuilder stre2;
		StringBuilder sb = new StringBuilder(stre1);
		stre2=sb.reverse();
		if(stre2.equals(sb))
		{
			System.out.println("The given string is Palindrome");
		}
		else
		{
			System.out.println("The given String is not Palindrome");
		}
		
	}

}
