package algoritmasýnavýnaçalýþma;

import java.util.Scanner;

public class pascalücgeniyapma {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("yükseklik deðerinizi giriniz: ");
	int sayi1=scan.nextInt();
	int[][] triangle=new int[sayi1][];
	for (int row = 0; row < triangle.length; row++) {
		triangle[row]=new int[row+1];
		triangle[row][0]=1;
		triangle[row][row]=1;
		for (int column = 1; column < row; column++) {
			triangle[row][column]=triangle[row-1][column]+triangle[row-1][column-1];
		}
	} 
	for (int ekran = 0; ekran < triangle.length; ekran++) {
		for (int ekran2 = 0; ekran2 < triangle[ekran].length; ekran2++) {
			System.out.print(triangle[ekran][ekran2]);
			System.out.println();
		}
		System.out.println();
	}
	
	
	}

}
