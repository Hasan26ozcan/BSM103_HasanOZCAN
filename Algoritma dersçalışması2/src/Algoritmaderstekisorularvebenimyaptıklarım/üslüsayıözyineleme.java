package algoritmasorular�1�dev;

import java.util.Scanner;

public class �sl�say��zyineleme {
	
	
	
	public static double �ss�(double a,double b) {
	if(a ==1) {
		return 1;
	}
	if(b ==0) {
		return 1;
	}
	if(b<0) {
		return 1/a*�ss�(a,b+1);
	}
	return a*�ss�(a,b-1);
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("hangi say�n�n kuvvetini al�caz: ");
	double taban=scan.nextInt();
	System.out.println("ka��nc� kuvvetini al�caz: ");
	double �ss�=scan.nextInt();
	System.out.println(�ss�(taban,�ss�));
	}

}
