package algoritmas�nav�na�al��ma;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		int [] arr=new int[5];
	Random r=new Random();
	int de�er=0;
	int a=0;
	for (int i = 0; i < 5; i++) {
		de�er=r.nextInt(6)+1;
		if(de�er %2 !=0) {
			arr[i]=de�er;
			System.out.println(i+"  "+arr[i]);
				a++;	
		}
	}
//for (int ab = 0; ab < 5; ab++) {
	//System.out.println(arr[ab]);
	//dizi de�erine tek say�lar� atad�k 
}	
	}

//}
