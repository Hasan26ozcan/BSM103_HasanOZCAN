package algoritmasýnavýnaçalýþma;

import java.util.Scanner;

public class zardangelensayýlarkaçýncýsýndaistediðimiziveriyordeneme {

	public static void main(String[] args) {
	int sayaç=0;
	int toplam=0;
	int[] arr=new int[10];
	Scanner scan=new Scanner(System.in);
	
	for (int index = 0; index < arr.length; index++) {
		arr[index]=scan.nextInt();
	}
	for (int deðer = 0; deðer < arr.length; deðer++) {
	if(arr[deðer]%2 ==0) {
		toplam=toplam+arr[deðer];
		sayaç++;
	}
	}
	int ortalama=toplam/sayaç;
	System.out.println(ortalama);
	}

}
