package algoritmasýnavýnaçalýþma;


public class içiçedöngüler {
public static final int N = 6;


	public static void main(String[] args) {
		for (int index = 6; index > 0; index--) {
			for (int deðer1 = 0; deðer1 < 6+(index*-1); deðer1++) {
				System.out.print(" ");
			}
			System.out.print(index);
			
			for (int j = 0; j < 2*index-1; j++) {
				System.out.print(" ");
			}
			System.out.println(index);
							
			
		}
		
	}

}
