package algoritmas�nav�na�al��ma;

import java.util.Scanner;

public class firstfunction {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	System.out.println("eleman say�s�n� giriniz: ");
	int elemansayisi=scan.nextInt();
	
	int dizi[]=new int[elemansayisi];
	for (int index = 0; index < dizi.length; index++) {
		System.out.println("dizinin elemanlar�n� giriniz:  ");
		dizi[index]=scan.nextInt();
	}
	double ortalama=ortalama(dizi);
	System.out.println(ortalama);
	}

   public static double ortalama(int[] de�er) {
	 double toplam=0;
	for (int i = 0; i < de�er.length; i++) {
		toplam=toplam+de�er[i];
	}
	return toplam/de�er.length;
			
}
	
}
