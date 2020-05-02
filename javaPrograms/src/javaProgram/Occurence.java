package javaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurence {

	public static void main(String[] args) {
		Occurence obj = new Occurence();
		obj.occurence1("Naaggsas");

	}
	
	public void occurence1(String str)
	{
		Map<Character,Integer> mp1 = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(mp1.containsKey(str.charAt(i)))
			{
				mp1.put(str.charAt(i), mp1.get(str.charAt(i))+1);
			}
			else
			{
				mp1.put(str.charAt(i), 1);
			}
		}
		System.out.println("Occurence = "+mp1);
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		for(Entry<Character, Integer> ent: mp1.entrySet())
		{
			Integer value = ent.getValue();
			set1.add(value);
		}
		
		List<Integer> intg = new ArrayList<Integer>(set1);
		
		for(Entry<Character, Integer> ent: mp1.entrySet())
		{
		   if(ent.getValue()==intg.get(intg.size()-1))
		   {
			   System.out.println("The Most Occurence Character = "+ent.getKey());
		   }
		}
	}

}
