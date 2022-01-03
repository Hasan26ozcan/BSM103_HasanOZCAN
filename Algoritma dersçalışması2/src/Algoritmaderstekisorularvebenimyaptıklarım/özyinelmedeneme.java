package algoritmasorularý1ödev;

import java.util.Scanner;

public class özyinelmedeneme {
	
	
	public static double üssü(double a,double b) {
	if(b ==0) {
		return 1;
	}
	if(b<0) {
		return  1/a*üssü(a,b+1);
	}
	if(a ==0) {
		return 0;
	}
	if(a ==1 ) {
		return 1;
	}
	return a*üssü(a,b-1);
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("hangi sayýnýn kvvetini alýcaz");
	double sayi1=scan.nextInt();
	System.out.println("kaçýncý kuvvetini alýcaz: ");
	double sayi2=scan.nextInt();
	System.out.println(üssü(sayi1,sayi2));
	System.out.println(Math.pow(sayi1, sayi2));
	}
	

}
