package javaProgram;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class Duplicate {

	public static void main(String[] args) {
		Duplicate dp = new Duplicate();
//		dp.duplicateWithSet("Nagasamyg");
		dp.duplicateWithoutSet("Nagasamyg");

	}
	
	public void duplicateWithSet(String str)
	{
		Set<Character> charac = new LinkedHashSet<Character>();
		List<Character> chr = new ArrayList<Character>();
	     for(int i=0;i<str.length();i++)
	     {
	    	 boolean add = charac.add(str.charAt(i));
	    	 if(add==false)
	    	 {
	    		 chr.add(str.charAt(i));
	    	 }
	     }
	     List<Character> chr1 = new ArrayList<Character>(charac);
	     for(int i=0;i<chr1.size();i++)
	     {
	    	for(int j=0;j<chr.size();j++)
	    	{
	    		chr1.remove(chr.get(j));
	    	}
	     }
	     System.out.println(chr1);
	}
	
	public void duplicateWithoutSet(String str)
	{
		int counter = 0;
		String st = "";
		String lowerCase = str.toLowerCase();
		for(int i=0;i<lowerCase.length();i++)
		{
			for(int j=0;j<lowerCase.length();j++)
			{
				if(lowerCase.charAt(i)==lowerCase.charAt(j))
				{
					counter++;
					if(counter>1)
					{						
						st=st+lowerCase.charAt(i);						
					}
				}
			}
			counter=0;
		}
		System.out.println(st);
	}
}
