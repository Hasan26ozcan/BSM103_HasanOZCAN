package algoritmasorular�1�dev;

import java.util.Scanner;

public class ebob1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ilk de�erinizi giriniz: ");
	int sayi1=scan.nextInt();
	System.out.println("ikinci de�erinizi giriniz: ");
	int sayi2=scan.nextInt();
	int ebob=0;	
	int min=0;
	if(sayi1<sayi2){
		min=sayi1;		
	}
	if(sayi2<sayi1) {
		min=sayi2;
	}
	for (int index = 2; index < min; index++) {
		if(sayi1%index ==0 && sayi2%index==0) {
			ebob=index;
		}		
	}
	System.out.println("say�n�n ebobu: "+ebob);

	System.out.println("ekok de�erimiz: "+sayi1*sayi2/ebob);

	
	}

}
