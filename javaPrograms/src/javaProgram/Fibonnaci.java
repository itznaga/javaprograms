package javaProgram;

public class Fibonnaci {

	public static void main(String[] args) {
		Fibonnaci obj = new Fibonnaci();
		obj.fibonnaci(9);
	}
	
	public void fibonnaci(int n)
	{
		int prevNum=0;
		int nextNum=1;
		for(int i=0;i<=n;i++)
		{
			int sum=prevNum+nextNum;
			prevNum=nextNum;
			nextNum=sum;
			System.out.print(sum+",");
		}
	}

}
