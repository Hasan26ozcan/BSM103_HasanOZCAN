package algoritmas�nav�na�al��ma;

import java.util.Scanner;

public class dizibirle�tirme {
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ilk de�er aral���n�z� giriniz: ");
	int de�er1=scan.nextInt();    
	System.out.println("ikinci dizi boyutunuzu belirleyiniz: ");
	int de�er2=scan.nextInt();
	int[] arr1=new int[de�er1];
	int[] arr2=new int[de�er2];
	int[] arr3=new int[de�er1+de�er2];
	
	for (int i = 0; i < arr1.length; i++) {
		arr1[i]=scan.nextInt();
		
	}
	for (int i = 0; i < arr2.length; i++) {
		arr2[i]=scan.nextInt();
	}
	for (int ij = 0; ij < arr1.length; ij++) {
		arr3[ij]=arr1[ij];
	}
	for (int ijk = 0; ijk < arr2.length; ijk++) {
		arr3[arr1.length+ijk]=arr2[ijk];
	}
	for(int eleman : arr3) {
		System.out.println(eleman);
	}
}
}
