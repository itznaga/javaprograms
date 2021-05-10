package javaPrograms;

public class PrimeOddEven {

	public static void main(String[] args) {
		PrimeOddEven obj = new PrimeOddEven();
		obj.prime(7);
		obj.odd(5);
		obj.even(5);
	}

	public void prime(int n) {
		boolean flag = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = true;
			}
		}
		if(!flag)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
	}
	
	public void odd(int n)
	{
		int k=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				k=k+i;
			}
		}
		System.out.println(k);
	}
	
	public void even(int n)
	{
		int k=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				k=k+i;
			}
		}
		System.out.println(k);
	}
}
