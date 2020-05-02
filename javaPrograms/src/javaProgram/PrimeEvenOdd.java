package javaProgram;

public class PrimeEvenOdd {

	public static void main(String[] args) {
		PrimeEvenOdd obj = new PrimeEvenOdd();
		obj.sumofPrime(6);
		obj.Odd(6);
		obj.even(6);
	}
	
	public void sumofPrime(int n)
	{
		boolean flag = false;
		for(int i=2;i<n;i++) 
		{
			if(n%i==0 || n==0 || n==1)
			{
				flag=true;
				System.out.println("The Given Number is NOT Prime");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("The Given Number is Prime");
		}
	}
	
	public void Odd(int n)
	{
		int counter=0;
		for(int i=1;i<=n;i++)
		{
			if(!(i%2==0))
			{
				counter=counter+i;
			}
		}
		System.out.println("Sum of Odd Numbers " + counter);
	}
	
	public void even(int n)
	{
		int counter=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				counter=counter+i;
			}
		}
		System.out.println("Sum of Even Numbers " + counter);
	}

}
