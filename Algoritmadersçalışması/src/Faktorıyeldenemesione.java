import java.util.Scanner;

public class Faktorýyeldenemesione {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Bir sayý giriniz: ");
	   int sayi =scan.nextInt();
	   int faktoriyel =1;
	   
	   while(sayi>=1) {
		   
		   faktoriyel =faktoriyel*sayi;
		   sayi--;
		   
		   System.out.println("sýrayla gi ");
		   
	   }
System.out.println("Girdiðiniz sayýnýn faktoriyel deðeri:"+ faktoriyel);
	}

}
