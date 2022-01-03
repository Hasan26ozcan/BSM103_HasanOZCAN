package algoritmasorularý1ödev;

import java.util.Arrays;
import java.util.Scanner;

public class dizibirleþtirme2 {
	
	public static int[] birleþtirme(int[] a,int[] b) {
	int[] arr3=new int[a.length+b.length];
	for (int index = 0; index < a.length; index++) {
		arr3[index]=a[index];
	}
	for (int index = 0; index < b.length; index++) {
		arr3[a.length+index]=b[index];
	}
	return arr3;
	}
	

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int[] arr1= {1,2,3,4,5};
	int[] arr2 = {6,7,8,9,10};
	birleþtirme(arr1, arr2);
	System.out.println(Arrays.toString(birleþtirme(arr1, arr2)));
	}

}
