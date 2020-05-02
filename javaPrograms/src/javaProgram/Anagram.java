package javaProgram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		Anagram obj = new Anagram();
		obj.anagramProg("Listen", "Silent");				

	}

	public void anagramProg(String s1,String s2)
	{
		
		String lowerCase = s1.toLowerCase();
		String upperCase = s2.toLowerCase();
		if(lowerCase.length()==upperCase.length())
		{			
			char[] charArray = lowerCase.toCharArray();
			char[] charArray1 = upperCase.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray1);
			int counter=0;
			for(int i=0;i<charArray.length;i++)
			{
				for(int j=0;j<charArray1.length;j++)
				{
					if(charArray[i]==charArray1[j])
					{
						counter=counter+1;
					}
				}
			}
			if(counter==charArray.length)
			{
				System.out.println("The Given two Strings are Anagram");
			}
		}
		else
		{
			System.out.println("The Given two Strings are NOT Anagram");
		}
		
	}

}
