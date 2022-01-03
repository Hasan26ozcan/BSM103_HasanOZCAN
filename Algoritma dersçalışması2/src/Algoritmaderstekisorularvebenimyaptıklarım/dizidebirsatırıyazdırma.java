package algoritmasorularý1ödev;

import java.util.Scanner;

public class dizidebirsatýrýyazdýrma {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("satýr uznluðunuzu belirtiniz: ");
	int satýr=scan.nextInt();
	System.out.println("sütun uzunluðunuzu belirtiniz: ");
	int sütun=scan.nextInt();
	int [][] arr=new int [satýr][sütun];
	
	
	for (int index = 0; index < arr.length; index++) {
	for (int deðer = 0; deðer < arr.length; deðer++) {
		arr[index][deðer] =scan.nextInt();
	}	
		
	}
	for (int sütunyaz = 0; sütunyaz < arr[1].length; sütunyaz++) {
		System.out.println(arr[sütunyaz][1]);
	}
	
	
	
	
	}

}
