import java.util.Scanner;

public class geçtikaldý1ve2deneme {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("geçip geçmediðiniz belirticek deðerleri buraya giriniz: ");
		
		//önce deðiþkenlerimizi yazalým
		int gecen =0;
		int kalan =0;	
		int sayac = 1;
		int sonuc =scan.nextInt();
		
		while(sayac<=10) {
			System.out.println("sonucu gir (1=geçti,2=kaldý)");
			sonuc=scan.nextInt();
			
			if(sonuc==1) {
				
				gecen =gecen +1;
			}
			else {
					kalan = kalan + 1;
				}
			sayac++;
			}//while döngüsü burda bitiyor//
			System.out.println("geçen: "+gecen+"  kalan"+kalan);
			
			if(gecen>8) {
				System.out.println("Tebrikler baþarýlýsýnýz");
				
				
			}
			else {
				
				System.out.println("Baþarýlý deðilsiniz");
			}
		}
	}


