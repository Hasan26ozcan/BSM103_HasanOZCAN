import java.util.Scanner;

public class �emberalanveyar��apalanbulma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("yar��ap�n�z� giriniz: ");
		int yar��ap=scan.nextInt();
		System.out.println("dairenin alan�n� hesaplamak i�in 1: "); 
		System.out.println("�ember hacmini hesaplamak i�in: 2");
		System.out.println("silindirin hacmini hesaplamak i�in 3");
		System.out.println("�emberin �evresini hesaplamk i�in 4: ");
		System.out.println("bir k�p�n de�erini hesaplamak i�in 5");
		System.out.println("koninin hacmini ��rnemek i�in 6 ");
		int islem=scan.nextInt();
		double pi=3.14;
		int y�kseklik;
		switch(islem) {
		case 1: 
			double sonuc1= pi*yar��ap*yar��ap;
			System.out.println("alan sonucu: "+sonuc1);
			break;
		case 2: 
			double sonuc2=4/3*pi*yar��ap*yar��ap*yar��ap;
			System.out.println("hacim sonucu: "+sonuc2);
			break;
		case 3 :
			System.out.println("bir y�kseklik de�eri giriniz: ");
			y�kseklik =scan.nextInt();
			double sonuc3 =2*pi*yar��ap*yar��ap*y�kseklik;
			System.out.println("silindir hacmi: "+sonuc3);
			break;
		case 4 :
			double sonuc4=2*pi*yar��ap;
			System.out.println("�emberin �evresi: "+sonuc4);
			break;
		case 5 :
			int k�p=yar��ap*yar��ap*yar��ap;
			System.out.println("k�p�n�n de�eri: "+k�p);
			break;
		case 6:
			System.out.println("l�tfen bir y�kseklik de�eri giriniz:");
			double h =scan.nextInt();
			double sonuc6=pi*yar��ap*yar��ap*h/3;
			System.out.println("konin hacmi: "+sonuc6);
			
			
			
			
		}
		

	}

}










