package algoritmas�nav�na�al��ma;

import java.util.Scanner;

public class istedi�imizsay�danotgiricezortalams�bulucazdizi {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("say�lar�n�z� 100 ve 0 aras�nda giriniz: ");
	int sayi=scan.nextInt();
	int de�er =0;
	int toplam=0;
	for ( de�er = 0; sayi != -1 ; de�er++) {
		if(sayi<100 && sayi>0) {
		toplam=toplam+sayi;
		System.out.println("��kmak i�in -1 e bas�n�z devam etmek i�in notlar�n�z� giriniz: ");
		 sayi=scan.nextInt();
		}
	}
	int ortalama=toplam/de�er;
	System.out.println(ortalama);
	}

}
