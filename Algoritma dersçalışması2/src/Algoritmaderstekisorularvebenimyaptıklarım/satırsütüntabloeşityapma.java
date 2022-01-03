package algoritmasorularý1ödev;

import java.util.Iterator;

public class satýrsütüntabloeþityapma {

	public static void main(String[] args) {
		
	}


public static int[][] matrixadd(int[][] a,int[][] b){
	int rows=a.length;//satýr sayýsýný öðrenmek için yazýyoruz
	int column =0;
	if(rows>0) {
		column=a[0].length;// sütun sayýsýný öðrenmek için yazýyoruz
	}
	int[][] c=new int[rows][column];
	
	for (int satýr = 0; satýr < rows; satýr++) {
		for (int sutun = 0; sutun < column; sutun++) {
			c[satýr][sutun]=a[satýr][sutun]+b[satýr][sutun];  
		}
	}
			
	return c; 
}
}
