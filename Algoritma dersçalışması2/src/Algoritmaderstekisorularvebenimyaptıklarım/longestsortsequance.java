package algoritmasorular�1�dev;

import java.util.Scanner;

public class longestsortsequance {
	
	public static int de�er(int a,int b) {
	if(b==0) {
		return 0;
	}
	if(a==1) {
		return b;
	}
	return a +de�er(a,b-1);
	
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ilk de�erinizi giriniz: ");
		int ilk=scan.nextInt();
		System.out.println("ikinic de�erinizi giriniz: ");
		int iki=scan.nextInt();
		
		System.out.println(de�er(ilk,iki));
		
	
	}

}
