package hafta15uygulama;

import java.util.Scanner;

public class asalsayýtoplamý {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("kaçtane asal sayý toplansýn");
		int sayi=scan.nextInt();
		System.out.println(asalsayý(sayi));
	}
	public static int asalsayý(int sayi) {
		int sayaç=2;
		int counter=0;
		int asalsayitoplamlarý=0;
		while(counter !=sayi) {
			int sayin=0;
			int i=2;
			for ( i = 2; i < sayaç; i++) {
				if(sayaç%i==0) {
					sayin++;
				}else {
					
				}
				
				
			}
			
			System.out.println(sayin);
			System.out.println(sayaç);
			if(sayin==0) {
				counter++;
			asalsayitoplamlarý+=sayaç;
			}
			System.out.println("||||||||||||||||||||||||||||");
			System.out.println(asalsayitoplamlarý);
			System.out.println("||||||||||||||||||||||||||||");
			sayaç++;
		}
		return asalsayitoplamlarý;
	}

}
