package algoritmasýnavýnaçalýþma;

import java.util.Scanner;

public class yüzdekaçýnýnçiftolduðunuhesaplama {

	public static void main(String[] args) {
	int sayaç=0;
	Scanner scan=new Scanner(System.in);
	int[] arr=new int[4];
	for (int index = 0; index < arr.length; index++) {
		arr[index]=scan.nextInt();
		if(arr[index]%2 ==0) {
			sayaç++;
		
	}
	/*for (int deðer = 0; deðer < arr.length; deðer++) {
		if(arr[deðer]%2 ==0) {
			sayaç++;
		}
	}*/
	}
	System.out.println("yüzde "+sayaç*100/arr.length+"çifttir");
	int tek=sayaç*100/arr.length;
	int deðer=100-tek;
	System.out.println("yüzde "+deðer+"sayýdýr");
//eðer bölülü durumda ise 2/4 ise mesela cevap 0 çýkýyor ve doðru sonucu bize vermiyor
	}
	}
