package javaProgram;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		obj.pdrome("MadaM");

	}
	
	public void pdrome(String str)
	{
		String st = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			st=st+str.charAt(i);
		}
		if(st.equals(str))
		{
			System.out.println("The Given String is Palindrome");
		}
		else
		{
			System.out.println("The Given String is not Palindrome");
		}
	}

}
