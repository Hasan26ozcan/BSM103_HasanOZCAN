package algoritma2;

import java.util.Arrays;

public class soru3 {

	public static void main(String[] args) {
	int[][] arr1= {{1,2,3},{2,3,4},{4,5,6},{6,7,8}};
	int[][] arr2={{9,2,3},{4,5,6},{5,8,1},{8,6,5,}};
	int[][] arr3=matrixAdd(arr1, arr2);
	for (int row = 0; row < arr3.length; row++) {
		for (int column = 0; column < arr3[0].length; column++) {
			System.out.println("array toplamlar� "+row+" "+column+"   =  "+arr3[row][column]);
		}
		
	}
	
	}
	public static int[][] matrixAdd(int[][]toplam1,int[][]toplam2) {
	int toplamlar�[][]=new int[toplam1.length][toplam1[0].length];	
	for (int row = 0; row < toplamlar�.length; row++) {
		for (int column = 0; column < toplamlar�[0].length; column++) {
			toplamlar�[row][column]=toplam1[row][column]+toplam2[row][column];
		}
	}
	return toplamlar�;
	}

}
