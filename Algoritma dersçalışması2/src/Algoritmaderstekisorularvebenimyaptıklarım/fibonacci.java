package algoritmasorularý1ödev;

import java.util.Scanner;

public class fibonacci {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("bir sayý giriniz ve bu sayý fibonacci sýrasýnda hangi sayýya denk geldiðini söyleyeyim");
	 int sayi=scan.nextInt();
	 System.out.println("deðer: "+fibonacci(sayi));
	
}
 
 
 public static int fibonacci(int deðer) {
	 if(deðer<=2) {
		 deðer=1;
	 }
	 else {
		 return fibonacci(deðer-1)+fibonacci(deðer-2);
	 }
	 return deðer;
	
 }
}
