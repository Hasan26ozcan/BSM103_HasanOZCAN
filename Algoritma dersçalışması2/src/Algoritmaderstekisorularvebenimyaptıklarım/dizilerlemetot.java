package algoritmasorular�1�dev;

import java.util.Arrays;
import java.util.Scanner;

public class dizilerlemetot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ka� eleman girice�iniz belirtiniz:");
		int elaman=scan.nextInt();
		int arr[]=new int[elaman];
		System.out.println("eleman de�erlerinizi giriniz: ");
		
		for (int index = 0; index < arr.length; index++) {
			
			arr[index]=scan.nextInt();
		}
		ters(elaman,arr);
		elaman+=elaman;
		
	}
	public static int[] ters(int x,int dizi[]) {
	x=x-1;
	System.out.println(Arrays.toString(dizi));
	for(int eleman : dizi) {
		System.out.println(eleman);
	}
	

		
		return dizi;
		
	}

}
