package algoritmasorular�1�dev;

import java.util.Scanner;
//hata var 2 tane 
// for d�ng�s�nde sayi 2 ve �st�ne gidiyor ama e�er 2 kere 2 ye b�l�ceksek ne yap�caz i�te o zmana i�ler zorla��yor
//ikinic hatam�z ise a1=10 mesela 5 e tam b�ld� 2. ife girmedi o zamanda yapmam�z gereken �ey
//10/5 oluyor ama ikinci ife girmiyor bu y�zden onu b�lm�yr sonucu 2 ��k�yor bunun ama 2 ye takrar b�lemiyoruz orda kod kal�yor
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
		for (int de�er = 2; de�er <= sayac; de�er++) {
			if(a1%de�er==0) {
				if(b1 % de�er ==0) {
				toplam=toplam*de�er;
				b1=b1/de�er;
				
				}// b1 ifi biti�i
				a1=a1/de�er;
			}//a1 ifi biti�i
			System.out.println(toplam);
		}//for biti�i
		return toplam;
	}

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("ilk de�erinizi giriniz:");
	int sayi1=scan.nextInt();
	System.out.println("ikinci de�erinizi giriniz:");
	int sayi2=scan.nextInt();
	System.out.println(ebob(sayi1,sayi2));
	}

}
