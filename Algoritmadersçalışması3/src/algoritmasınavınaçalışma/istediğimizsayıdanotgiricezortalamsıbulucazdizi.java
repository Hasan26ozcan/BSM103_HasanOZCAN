package algoritmasýnavýnaçalýþma;

import java.util.Scanner;

public class istediðimizsayýdanotgiricezortalamsýbulucazdizi {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("sayýlarýnýzý 100 ve 0 arasýnda giriniz: ");
	int sayi=scan.nextInt();
	int deðer =0;
	int toplam=0;
	for ( deðer = 0; sayi != -1 ; deðer++) {
		if(sayi<100 && sayi>0) {
		toplam=toplam+sayi;
		System.out.println("çýkmak için -1 e basýnýz devam etmek için notlarýnýzý giriniz: ");
		 sayi=scan.nextInt();
		}
	}
	int ortalama=toplam/deðer;
	System.out.println(ortalama);
	}

}
