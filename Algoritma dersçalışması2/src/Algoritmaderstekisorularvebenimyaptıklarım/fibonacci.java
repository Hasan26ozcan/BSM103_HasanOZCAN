package algoritmasorular�1�dev;

import java.util.Scanner;

public class fibonacci {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("bir say� giriniz ve bu say� fibonacci s�ras�nda hangi say�ya denk geldi�ini s�yleyeyim");
	 int sayi=scan.nextInt();
	 System.out.println("de�er: "+fibonacci(sayi));
	
}
 
 
 public static int fibonacci(int de�er) {
	 if(de�er<=2) {
		 de�er=1;
	 }
	 else {
		 return fibonacci(de�er-1)+fibonacci(de�er-2);
	 }
	 return de�er;
	
 }
}
