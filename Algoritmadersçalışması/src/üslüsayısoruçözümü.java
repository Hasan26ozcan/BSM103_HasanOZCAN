import java.util.Scanner;

public class �sl�say�soru��z�m� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir say� giriniz: ");
		int a=scan.nextInt();
		System.out.println("Bir say� daha giriniz:");
		int b =scan.nextInt();
		int sonuc =1;
		for(int i=1;i<=b;i++) {
			
	    sonuc =sonuc*a;
		}
      System.out.println("cevab�: "+sonuc);
	}

}
