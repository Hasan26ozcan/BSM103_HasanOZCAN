package algoritmasorularý1ödev;

import java.util.Scanner;

public class girilenbirsayýnýntersiniyazma {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("sayýnýzý giriniz: ");
	int a=scan.nextInt();
	int b=0;
	while(a>0) {
		b=a%10;
		a=a/10;
		System.out.print(b);
	}
	
	}

}
