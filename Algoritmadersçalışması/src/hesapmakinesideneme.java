import java.util.Scanner;

public class hesapmakinesideneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1.say�y� giriniz: ");
		int sayi1=scan.nextInt();
		System.out.println("2. say�y� giriniz: ");
		int sayi2=scan.nextInt();
	
		System.out.println("i�lemiinizi se�iniz");
		System.out.println("1. toplama");
		System.out.println("2. ��kartma");
		System.out.println("3. b�lme");
		System.out.println("4. �arpma");
		System.out.println("5. e�er bir say�n�n o say�ya b�l�m�nden kalan� ��renmek istiyorsan ");
		int islem=scan.nextInt();
		
		switch(islem) {
		
		case 1:
			int sayi3=sayi1+sayi2;
			System.out.println("toplama i�leminin sonucu: "+sayi3);
			break;
			
		case 2 :
			int sayi4=sayi1-sayi2;
			break;
		case 3 :
			double sayi5 =(double)sayi1/sayi2;
			System.out.println("b�lme i�leminin sonucu. "+sayi5);
			break;
		case 4 :
			int sayi6 =sayi1*sayi2;
			System.out.println("�arpma i�eleminin sonucu: "+sayi6);
			break;
		case 5 :
			double mod=(double)sayi1%sayi2;
			System.out.println("modu: "+mod);
			break;
			
		
		}
		System.out.println("i�leminiz bitmi�tir:  ");
		islem=scan.nextInt();
		
		
		}
	

	}


