import java.util.Scanner;

public class �sl�sayibulma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("hangi say�n�n �ss�n� al�caz: ");
		int taban =scan.nextInt();
		System.out.println("ka��nc� kuvvetini al�caz: ");
		int �ss�=scan.nextInt();
		int �ss�nsonucu=1;
		while(�ss� !=0) {
			�ss�nsonucu = �ss�nsonucu*taban;
			
			�ss�--;
			
		}

		System.out.println("sonuc: "+�ss�nsonucu);
	}

}
