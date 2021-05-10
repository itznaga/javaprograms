package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate {

	public static void main(String[] args) {
		Duplicate obj = new Duplicate();
		obj.duplicateChar("abcdbbcc");
		obj.duplicateAnother("abcdbbcc");
	}
	
	public void duplicateChar(String str)
	{
		Set<Character> set1 = new TreeSet<Character>();
		Set<Character> set2 = new TreeSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(!set1.add(str.charAt(i)))
			{
				set2.add(str.charAt(i));
			}
		}
		List<Character> li1 = new ArrayList<Character>(set1);
		List<Character> li2 = new ArrayList<Character>(set2);
		System.out.println("Duplicate Characters = "+li2);
		li1.removeAll(li2);
		System.out.println("Only Unique Characters ="+li1);
		String str1="";
		for(int i=0;i<li1.size();i++)
		{
			str1=str1+li1.get(i);
		}
		System.out.println("Only Unique String ="+str1);
	}
	
	public void duplicateAnother(String str)
	{
		String str1="";
		String duplicate ="";
		for(int i=0;i<str.length();i++)
		{
			if(str1.contains(str.charAt(i)+""))
			{
				if(!duplicate.contains(str.charAt(i)+""))
				{
				duplicate=duplicate+str.charAt(i);
				}
			}
			str1=str1+str.charAt(i);
		}
		System.out.println("Duplicate String ="+ duplicate);
		for(int i=0;i<duplicate.length();i++)
		{
			str=str.replace(duplicate.charAt(i)+"","");
		}
		System.out.println("Only Unique Characters ="+str);
	}

}
