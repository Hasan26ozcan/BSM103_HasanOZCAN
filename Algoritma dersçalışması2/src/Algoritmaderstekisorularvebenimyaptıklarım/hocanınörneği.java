package algoritmasorular�1�dev;

import java.util.Arrays;

public class hocan�n�rne�i {

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

	public static void mysfet(int de�er,int[] arrey) {
	de�er=de�er+1;
	arrey[de�er]=arrey[de�er]+1;
	System.out.println(de�er+"                         "+Arrays.toString(arrey));
	}
}
