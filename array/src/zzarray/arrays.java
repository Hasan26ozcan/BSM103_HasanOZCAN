package zzarray;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
	//diziler konusuna hoþgeldiniz
		Scanner scan=new Scanner(System.in);
		System.out.println("herhangi bir deðer giriniz: ");
		int a =scan.nextInt();
		int[] arr= {1,2,3,4,5};
		for (int eleman : arr) {
			System.out.println(eleman);
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("þimdi arr2 deðerleriniiz giriniz: ");
		int[] arr2 =new int[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr2));
		
		for(int eleman :arr2) {
			System.out.println(eleman);
		}
		arr2[0]=5;
		arr2[3]=789;
		System.out.println(Arrays.toString(arr2));		
		mean(arr);
		
	}
	public static void mean (int[] arr) {
		int a=0;
		for (int eleman : arr) {
			
			 a= eleman+a;
			 
		}
		int ortalama=0;
		ortalama =a/arr.length;
		System.out.println("ortalama deðerimizin sonucu: "+ortalama);
	}
}
