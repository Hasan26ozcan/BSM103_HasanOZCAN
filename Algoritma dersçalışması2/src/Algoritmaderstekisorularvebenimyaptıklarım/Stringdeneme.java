package algoritmasorular�1�dev;

import java.util.Random;
import java.util.Scanner;

public class Stringdeneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	String add="ahmet";
System.out.println(add.length()+" uzunlu�u");
	for (int index = 0; index < add.length(); index++) {
		System.out.println((index+1)+"harf: "+add.charAt(index));
		
	}
	System.out.println("yaz�n�z� giriniz e�er son harfi s ise e�ittir ekrana yazd�r�r");
	String de�er=scan.next();
	char a=de�er.charAt(de�er.length()-1);
	if(a=='s') {
		System.out.println("e�ittir");
	}
	for (char c = 'a'; c <= 'z'; c++) {
		System.out.print(c);
	}
	System.out.println();

	int x=-17;
	int y=16;
	System.out.printf("  x is %d and y is %d",x,y);
			
	
		System.out.println();
	
	for (int index = 1; index <= 3; index++) {
		for (int sayy = 1; sayy < 6; sayy++) {
			System.out.printf("%4d ",(sayy*index));
			
	}
		System.out.println();
	}
	
	for (int index = 1; index <= 3; index++) {
		for (int sayy = 1; sayy < 6; sayy++) {
			System.out.printf("%-4d ",(sayy*index));
// burada da g�rebilece�imiz gibi - koyman�n ve koymaman�n olay�n� daha net bir �ekilde g�r�yoruz 			
	}
		System.out.println();
	}
	double gba =3.253673;
	System.out.printf("your gba is%8.1f\n",gba);
	System.out.printf("your gba is%8.3f\n",gba);
	// burda biz e�er 8 yazarsak bu 8 dde�eri bizim de�erimiz s�n�rlar� oluyor
	//bo�luk say�s� bizim de�erimize g�re de�i�kenlik g�stermektedir
	// ve fark edildi�i gibi ikinic de�erimizin sonu 4 nedenmi 4 5 ve 5 in yukar�s�ndaysa sa��ndaki say� onu yukar�ya yuvarl�yor
	
	//.Df
	//W.Df 
	double subtotal=scan.nextDouble();
	double tax=subtotal*0.8;
	double tip=subtotal*0.15;
	double total=subtotal+tax+tip;
	
	
	System.out.printf("subtoplam: %.2f\n",subtotal);
	System.out.printf("tax: %.2f\n",tax);
	System.out.printf("tip: %.2f\n",tip);
	System.out.printf("total: %.2f\n",total);
	
	System.out.println(59+47+8);
	
	
	
	}
}
