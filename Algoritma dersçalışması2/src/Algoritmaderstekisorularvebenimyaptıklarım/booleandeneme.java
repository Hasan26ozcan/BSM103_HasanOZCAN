package algoritmasorularý1ödev;

import java.util.Scanner;

public class booleandeneme {
	
	public static boolean hesap(int a) {
	System.out.println("tersi ve düzü ayný olan bir sayý giriniz: ");
	Scanner scan=new Scanner(System.in);
	String abc=scan.nextLine();
	String sayaç="";
	for (int deðer =abc.length()-1; deðer >=0; deðer--) {
		sayaç+=abc.charAt(deðer);
	}
	System.out.println("sayýmýzý tersi budur: "+sayaç);
	if(sayaç.equals(abc)) {
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
		System.out.println("lütfen 0 ve 10 araýnda bir rakam giriniz: ");
		System.out.println("sistemi baþtan baþlatýnýz: ");
	}
	
	}

}
