package algoritmasınavınaçalışma;

import java.util.Scanner;

public class zardangelensayılarkaçıncısındaistediğimiziveriyordeneme {

	public static void main(String[] args) {
	int sayaç=0;
	int toplam=0;
	int[] arr=new int[10];
	Scanner scan=new Scanner(System.in);
	
	for (int index = 0; index < arr.length; index++) {
		arr[index]=scan.nextInt();
	}
	for (int değer = 0; değer < arr.length; değer++) {
	if(arr[değer]%2 ==0) {
		toplam=toplam+arr[değer];
		sayaç++;
	}
	}
	int ortalama=toplam/sayaç;
	System.out.println(ortalama);
	}

}
