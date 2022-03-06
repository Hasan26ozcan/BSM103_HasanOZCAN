package algoritma2;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayý giriniz: ");
		double a=scan.nextInt();
		System.out.println(sumTo(a));
		sumTo(a);
		
	}
	public static double sumTo(double toplamlarý) {
		if(toplamlarý==1) {
			return 1.0;
		}
		return sumTo(toplamlarý-1)+1/toplamlarý;
	}
	
	

}
