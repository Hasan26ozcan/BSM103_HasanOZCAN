import java.util.Scanner;

public class ortalamabulmatoplamsay� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("not giriniz:");
		int not = scan.nextInt();
		int sayi =0;
		int toplam = 0;
		while (not !=-1) {
		toplam =toplam+not;
				sayi++;
			System.out.println("i�lemden ��kmak i�in -1 devam etmek i�in not giriniz: ");
			 not =scan.nextInt();
		}
		if(sayi !=0) {
			double ortalama = (double) toplam/sayi;
			System.out.println("toplam notlar�n toplam�: "+toplam);
			System.out.println("ortalama"+ortalama);
		}
		else {
			
			System.out.println("i�leminiz ba�lamadan bitmi�tir");
		}
		
	}//**bu soruda istedi�imiz kadar say� girebiliriz biz -1 yazas�ya kadar devam edicek
	

}
