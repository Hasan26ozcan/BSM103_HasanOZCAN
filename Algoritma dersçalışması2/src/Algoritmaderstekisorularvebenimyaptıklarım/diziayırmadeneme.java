package algoritmasorularý1ödev;

import java.util.Scanner;

public class diziayýrmadeneme {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ilk deðer aralýðýnýzý giriniz:");
	int ar =scan.nextInt();
	int arr1[]=new int[ar];
	System.out.println("ikinici aralýk deðerinizi giriniz: ");
	int arr=scan.nextInt();
	int[] arr2=new int[arr];
	
	int[] arr3=new int[arr1.length+arr2.length];	
	System.out.println("arr3 deðerlerini giriniz");
	for (int counter = 0; counter < arr3.length; counter++) {
		arr3[counter]=scan.nextInt();
	}
	for (int deðer = 0; deðer < arr1.length; deðer++) {
		arr1[deðer]=arr3[deðer];
		System.out.println(arr1[deðer]);
	}
	System.out.println("---------------------------------------------------------------------------------------------");

	for (int sayaç = 0; sayaç < arr2.length; sayaç++) {
	arr2[sayaç] =arr3[arr1.length+sayaç];
System.out.println(arr2[sayaç]);
	}
	}

}
