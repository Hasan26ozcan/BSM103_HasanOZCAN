package algoritmasorular�1�dev;

import java.util.Scanner;

public class booleandeneme {
	
	public static boolean hesap(int a) {
	System.out.println("tersi ve d�z� ayn� olan bir say� giriniz: ");
	Scanner scan=new Scanner(System.in);
	String abc=scan.nextLine();
	String saya�="";
	for (int de�er =abc.length()-1; de�er >=0; de�er--) {
		saya�+=abc.charAt(de�er);
	}
	System.out.println("say�m�z� tersi budur: "+saya�);
	if(saya�.equals(abc)) {
		return true;
	}
	return false;
	}
	

	public static void main(String[] args) {
	System.out.println("br rakam giriniz");
	Scanner scan=new Scanner(System.in);
	int sayi=scan.nextInt();
	if(sayi<10 && sayi>0) {
		System.out.println(hesap(sayi));
	}
	else {
		System.out.println("l�tfen 0 ve 10 ara�nda bir rakam giriniz: ");
		System.out.println("sistemi ba�tan ba�lat�n�z: ");
	}
	
	}

}
