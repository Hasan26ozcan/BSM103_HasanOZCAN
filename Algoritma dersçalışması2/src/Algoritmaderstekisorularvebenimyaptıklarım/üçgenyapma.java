package algoritmasorular�1�dev;

import java.util.Scanner;

public class ��genyapma {
	
	public static boolean myster(int c,int d) {
	System.out.println("ilk de�erimiz: "+c);
	System.out.println("ikinci de�erimiz: "+d);
	double toplam=c+d;
	if(c+d==toplam) {
		System.out.println("true");
		return true;
	}
	return false;
	
	}
	
	
	
    public static void main(String[] args) {
	for (int row = 6; row >0; row--) {
		for (int column = 1; column < row; column++) {
		System.out.print("*");
		}
		System.out.println(row);
	}
	
	
	for (int de�er = 0; de�er < 2 ; de�er++) {
		
	
	for (int row = 1; row <=6; row++) {
		for (int column = 0; column <6+(-1*row); column++) {
			System.out.print(" ");
		}
		for (int column1 = 0; column1 < row; column1++) {
			System.out.print(row);
			System.out.print(" ");
		}
		System.out.println("                       "+ row);
	}
	}
	
	
	for (int row = 6; row>0; row--) {
		for (int column = 0; column < 6+(row*-1); column++) {
			System.out.print(" ");
		}
		System.out.print(row);
		for (int column1 = 0; column1 < row; column1++) {
			System.out.print("  ");
		}
		System.out.println(row);
	}
	for (int row = 1; row < 6; row++) {
		for (int column = 1; column < row; column++) {
			System.out.print(" ");
		}
		System.out.print(row);
		for (int column1 = 0; column1 <6+(row*-1) ; column1++) {
			System.out.print("  ");
		}
		System.out.println(row);
	}	
	Scanner scan=new Scanner(System.in);
	System.out.println("bir de�er giriniz: ");
	int a=scan.nextInt();	
	System.out.println("ikinici de�erinizi giriniz: ");
	int b=scan.nextInt();
	
	myster(a,b);
	
	
	
}
}
