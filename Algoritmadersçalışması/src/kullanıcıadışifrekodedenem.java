import java.util.Scanner;

public class kullan�c�ad��ifrekodedenem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String kullanc�ad="Hasan";
				int parola=12345;
		System.out.println("Kullan�c� ad�:");
		String kul_ad�=scan.next();
		System.out.println("Parola: ");
		int par_ola=scan.nextInt();
		if(!(kullanc�ad.equals(kul_ad�))&&!(parola ==par_ola)) {
System.out.println("kullan�c� ad� ve parola yanl��");			
		}
		else if(!(kullanc�ad.equals(kul_ad�))&&(parola==par_ola)) {
			System.out.println("kullan�c� ad� yanl�� ");
		}
		else if((kullanc�ad.equals(kul_ad�))&&!(parola==par_ola)) {
			System.out.println("parola yanl��");
		}
		else if((kullanc�ad.equals(kul_ad�)) && (parola==par_ola)){
			System.out.println("giri� ba�ar�l�: ");
		}
		else {
			System.out.println("ge�ersiz i�lem");
		}
		
	}

}
