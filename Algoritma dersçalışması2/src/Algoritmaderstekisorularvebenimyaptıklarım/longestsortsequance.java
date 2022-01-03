package algoritmasorularý1ödev;

import java.util.Scanner;

public class longestsortsequance {
	
	public static int deðer(int a,int b) {
	if(b==0) {
		return 0;
	}
	if(a==1) {
		return b;
	}
	return a +deðer(a,b-1);
	
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ilk deðerinizi giriniz: ");
		int ilk=scan.nextInt();
		System.out.println("ikinic deðerinizi giriniz: ");
		int iki=scan.nextInt();
		
		System.out.println(deðer(ilk,iki));
		
	
	}

}
