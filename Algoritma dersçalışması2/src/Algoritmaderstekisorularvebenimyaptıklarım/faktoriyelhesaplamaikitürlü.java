package algoritmasorular�1�dev;

import java.util.Scanner;

public class faktoriyelhesaplamaikit�rl� {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("bir say� giriniz:");
    int sayi=scan.nextInt();
    int faktoriyel=1;
    while(sayi!=1) {
    	faktoriyel=faktoriyel*sayi;
    	sayi--;
    	System.out.println(faktoriyel+"             "+sayi);
    	
    }
    System.out.println(faktoriyel);
    System.out.println("burayada bir de�er giriniz bununda faktoriyelini metotla bulal�m");
    int mana=scan.nextInt();
    System.out.println("de�er"+faktoriyel(mana));
	}
	
	
	public static int faktoriyel(int de�er) {
		if(de�er==1) {
			de�er=1;
			
		}
		else {
		return de�er*faktoriyel(de�er-1);
		}
		return de�er;
	}

}
