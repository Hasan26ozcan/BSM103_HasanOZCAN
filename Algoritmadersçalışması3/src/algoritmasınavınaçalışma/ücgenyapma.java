package algoritmas�nav�na�al��ma;

public class �cgenyapma {
public static void main(String[] args) {
	for (int row = 1; row < 6; row++) {
		for (int column = 0; column < row; column++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int de�er = 1; de�er < 6; de�er++) {
		for (int index = 0; index < 6+(de�er*-1); index++) {
			System.out.print("*");
		}
		for (int de�er1 = 0; de�er1 < de�er-1; de�er1++) {
			System.out.print(" ");
		}
		for (int de�er2 = 0; de�er2 < de�er-1; de�er2++) {
			System.out.print(" ");
		}
		for (int saya� = 0; saya� < 6+(de�er*-1); saya�++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	
	
	
	
	
}
}
