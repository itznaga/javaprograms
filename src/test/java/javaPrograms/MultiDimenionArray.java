package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MultiDimenionArray {

	public static void main(String[] args) {
		MultiDimenionArray obj = new MultiDimenionArray();
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		 obj.sumOfDiagonal(a);
		 obj.largestNum(a);
		 obj.minValuemaxColumn(a);
	}

	public void sumOfDiagonal(int a[][]) {
		int k = 0;
		int l = 0;
		int row = a.length;
		int column = a[0].length;
		for (int i = 0; i < row; i++) {
			k = k + a[i][i];
			l = l + a[i][--column];
		}
		int sum = k + l;
		System.out.println("Sum of Diagonal= " + sum);
	}

	public void largestNum(int a[][]) {
		int row = a.length;
		int column = a[0].length;
		Set<Integer> set1 = new TreeSet<Integer>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				set1.add(a[i][j]);
			}
		}
		List<Integer> li1 = new ArrayList<Integer>(set1);
		System.out.println("Largest Number in Arrays =" + li1.get(li1.size() - 1));
	}

	public void minValuemaxColumn(int a[][]) {
		int min = a[0][0];
		int row = a.length;
		int column = a[0].length;
		int minColumn = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					minColumn = j;
				}
			}
		}
		System.out.println("Minimum Value =" + min);
		System.out.println("Minmum value Column =" + minColumn);
		int max = 0;
		for (int i = 0; i < row; i++) {
			if (a[i][minColumn] > min) {
				max = a[i][minColumn];
			}
		}
		System.out.println("Maximum Value in Min Column =" + max);
	}

}
