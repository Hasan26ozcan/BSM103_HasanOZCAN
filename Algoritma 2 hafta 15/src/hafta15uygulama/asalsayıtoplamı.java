package hafta15uygulama;

import java.util.Scanner;

public class asalsay�toplam� {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ka�tane asal say� toplans�n");
		int sayi=scan.nextInt();
		System.out.println(asalsay�(sayi));
	}
	public static int asalsay�(int sayi) {
		int saya�=2;
		int counter=0;
		int asalsayitoplamlar�=0;
		while(counter !=sayi) {
			int sayin=0;
			int i=2;
			for ( i = 2; i < saya�; i++) {
				if(saya�%i==0) {
					sayin++;
				}else {
					
				}
				
				
			}
			
			System.out.println(sayin);
			System.out.println(saya�);
			if(sayin==0) {
				counter++;
			asalsayitoplamlar�+=saya�;
			}
			System.out.println("||||||||||||||||||||||||||||");
			System.out.println(asalsayitoplamlar�);
			System.out.println("||||||||||||||||||||||||||||");
			saya�++;
		}
		return asalsayitoplamlar�;
	}

}
