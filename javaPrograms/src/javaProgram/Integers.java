package javaProgram;

import java.util.Arrays;

public class Integers {

	public static void main(String[] args) {
		Integers obj = new Integers();
		obj.sumOfInt(123);
		int[] num= {19,20,22,24};
		obj.missingIntinArray(num);

	}
	
	public void sumOfInt(int i)
	{
		Integer valueOf = Integer.valueOf(i);
		String str = valueOf.toString();
		char[] charArray = str.toCharArray();
		int sum=0;
		for(char c:charArray)
		{
		int parseInt = Integer.parseInt(c+"");
		sum=sum+parseInt;
		}
		System.out.println(str+sum);
	}
	
	public void missingIntinArray(int[] numbers)
	{
		Arrays.sort(numbers);
		int numbersArrayIndex = 0;
		for (int i = numbers[0]; i < numbers[numbers.length - 1]; i++) {
		    if (i == numbers[numbersArrayIndex]) {
		        numbersArrayIndex++;
		    }
		    else {
		        System.out.print(i+",");
		    }
		}
	}

}
