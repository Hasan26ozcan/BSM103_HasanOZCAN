package algoritmasorular�1�dev;

import java.util.Scanner;

public class b�lmei�lemiyapma {
	
	
	
	public static int b�lme(int a,int b) {
		if(a ==0) {
			return 0;
		}
		else if(a-b==0) {
			return 1;
		}
		else if(a<b){
			return 0;
		}
		
			return 1+b�lme(a-b,b);
		
		
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ilk de�erinizi giriniz: ");
	int ilk=scan.nextInt();
	System.out.println("ikinci de�erinizi giriniz: ");
	int iki=scan.nextInt();
	
	System.out.println(b�lme(ilk,iki));
	}

}
