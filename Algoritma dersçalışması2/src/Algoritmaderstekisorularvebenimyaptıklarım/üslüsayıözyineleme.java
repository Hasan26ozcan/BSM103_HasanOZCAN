package algoritmasorularý1ödev;

import java.util.Scanner;

public class üslüsayýözyineleme {
	
	
	
	public static double üssü(double a,double b) {
	if(a ==1) {
		return 1;
	}
	if(b ==0) {
		return 1;
	}
	if(b<0) {
		return 1/a*üssü(a,b+1);
	}
	return a*üssü(a,b-1);
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("hangi sayýnýn kuvvetini alýcaz: ");
	double taban=scan.nextInt();
	System.out.println("kaçýncý kuvvetini alýcaz: ");
	double üssü=scan.nextInt();
	System.out.println(üssü(taban,üssü));
	}

}
