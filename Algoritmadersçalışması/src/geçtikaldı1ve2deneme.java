import java.util.Scanner;

public class ge�tikald�1ve2deneme {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("ge�ip ge�medi�iniz belirticek de�erleri buraya giriniz: ");
		
		//�nce de�i�kenlerimizi yazal�m
		int gecen =0;
		int kalan =0;	
		int sayac = 1;
		int sonuc =scan.nextInt();
		
		while(sayac<=10) {
			System.out.println("sonucu gir (1=ge�ti,2=kald�)");
			sonuc=scan.nextInt();
			
			if(sonuc==1) {
				
				gecen =gecen +1;
			}
			else {
					kalan = kalan + 1;
				}
			sayac++;
			}//while d�ng�s� burda bitiyor//
			System.out.println("ge�en: "+gecen+"  kalan"+kalan);
			
			if(gecen>8) {
				System.out.println("Tebrikler ba�ar�l�s�n�z");
				
				
			}
			else {
				
				System.out.println("Ba�ar�l� de�ilsiniz");
			}
		}
	}


