 import java.util.Scanner;

public class ifelsenot {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz: ");
		int not =scan.nextInt();
		if(not>=90) {
			System.out.println("Dersten ge�tiniz notunuz AA");
			
		}
		else if(not >80) {
			System.out.println("Dersten ge�tiniz notunuz AB");
		}
		else if (not == 50){
			System.out.println("Dersi ucunden ge�tin bir daha olmas�n");
			
		
			
		}
		else {
			System.out.println("Dersten kadl�n�z seneye tekrar almak zorundas�n�z");
			System.out.println("ve ayn� zamanda dersten kald�n�z g.o");
			
		}

	}

}
