package algoritmasorular�1�dev;

import java.util.Scanner;

public class �zyinelmedeneme {
	
	
	public static double �ss�(double a,double b) {
	if(b ==0) {
		return 1;
	}
	if(b<0) {
		return  1/a*�ss�(a,b+1);
	}
	if(a ==0) {
		return 0;
	}
	if(a ==1 ) {
		return 1;
	}
	return a*�ss�(a,b-1);
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("hangi say�n�n kvvetini al�caz");
	double sayi1=scan.nextInt();
	System.out.println("ka��nc� kuvvetini al�caz: ");
	double sayi2=scan.nextInt();
	System.out.println(�ss�(sayi1,sayi2));
	System.out.println(Math.pow(sayi1, sayi2));
	}
	

}
