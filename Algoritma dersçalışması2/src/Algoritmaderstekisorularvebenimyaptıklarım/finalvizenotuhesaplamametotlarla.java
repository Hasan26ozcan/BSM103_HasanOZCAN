package algoritmasorular�1�dev;

import java.util.Scanner;

public class finalvizenotuhesaplamametotlarla {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("l�tfen vize notunuzu giriniz:");
double vizenotu=scan.nextInt();
System.out.println("l�tfen final notunuzu giriniz:");
double finalnotu=scan.nextInt();
System.out.println("ortalama de�erimiz budur");
System.out.println("------------------------------------------------------------------------------------");
System.out.println(ortalama(vizenotu,finalnotu));
System.out.println(ger�ekde�eri(ortalama(vizenotu,finalnotu)));
	}
	public static double ortalama(double a,double b) {
	double vizenotu=a*40/100;
	double finalnotu=b*60/100;
	double toplam=vizenotu+finalnotu;
	
	if(toplam>=80) {
		System.out.println("toplam de�eriniz 80 den b�y�kt�r 80 < "+toplam);
		vizenotu=vizenotu*1.01;
		System.out.println("tebrikler kaat notunu kazand�n�z yeni notunuz");
		System.out.println(vizenotu);
		finalnotu=finalnotu*1.00;
		System.out.println("final i�in ek notunuzu almaya hak kazand�n�z");
		System.out.println(finalnotu);
		toplam=vizenotu+finalnotu;
		System.out.println("yeni not ortalaman�z: "+toplam);
		
		
	}
	else if(toplam<80 && toplam>=50) {
		System.out.println("de�eriniz 80 ve 50 aras�ndad�r = "+toplam);
		System.out.println("maalesef size kaat notu girilemiyecektir");
		System.out.println("notlar�n�z aynen kal�cakt�r: "+toplam);
	}
	else {
		System.out.println("notunuz 50 den daha d���kt�r dersten kald�n�z seneye geliniz:");
	}
	
	if(toplam>100) {
		toplam=100;
	}
	
	
	
	return toplam;
		
		
		
	}
	public static double ger�ekde�eri(double c) {
		if(c>=10) {
		 c=c/10;
		}
		System.out.println("birde isterseniz burda bide bu say�n�n faktoriyeliniz bulal�m"+c);
	if(c>=1 &&c<2) {
		return 1;
	}
	else {
		return c*ger�ekde�eri(c-1);
	}
	}

}
