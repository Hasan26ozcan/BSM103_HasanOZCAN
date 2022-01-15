package algoritmasýnavýnaçalýþma;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class dizirakamlarýnenküçüðüenbüyüðünüverme {
//burda dizideki en küçük raký buldum
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int arr[]=new int[10];
	for(int index=0;index<10;index++) {
		arr[index]=scan.nextInt();
	}
	int max=arr[0];
	int min=arr[0];
	for (int sýra = 0; sýra < 9; sýra++) {
		if(arr[sýra+1]<min)
		min=arr[sýra+1];
	}
	System.out.println(min);
// burda ise dizideki en büyük rakamý buldum		
	for (int sayaç = 0; sayaç < 9; sayaç++) {
		if(max<arr[sayaç+1]) {
			max=arr[sayaç+1];
		}
	}
	System.out.println(max);
		
	
	
	
	}
	
	

}
