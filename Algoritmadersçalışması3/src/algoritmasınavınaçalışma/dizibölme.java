package algoritmas�nav�na�al��ma;

import java.util.Scanner;

public class dizib�lme {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	System.out.println("ilk de�er: ");
	int sayi1=scan.nextInt();
	System.out.println("ikinci de�er: ");
	int sayi2=scan.nextInt();
	int data[]=new int[sayi1];
	int[] data2=new int[sayi2];
	int[] arr=new int[sayi1+sayi2];
	
	for(int index=0;index<arr.length;index++) {
		arr[index]=scan.nextInt();
	}
	for (int de�er = 0; de�er < data.length; de�er++) {
		data[de�er]=arr[de�er];
	}
	for (int saya� = 0; saya� < data2.length; saya�++) {
		data2[saya�]=arr[data.length+saya�];
	}
	for(int eleman: data) {
		System.out.println(eleman);
	}
	System.out.println("--------------------------------------------------------");
	for (int eleman2 : data2) {
		System.out.println(eleman2);
	}
	}

}
