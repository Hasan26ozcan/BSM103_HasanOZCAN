package algoritmasýnavýnaçalýþma;

public class ücgenyapma {
public static void main(String[] args) {
	for (int row = 1; row < 6; row++) {
		for (int column = 0; column < row; column++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int deðer = 1; deðer < 6; deðer++) {
		for (int index = 0; index < 6+(deðer*-1); index++) {
			System.out.print("*");
		}
		for (int deðer1 = 0; deðer1 < deðer-1; deðer1++) {
			System.out.print(" ");
		}
		for (int deðer2 = 0; deðer2 < deðer-1; deðer2++) {
			System.out.print(" ");
		}
		for (int sayaç = 0; sayaç < 6+(deðer*-1); sayaç++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	
	
	
	
	
}
}
