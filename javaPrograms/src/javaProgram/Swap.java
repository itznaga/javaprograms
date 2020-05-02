package javaProgram;

public class Swap {

	public static void main(String[] args) {
		Swap obj = new Swap();
		obj.swapInt(5, 3);
		obj.swapString("Naga", "Samym");

	}
	
	public void swapInt(int x,int y)
	{
	    x=x+y;
	    y=x-y;
	    x=x-y;
	    System.out.println(x + " and " + y);		
	}
	
	public void swapString(String str1,String str2)
	{
		str1=str1.concat(str2);
		str2=str1.substring(0, str1.length()-str2.length());
		System.out.println(str2);
		str1=str1.substring(str2.length());
		System.out.println(str1);				
	}

}
