import java.util.Scanner;

public class hesapmakinesideneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1.sayýyý giriniz: ");
		int sayi1=scan.nextInt();
		System.out.println("2. sayýyý giriniz: ");
		int sayi2=scan.nextInt();
	
		System.out.println("iþlemiinizi seçiniz");
		System.out.println("1. toplama");
		System.out.println("2. çýkartma");
		System.out.println("3. bölme");
		System.out.println("4. çarpma");
		System.out.println("5. eðer bir sayýnýn o sayýya bölümünden kalaný öðrenmek istiyorsan ");
		int islem=scan.nextInt();
		
		switch(islem) {
		
		case 1:
			int sayi3=sayi1+sayi2;
			System.out.println("toplama iþleminin sonucu: "+sayi3);
			break;
			
		case 2 :
			int sayi4=sayi1-sayi2;
			break;
		case 3 :
			double sayi5 =(double)sayi1/sayi2;
			System.out.println("bölme iþleminin sonucu. "+sayi5);
			break;
		case 4 :
			int sayi6 =sayi1*sayi2;
			System.out.println("çarpma iþeleminin sonucu: "+sayi6);
			break;
		case 5 :
			double mod=(double)sayi1%sayi2;
			System.out.println("modu: "+mod);
			break;
			
		
		}
		System.out.println("iþleminiz bitmiþtir:  ");
		islem=scan.nextInt();
		
		
		}
	

	}


