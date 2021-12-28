import java.util.Scanner;

public class çemberalanveyarýçapalanbulma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("yarýçapýnýzý giriniz: ");
		int yarýçap=scan.nextInt();
		System.out.println("dairenin alanýný hesaplamak için 1: "); 
		System.out.println("çember hacmini hesaplamak için: 2");
		System.out.println("silindirin hacmini hesaplamak için 3");
		System.out.println("çemberin çevresini hesaplamk için 4: ");
		System.out.println("bir küpün deðerini hesaplamak için 5");
		System.out.println("koninin hacmini öðrnemek için 6 ");
		int islem=scan.nextInt();
		double pi=3.14;
		int yükseklik;
		switch(islem) {
		case 1: 
			double sonuc1= pi*yarýçap*yarýçap;
			System.out.println("alan sonucu: "+sonuc1);
			break;
		case 2: 
			double sonuc2=4/3*pi*yarýçap*yarýçap*yarýçap;
			System.out.println("hacim sonucu: "+sonuc2);
			break;
		case 3 :
			System.out.println("bir yükseklik deðeri giriniz: ");
			yükseklik =scan.nextInt();
			double sonuc3 =2*pi*yarýçap*yarýçap*yükseklik;
			System.out.println("silindir hacmi: "+sonuc3);
			break;
		case 4 :
			double sonuc4=2*pi*yarýçap;
			System.out.println("çemberin çevresi: "+sonuc4);
			break;
		case 5 :
			int küp=yarýçap*yarýçap*yarýçap;
			System.out.println("küpünün deðeri: "+küp);
			break;
		case 6:
			System.out.println("lütfen bir yükseklik deðeri giriniz:");
			double h =scan.nextInt();
			double sonuc6=pi*yarýçap*yarýçap*h/3;
			System.out.println("konin hacmi: "+sonuc6);
			
			
			
			
		}
		

	}

}










