package algoritmas�nav�na�al��ma;

import java.util.Scanner;

public class zardangelensay�larka��nc�s�ndaistedi�imiziveriyordeneme {

	public static void main(String[] args) {
	int saya�=0;
	int toplam=0;
	int[] arr=new int[10];
	Scanner scan=new Scanner(System.in);
	
	for (int index = 0; index < arr.length; index++) {
		arr[index]=scan.nextInt();
	}
	for (int de�er = 0; de�er < arr.length; de�er++) {
	if(arr[de�er]%2 ==0) {
		toplam=toplam+arr[de�er];
		saya�++;
	}
	}
	int ortalama=toplam/saya�;
	System.out.println(ortalama);
	}

}
