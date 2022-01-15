package algoritmasýnavýnaçalýþma;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		int [] arr=new int[5];
	Random r=new Random();
	int deðer=0;
	int a=0;
	for (int i = 0; i < 5; i++) {
		deðer=r.nextInt(6)+1;
		if(deðer %2 !=0) {
			arr[i]=deðer;
			System.out.println(i+"  "+arr[i]);
				a++;	
		}
	}
//for (int ab = 0; ab < 5; ab++) {
	//System.out.println(arr[ab]);
	//dizi deðerine tek sayýlarý atadýk 
}	
	}

//}
