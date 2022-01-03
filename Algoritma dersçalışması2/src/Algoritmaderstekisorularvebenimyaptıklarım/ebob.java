package algoritmasorularý1ödev;

import java.util.Scanner;
//hata var 2 tane 
// for döngüsünde sayi 2 ve üstüne gidiyor ama eðer 2 kere 2 ye bölüceksek ne yapýcaz iþte o zmana iþler zorlaþýyor
//ikinic hatamýz ise a1=10 mesela 5 e tam böldü 2. ife girmedi o zamanda yapmamýz gereken þey
//10/5 oluyor ama ikinci ife girmiyor bu yüzden onu bölmüyr sonucu 2 çýkýyor bunun ama 2 ye takrar bölemiyoruz orda kod kalýyor
public class ebob {
	
	
	public static int ebob(int a1,int b1) {
		if( a1==1) {
			return 1;
		}
		if(b1 ==1) {
			return 1;
		}
		int sayac =0;
		int toplam=1;
		if(a1<b1) {
			sayac=a1;
		}
		else if(a1>b1) {
			sayac=b1;
		}
		System.out.println(sayac);
		for (int deðer = 2; deðer <= sayac; deðer++) {
			if(a1%deðer==0) {
				if(b1 % deðer ==0) {
				toplam=toplam*deðer;
				b1=b1/deðer;
				
				}// b1 ifi bitiþi
				a1=a1/deðer;
			}//a1 ifi bitiþi
			System.out.println(toplam);
		}//for bitiþi
		return toplam;
	}

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("ilk deðerinizi giriniz:");
	int sayi1=scan.nextInt();
	System.out.println("ikinci deðerinizi giriniz:");
	int sayi2=scan.nextInt();
	System.out.println(ebob(sayi1,sayi2));
	}

}
