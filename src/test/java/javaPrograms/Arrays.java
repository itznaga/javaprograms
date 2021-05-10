package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		Arrays obj = new Arrays();
//		int[] ij = {1,3,2,5};
//		obj.sumOfArray(ij);
//		obj.largestAndSmallest(ij);
//		obj.sumOfInt(123);
		obj.missingNum();
	}
	
	public void sumOfArray(int[] a)
	{
		int k=0;
		for(int i=0;i<a.length;i++) {
			k=k+a[i];
		}
		System.out.println(k);
	}
	
	public void largestAndSmallest(int[] a)
	{
		java.util.Arrays.sort(a);
		int k=a.length;
		System.out.println("Largest Numbber ="+a[k-1]);
		System.out.println("Smallest Numbber ="+a[0]);
	}
	
	public void sumOfInt(int a)
	{
		String str=Integer.toString(a);
		int q=0;
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			int k=Integer.parseInt(ch+"");
			q=q+k;
		}
		System.out.println("Sum of Integer"+q);
	}
	
	public void missingNum() {
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };

	    // let's create another array with same length
	    // by default all index will contain zero
	    // default value for int variable

	    int[] register = new int[input.length];

	    // now let's iterate over given array to
	    // mark all present numbers in our register
	    // array

	    for (int i : input) {
	      register[i] = 1;
	    }

	    // now, let's print all the absentees
	    System.out.println("missing numbers in given array");

	    for (int i = 1; i < register.length; i++) {
	      if (register[i] == 0) {
	        System.out.println(i);
	      }
	    }
		
	}

}
