package algoritmasorular�1�dev;

import java.util.Scanner;

public class dizidebirsat�r�yazd�rma {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("sat�r uznlu�unuzu belirtiniz: ");
	int sat�r=scan.nextInt();
	System.out.println("s�tun uzunlu�unuzu belirtiniz: ");
	int s�tun=scan.nextInt();
	int [][] arr=new int [sat�r][s�tun];
	
	
	for (int index = 0; index < arr.length; index++) {
	for (int de�er = 0; de�er < arr.length; de�er++) {
		arr[index][de�er] =scan.nextInt();
	}	
		
	}
	for (int s�tunyaz = 0; s�tunyaz < arr[1].length; s�tunyaz++) {
		System.out.println(arr[s�tunyaz][1]);
	}
	
	
	
	
	}

}
