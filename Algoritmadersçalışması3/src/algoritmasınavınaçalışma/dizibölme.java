package algoritmasýnavýnaçalýþma;

import java.util.Scanner;

public class dizibölme {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	System.out.println("ilk deðer: ");
	int sayi1=scan.nextInt();
	System.out.println("ikinci deðer: ");
	int sayi2=scan.nextInt();
	int data[]=new int[sayi1];
	int[] data2=new int[sayi2];
	int[] arr=new int[sayi1+sayi2];
	
	for(int index=0;index<arr.length;index++) {
		arr[index]=scan.nextInt();
	}
	for (int deðer = 0; deðer < data.length; deðer++) {
		data[deðer]=arr[deðer];
	}
	for (int sayaç = 0; sayaç < data2.length; sayaç++) {
		data2[sayaç]=arr[data.length+sayaç];
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
