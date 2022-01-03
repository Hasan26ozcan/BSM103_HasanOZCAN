package algoritmasorularý1ödev;

import java.util.Scanner;

public class parçalýpolindrom {
	public static final int N=6;
	public static void main(String[] args) {
			for (int line = N; line >=1; line--) {
				for (int j = 1; j <= N+(-1*line); j++) {
					System.out.print(" ");
				}
				System.out.print(line);
				for (int deðer = 1; deðer <= 2*line-1; deðer++) {
					System.out.print(" ");
				}
				System.out.println(line);
			}
	for (int deðer = 6; deðer >= 1; deðer--) {
		for (int i = 0; i < deðer; i++) {
			System.out.print("+");
		}
		System.out.println(deðer);
	}		
		for (int i = 1; i <= 6; i++) {
			for (int deðer = 1; deðer < i; deðer++) {
				System.out.print(" ");
			}
			System.out.println(i);
		}	
			
		for (int index = 6; index > 0; index--) {
			for (int deðer = 0; deðer < 6+(index*-1); deðer++) {
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
		for (int deðer = 6; deðer >=1; deðer--) {
			for (int sayi = 1; sayi < deðer; sayi++) {
				System.out.print("-");
			}
			System.out.println(deðer);
		}
		for (int inde = 1; inde <= 6; inde++) {
			for (int sayi1 = 1; sayi1 < inde; sayi1++) {
				System.out.print("+");
			}
			System.out.println(inde);
		}	
		for (int  a= 0; a <2; a++) {
			
		
		for (int deðer = 6; deðer >= 1; deðer--) {
			for (int i = 0; i < deðer; i++) {
				System.out.print(" ");
			}
			
			for (int sayaç = 0; sayaç <= 6+(deðer*-1); sayaç++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		}	
	}	
}