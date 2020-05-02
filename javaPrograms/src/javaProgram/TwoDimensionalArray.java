package javaProgram;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		TwoDimensionalArray obj = new TwoDimensionalArray();
		int[][] num = new int[3][3];
		num[0][0]=1;
		num[0][1]=3;
		num[0][2]=15;
		num[1][0]=2;
		num[1][1]=12;
		num[1][2]=23;
		num[2][0]=1;
		num[2][1]=56;
		num[2][2]=13;
		obj.diagonalElement(num);

	}
	
	public void diagonalElement(int[][] num)
	{
		int rowLength = num.length;
		int j = 0;
		int k=0;
		for(int i=0;i<num.length;i++)
		{
			 j = j+num[i][rowLength-1];
			 rowLength--;
			 k=k+num[i][i];			 
		}
		int d = j+k;
		System.out.println("Sum of Two Diagonals = "+d);
	}

}
