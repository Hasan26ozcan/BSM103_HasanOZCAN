package algoritmasorular�1�dev;

import java.util.Iterator;

public class sat�rs�t�ntabloe�ityapma {

	public static void main(String[] args) {
		
	}


public static int[][] matrixadd(int[][] a,int[][] b){
	int rows=a.length;//sat�r say�s�n� ��renmek i�in yaz�yoruz
	int column =0;
	if(rows>0) {
		column=a[0].length;// s�tun say�s�n� ��renmek i�in yaz�yoruz
	}
	int[][] c=new int[rows][column];
	
	for (int sat�r = 0; sat�r < rows; sat�r++) {
		for (int sutun = 0; sutun < column; sutun++) {
			c[sat�r][sutun]=a[sat�r][sutun]+b[sat�r][sutun];  
		}
	}
			
	return c; 
}
}
