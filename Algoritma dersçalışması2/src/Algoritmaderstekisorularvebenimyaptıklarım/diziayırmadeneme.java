package algoritmasorular�1�dev;

import java.util.Scanner;

public class diziay�rmadeneme {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ilk de�er aral���n�z� giriniz:");
	int ar =scan.nextInt();
	int arr1[]=new int[ar];
	System.out.println("ikinici aral�k de�erinizi giriniz: ");
	int arr=scan.nextInt();
	int[] arr2=new int[arr];
	
	int[] arr3=new int[arr1.length+arr2.length];	
	System.out.println("arr3 de�erlerini giriniz");
	for (int counter = 0; counter < arr3.length; counter++) {
		arr3[counter]=scan.nextInt();
	}
	for (int de�er = 0; de�er < arr1.length; de�er++) {
		arr1[de�er]=arr3[de�er];
		System.out.println(arr1[de�er]);
	}
	System.out.println("---------------------------------------------------------------------------------------------");

	for (int saya� = 0; saya� < arr2.length; saya�++) {
	arr2[saya�] =arr3[arr1.length+saya�];
System.out.println(arr2[saya�]);
	}
	}

}
