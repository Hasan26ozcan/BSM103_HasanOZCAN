package algoritmasorular�1�dev;

import java.util.Scanner;

public class par�al�polindrom {
	public static final int N=6;
	public static void main(String[] args) {
			for (int line = N; line >=1; line--) {
				for (int j = 1; j <= N+(-1*line); j++) {
					System.out.print(" ");
				}
				System.out.print(line);
				for (int de�er = 1; de�er <= 2*line-1; de�er++) {
					System.out.print(" ");
				}
				System.out.println(line);
			}
	for (int de�er = 6; de�er >= 1; de�er--) {
		for (int i = 0; i < de�er; i++) {
			System.out.print("+");
		}
		System.out.println(de�er);
	}		
		for (int i = 1; i <= 6; i++) {
			for (int de�er = 1; de�er < i; de�er++) {
				System.out.print(" ");
			}
			System.out.println(i);
		}	
			
		for (int index = 6; index > 0; index--) {
			for (int de�er = 0; de�er < 6+(index*-1); de�er++) {
				System.out.print("*");
			}	
			System.out.println(index);
		}
			for (int sayi = 1; sayi <= 6; sayi++) {
				for (int i = 0; i < 6+(sayi*-1); i++) {
					System.out.print("+");
				}
				System.out.println(sayi);
			}
		for (int de�er = 6; de�er >=1; de�er--) {
			for (int sayi = 1; sayi < de�er; sayi++) {
				System.out.print("-");
			}
			System.out.println(de�er);
		}
		for (int inde = 1; inde <= 6; inde++) {
			for (int sayi1 = 1; sayi1 < inde; sayi1++) {
				System.out.print("+");
			}
			System.out.println(inde);
		}	
		for (int  a= 0; a <2; a++) {
			
		
		for (int de�er = 6; de�er >= 1; de�er--) {
			for (int i = 0; i < de�er; i++) {
				System.out.print(" ");
			}
			
			for (int saya� = 0; saya� <= 6+(de�er*-1); saya�++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		}	
	}	
}