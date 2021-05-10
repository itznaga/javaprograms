package javaPrograms;

public class Swap {

	public static void main(String[] args) {
		Swap obj = new Swap();
		obj.swapString("Naga", "Samy");
		obj.swapNum(5, 7);

	}
	
	public void swapString(String str1,String str2)
	{
		str1=str1.concat(str2);
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("STr2= "+str2);
		System.out.println("STr1= "+str1);
	}
	
	public void swapNum(int x,int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
	}

}
