package zzarrays�okboyutlu;

import java.util.Arrays;
import java.util.Scanner;

public class �okboyutluarray {
//�al��ma mant��� tablo gibi d���n�lebilir
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[][]=new int[2][3];
	//int[][] arr1= {{1,2,3,4,5},{6,7,8,9,10}};
	System.out.println("array de�erleriniz giriniz :");
	for (int de�er = 0; de�er < arr.length; de�er++) {
		for (int ekran = 0; ekran < arr[0].length; ekran++) {
			arr[de�er][ekran]=scan.nextInt();
		}
	}
	Arrays.toString(arr);
	for(int[] eleman : arr) {
	System.out.println("iki boyutlu dizimiz: "+eleman);
	
	}
	}

}
