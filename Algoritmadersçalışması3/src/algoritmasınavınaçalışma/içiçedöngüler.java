package algoritmas�nav�na�al��ma;


public class i�i�ed�ng�ler {
public static final int N = 6;


	public static void main(String[] args) {
		for (int index = 6; index > 0; index--) {
			for (int de�er1 = 0; de�er1 < 6+(index*-1); de�er1++) {
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
