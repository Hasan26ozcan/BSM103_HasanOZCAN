import java.util.Scanner;

public class Faktor�yeldenemesione {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Bir say� giriniz: ");
	   int sayi =scan.nextInt();
	   int faktoriyel =1;
	   
	   while(sayi>=1) {
		   
		   faktoriyel =faktoriyel*sayi;
		   sayi--;
		   
		   System.out.println("s�rayla gi ");
		   
	   }
System.out.println("Girdi�iniz say�n�n faktoriyel de�eri:"+ faktoriyel);
	}

}
