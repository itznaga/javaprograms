package javaPrograms;

public class Pattern {

	public static void main(String[] args) {
		Pattern obj = new Pattern();
		obj.pattern1();
		obj.pattern2();
	}
	
	public void pattern1()
	{
		int k=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i;j++)
			{
				k++;
				System.out.print(k);
			}
			System.out.println();
		}
	}
	public void pattern2()
	{
		int k=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++)
			{
				k++;
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
