import java.util.Scanner;

public class üslüsayibulma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("hangi sayýnýn üssünü alýcaz: ");
		int taban =scan.nextInt();
		System.out.println("kaçýncý kuvvetini alýcaz: ");
		int üssü=scan.nextInt();
		int üssünsonucu=1;
		while(üssü !=0) {
			üssünsonucu = üssünsonucu*taban;
			
			üssü--;
			
		}

		System.out.println("sonuc: "+üssünsonucu);
	}

}
