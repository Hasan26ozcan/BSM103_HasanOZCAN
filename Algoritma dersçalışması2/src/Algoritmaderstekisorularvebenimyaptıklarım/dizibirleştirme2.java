package algoritmasorular�1�dev;

import java.util.Arrays;
import java.util.Scanner;

public class dizibirle�tirme2 {
	
	public static int[] birle�tirme(int[] a,int[] b) {
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
	birle�tirme(arr1, arr2);
	System.out.println(Arrays.toString(birle�tirme(arr1, arr2)));
	}

}
