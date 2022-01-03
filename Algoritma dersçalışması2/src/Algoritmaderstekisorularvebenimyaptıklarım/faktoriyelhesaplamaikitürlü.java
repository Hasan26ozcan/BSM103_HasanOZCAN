package algoritmasorularý1ödev;

import java.util.Scanner;

public class faktoriyelhesaplamaikitürlü {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("bir sayý giriniz:");
    int sayi=scan.nextInt();
    int faktoriyel=1;
    while(sayi!=1) {
    	faktoriyel=faktoriyel*sayi;
    	sayi--;
    	System.out.println(faktoriyel+"             "+sayi);
    	
    }
    System.out.println(faktoriyel);
    System.out.println("burayada bir deðer giriniz bununda faktoriyelini metotla bulalým");
    int mana=scan.nextInt();
    System.out.println("deðer"+faktoriyel(mana));
	}
	
	
	public static int faktoriyel(int deðer) {
		if(deðer==1) {
			deðer=1;
			
		}
		else {
		return deðer*faktoriyel(deðer-1);
		}
		return deðer;
	}

}
