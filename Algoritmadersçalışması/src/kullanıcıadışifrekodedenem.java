import java.util.Scanner;

public class kullanýcýadýþifrekodedenem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String kullancýad="Hasan";
				int parola=12345;
		System.out.println("Kullanýcý adý:");
		String kul_adý=scan.next();
		System.out.println("Parola: ");
		int par_ola=scan.nextInt();
		if(!(kullancýad.equals(kul_adý))&&!(parola ==par_ola)) {
System.out.println("kullanýcý adý ve parola yanlýþ");			
		}
		else if(!(kullancýad.equals(kul_adý))&&(parola==par_ola)) {
			System.out.println("kullanýcý adý yanlýþ ");
		}
		else if((kullancýad.equals(kul_adý))&&!(parola==par_ola)) {
			System.out.println("parola yanlýþ");
		}
		else if((kullancýad.equals(kul_adý)) && (parola==par_ola)){
			System.out.println("giriþ baþarýlý: ");
		}
		else {
			System.out.println("geçersiz iþlem");
		}
		
	}

}
