package javaProgram;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int[] number = {1,3,2,5,4};
		obj.sort(number);

	}
	
	public void sort(int[] num)
	{
		int temp;
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=0;j<num.length-i-1;j++)
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;					
				}
			}
		}
		for(int number:num)
		{
		System.out.print(number);
		}
	}

}
