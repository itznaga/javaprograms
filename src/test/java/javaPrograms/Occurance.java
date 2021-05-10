package javaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Occurance {

	public static void main(String[] args) {
		Occurance obj = new Occurance();
		obj.occurancePro("Hexaware");
	}

	public void occurancePro(String str) {
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (char chr : ch) {
			if (mp.containsKey(chr)) {
				mp.put(chr, mp.get(chr) + 1);
			} else {
				mp.put(chr, 1);
			}
		}
		
		Set<Integer> set1 = new TreeSet<Integer>();
		for(Entry<Character, Integer> ent:mp.entrySet())
		{
			set1.add(ent.getValue());
			System.out.print(ent.getKey() + " = " + ent.getValue());
		}
		
		List<Integer> li1 = new ArrayList<Integer>(set1);
		System.out.println();
		for(Entry<Character, Integer> ent:mp.entrySet())
		{
			if(ent.getValue()==li1.get(li1.size()-1))
			{
			System.out.print("Highest Repeating Words = "+ent.getKey());
			}
		}

	}

}
