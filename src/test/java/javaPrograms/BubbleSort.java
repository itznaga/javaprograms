package javaPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ij = {1,3,2,5,4};
		BubbleSort obj = new BubbleSort(ij);

	}
	
	public BubbleSort(int arr[])
	{
		for (int j = 0; j < arr.length-1; j++)
		{
            if (arr[j] > arr[j+1])
            {
                // swap arr[j+1] and arr[j]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
		}
		for(int i:arr)
		{
			System.out.print(i);		
		}
	}

}
