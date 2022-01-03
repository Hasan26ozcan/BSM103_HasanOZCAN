package algoritmasorularý1ödev;

import java.util.Scanner;

public class finalvizenotuhesaplamametotlarla {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("lütfen vize notunuzu giriniz:");
double vizenotu=scan.nextInt();
System.out.println("lütfen final notunuzu giriniz:");
double finalnotu=scan.nextInt();
System.out.println("ortalama deðerimiz budur");
System.out.println("------------------------------------------------------------------------------------");
System.out.println(ortalama(vizenotu,finalnotu));
System.out.println(gerçekdeðeri(ortalama(vizenotu,finalnotu)));
	}
	public static double ortalama(double a,double b) {
	double vizenotu=a*40/100;
	double finalnotu=b*60/100;
	double toplam=vizenotu+finalnotu;
	
	if(toplam>=80) {
		System.out.println("toplam deðeriniz 80 den büyüktür 80 < "+toplam);
		vizenotu=vizenotu*1.01;
		System.out.println("tebrikler kaat notunu kazandýnýz yeni notunuz");
		System.out.println(vizenotu);
		finalnotu=finalnotu*1.00;
		System.out.println("final için ek notunuzu almaya hak kazandýnýz");
		System.out.println(finalnotu);
		toplam=vizenotu+finalnotu;
		System.out.println("yeni not ortalamanýz: "+toplam);
		
		
	}
	else if(toplam<80 && toplam>=50) {
		System.out.println("deðeriniz 80 ve 50 arasýndadýr = "+toplam);
		System.out.println("maalesef size kaat notu girilemiyecektir");
		System.out.println("notlarýnýz aynen kalýcaktýr: "+toplam);
	}
	else {
		System.out.println("notunuz 50 den daha düþüktür dersten kaldýnýz seneye geliniz:");
	}
	
	if(toplam>100) {
		toplam=100;
	}
	
	
	
	return toplam;
		
		
		
	}
	public static double gerçekdeðeri(double c) {
		if(c>=10) {
		 c=c/10;
		}
		System.out.println("birde isterseniz burda bide bu sayýnýn faktoriyeliniz bulalým"+c);
	if(c>=1 &&c<2) {
		return 1;
	}
	else {
		return c*gerçekdeðeri(c-1);
	}
	}

}
