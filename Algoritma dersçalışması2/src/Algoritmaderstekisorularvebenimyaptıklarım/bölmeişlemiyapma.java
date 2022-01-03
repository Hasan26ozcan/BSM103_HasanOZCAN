package algoritmasorularý1ödev;

import java.util.Scanner;

public class bölmeiþlemiyapma {
	
	
	
	public static int bölme(int a,int b) {
		if(a ==0) {
			return 0;
		}
		else if(a-b==0) {
			return 1;
		}
		else if(a<b){
			return 0;
		}
		
			return 1+bölme(a-b,b);
		
		
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ilk deðerinizi giriniz: ");
	int ilk=scan.nextInt();
	System.out.println("ikinci deðerinizi giriniz: ");
	int iki=scan.nextInt();
	
	System.out.println(bölme(ilk,iki));
	}

}
