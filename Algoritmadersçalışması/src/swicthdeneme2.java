import java.util.Scanner;

public class swicthdeneme2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);

		int toplambilet=199;
		int bilet;
		System.out.println("g�ncel bilet say�s�n� ��renmek i�in 1 e t�klay�n�z ");
		System.out.println("bilet satmak istiyorsan�z 2 ye t�klay�n�z: ");
		System.out.println("bilet almak istiyorsan�z 3 e t�klay�n�z:");
		System.out.println("i�lem yapmadan ��kmak i�in 4 e bas�n�z: ");
		int girilende�er=scan.nextInt();
		switch (girilende�er) {
		case 1:
			System.out.println("g�ncel bilet say�n�z: "+toplambilet);
			break;
		case 2:
			System.out.println("ka� tane bilet satmak istiyorsunuz");
			bilet=scan.nextInt();
			toplambilet=toplambilet-bilet;
			System.out.println("g�ncel bilet say�n�z: "+toplambilet);
			break;
		case 3:
			System.out.println("ne kadar bilet almak istiyorsunuz: ");
			bilet=scan.nextInt();
			toplambilet=toplambilet-bilet;
			System.out.println("g�ncel kalan bilet say�n�z: "+toplambilet);
			break;
		case 4:
			System.out.println("sistemden ��k�s yap�l�yor 1 dakika...");
			break;
		default:
			System.out.println("l�tfen ge�erli bir say� giriniz girice�iniz say� 1 ve 4 aras� olmas� rica olunur");
			
			
		
		
		
		
		
		
		}
	}

}
