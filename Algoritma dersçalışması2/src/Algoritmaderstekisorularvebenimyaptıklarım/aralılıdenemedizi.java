package algoritmasorularý1ödev;


import java.util.*;

public class aralýlýdenemedizi {
	
	public static int enuzunaralýk(int arr2[]) {
    int a=1;
    int count=1;
    for ( int deðer = 0; deðer < arr2.length-1; deðer++) {
		if(arr2[deðer]<=arr2[deðer+1]) {
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
	System.out.println(enuzunaralýk(arr));
	}

}
