import java.util.Scanner;

public class fionaccisoruçözme {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("girdiðinz sayý o sayýya kadarki fibonacciyi hesaplar: ");
		int fibonaccisayisi=scan.nextInt();
		int toplam=1;
		int sayi=1;
		int j=1;		
		for(int i=1;i<fibonaccisayisi;i++) {
			toplam=toplam+sayi;
			sayi=sayi+1;
			
			
		}
System.out.println("girdiðiniz deðerin fibonacci sayýsýý deðeri: "+toplam);
	}

}
