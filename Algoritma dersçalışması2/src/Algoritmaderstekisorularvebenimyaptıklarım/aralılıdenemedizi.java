package algoritmasorular�1�dev;


import java.util.*;

public class aral�l�denemedizi {
	
	public static int enuzunaral�k(int arr2[]) {
    int a=1;
    int count=1;
    for ( int de�er = 0; de�er < arr2.length-1; de�er++) {
		if(arr2[de�er]<=arr2[de�er+1]) {
			count++;
		}
		else {
			count=1;
		}
	
	if(a<=count) {
		a=count;
	}
}
    return a;
	}
	

	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,4,3,2,4,5,6,1,3,4,5,2,1,2,3};
	System.out.println(enuzunaral�k(arr));
	}

}
