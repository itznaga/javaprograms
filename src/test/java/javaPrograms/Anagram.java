package javaPrograms;

import java.util.Set;
import java.util.TreeSet;

public class Anagram {

	public static void main(String[] args) {
		Anagram obj = new Anagram();
		obj.anagram1("star", "rats");
		obj.anagram1("star", "raters");
		obj.anagram1("star", "moon");
	}

	public void anagram1(String str1, String str2) {
		Set<Character> li1 = new TreeSet<Character>();
		Set<Character> li2 = new TreeSet<Character>();
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				li1.add(str1.charAt(i));
			}
			for (int i = 0; i < str2.length(); i++) {
				li2.add(str2.charAt(i));
			}
			if (li1.equals(li2)) {
				System.out.println("The given strings are Anagram");
			} else {
				System.out.println("The given strings are not anagram");
			}
		} else {
			System.out.println("The given strings are not anagram");
		}
	}
}
