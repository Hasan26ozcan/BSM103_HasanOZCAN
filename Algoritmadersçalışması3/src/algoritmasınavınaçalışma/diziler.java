package algoritmas�nav�na�al��ma;

import java.util.Scanner;
public class diziler {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	System.out.println("l�tfen de�er aral���n�z giriniz: ");
	int sayi=scan.nextInt();
	int arr[]=new int[sayi]; 
	//mesela burda bana 30 ��rencinin ortalmas�n� veren java kodunu dizilerle yaz�n�z
	
	int arr1[]=new int[5];
	int toplam=0;
	System.out.println("arr de�erleriniz giriniz: ");
	for (int de�er = 0; de�er < 5; de�er++) {
		arr1[de�er]=scan.nextInt();		
	}
	for (int i = 0; i < 5; i++) {
	toplam=toplam+arr1[i];	
	}
	int ortalama=toplam/5;
	System.out.println("ortalama de�erimiz: "+ortalama);
	}

}
