import java.util.Scanner;

public class swicthdeneme2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);

		int toplambilet=199;
		int bilet;
		System.out.println("güncel bilet sayýsýný öðrenmek için 1 e týklayýnýz ");
		System.out.println("bilet satmak istiyorsanýz 2 ye týklayýnýz: ");
		System.out.println("bilet almak istiyorsanýz 3 e týklayýnýz:");
		System.out.println("iþlem yapmadan çýkmak için 4 e basýnýz: ");
		int girilendeðer=scan.nextInt();
		switch (girilendeðer) {
		case 1:
			System.out.println("güncel bilet sayýnýz: "+toplambilet);
			break;
		case 2:
			System.out.println("kaç tane bilet satmak istiyorsunuz");
			bilet=scan.nextInt();
			toplambilet=toplambilet-bilet;
			System.out.println("güncel bilet sayýnýz: "+toplambilet);
			break;
		case 3:
			System.out.println("ne kadar bilet almak istiyorsunuz: ");
			bilet=scan.nextInt();
			toplambilet=toplambilet-bilet;
			System.out.println("güncel kalan bilet sayýnýz: "+toplambilet);
			break;
		case 4:
			System.out.println("sistemden çýkýs yapýlýyor 1 dakika...");
			break;
		default:
			System.out.println("lütfen geçerli bir sayý giriniz giriceðiniz sayý 1 ve 4 arasý olmasý rica olunur");
			
			
		
		
		
		
		
		
		}
	}

}
