package zzarraysçokboyutlu;

import java.util.Arrays;
import java.util.Scanner;

public class çokboyutluarray {
//çalýþma mantýðý tablo gibi düþünülebilir
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[][]=new int[2][3];
	//int[][] arr1= {{1,2,3,4,5},{6,7,8,9,10}};
	System.out.println("array deðerleriniz giriniz :");
	for (int deðer = 0; deðer < arr.length; deðer++) {
		for (int ekran = 0; ekran < arr[0].length; ekran++) {
			arr[deðer][ekran]=scan.nextInt();
		}
	}
	Arrays.toString(arr);
	for(int[] eleman : arr) {
	System.out.println("iki boyutlu dizimiz: "+eleman);
	
	}
	}

}
