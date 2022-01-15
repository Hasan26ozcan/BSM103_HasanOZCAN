package algoritmasýnavýnaçalýþma;

import java.util.Scanner;
public class diziler {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	System.out.println("lütfen deðer aralýðýnýz giriniz: ");
	int sayi=scan.nextInt();
	int arr[]=new int[sayi]; 
	//mesela burda bana 30 öðrencinin ortalmasýný veren java kodunu dizilerle yazýnýz
	
	int arr1[]=new int[5];
	int toplam=0;
	System.out.println("arr deðerleriniz giriniz: ");
	for (int deðer = 0; deðer < 5; deðer++) {
		arr1[deðer]=scan.nextInt();		
	}
	for (int i = 0; i < 5; i++) {
	toplam=toplam+arr1[i];	
	}
	int ortalama=toplam/5;
	System.out.println("ortalama deðerimiz: "+ortalama);
	}

}
