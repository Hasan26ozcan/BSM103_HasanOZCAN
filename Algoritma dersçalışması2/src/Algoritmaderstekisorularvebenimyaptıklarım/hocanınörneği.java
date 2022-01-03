package algoritmasorularý1ödev;

import java.util.Arrays;

public class hocanýnörneði {

	public static void main(String[] args) {
	int[] arr=new int[4];	
	int x=0;
	x=x+1;
	mysfet(x,arr);
	System.out.println(x+"                         "+Arrays.toString(arr));
	x+=x;
	mysfet(x,arr);
	System.out.println(x+"                         "+Arrays.toString(arr));
	System.out.println("---------------------------------------------------------------------------");
	for(int eleman: arr) {
		System.out.println(eleman);
	}
	
	
	
	}

	public static void mysfet(int deðer,int[] arrey) {
	deðer=deðer+1;
	arrey[deðer]=arrey[deðer]+1;
	System.out.println(deðer+"                         "+Arrays.toString(arrey));
	}
}
