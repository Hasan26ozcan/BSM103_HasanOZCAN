package algoritmasýnavýnaçalýþma;

import java.util.Scanner;

public class firstfunction {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	System.out.println("eleman sayýsýný giriniz: ");
	int elemansayisi=scan.nextInt();
	
	int dizi[]=new int[elemansayisi];
	for (int index = 0; index < dizi.length; index++) {
		System.out.println("dizinin elemanlarýný giriniz:  ");
		dizi[index]=scan.nextInt();
	}
	double ortalama=ortalama(dizi);
	System.out.println(ortalama);
	}

   public static double ortalama(int[] deðer) {
	 double toplam=0;
	for (int i = 0; i < deðer.length; i++) {
		toplam=toplam+deðer[i];
	}
	return toplam/deðer.length;
			
}
	
}
