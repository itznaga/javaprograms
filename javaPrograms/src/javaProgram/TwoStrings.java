package javaProgram;

import java.util.ArrayList;
import java.util.List;

public class TwoStrings {

	public static void main(String[] args) {
		TwoStrings obj = new TwoStrings();
		obj.returnDiff("Cognizant Technology", "Cognizant Technology Solutions");
		obj.returnUnmatch("Cognizant Technology Soln", "Cognizant Technology Solutions");
		obj.nPlus1("Apple", "iApple");
	}

	public void returnDiff(String str1,String str2)
	{
		String[] split = str1.split(" ");
		List<String> strlist = new ArrayList<String>();
		for(String st:split)
		{
			strlist.add(st);
		}

		String[] split1 = str2.split(" ");
		List<String> strlist1 = new ArrayList<String>();
		for(String st1:split1)
		{
			strlist1.add(st1);
		}

		strlist1.removeAll(strlist);

		System.out.println(strlist1);
	}

	public void returnUnmatch(String str1,String str2)
	{
		String[] split1 = str1.split(" ");
		String[] split2 = str2.split(" ");
		List<String> matching = new ArrayList<String>();
		
		for(int i=0;i<split1.length;i++)
		{
			for(int j=0;j<split2.length;j++)
			{
				if(split1[i].equals(split2[j]))
				{
					matching.add(split1[i]);
				}
			}
		}		
		

		System.out.println("Matching Words =" + matching);
		List<String> strlist1 = new ArrayList<String>();
		for(String st1:split1)
		{
			strlist1.add(st1);
		}
		
		List<String> strlist2 = new ArrayList<String>();
		for(String st2:split2)
		{
			strlist2.add(st2);
		}
		
		strlist1.removeAll(matching);
		strlist2.removeAll(matching);
		
		strlist1.addAll(strlist2);
		
		System.out.println("Unmatching Words =" + strlist1);
	}
	
	public void nPlus1(String str,String str1)
	{
		char[] charArray = str.toCharArray();
		List<Character> strChr = new ArrayList<Character>();
		for(Character chr: charArray)
		{
			strChr.add(chr);
		}
		
		char[] charArray1 = str1.toCharArray();
		List<Character> strChr1 = new ArrayList<Character>();
		List<Character> strChr2 = new ArrayList<Character>();
		for(Character chr1: charArray1)
		{
			strChr1.add(chr1);
			strChr2.add(chr1);
		}
		
		strChr1.removeAll(strChr);
		
		strChr2.removeAll(strChr1);
		
		System.out.println("After removing N+1 Character from the String =" + strChr2);
		
		
	}
}
