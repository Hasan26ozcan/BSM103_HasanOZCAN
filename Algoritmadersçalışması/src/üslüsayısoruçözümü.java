import java.util.Scanner;

public class üslüsayýsoruçözümü {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayý giriniz: ");
		int a=scan.nextInt();
		System.out.println("Bir sayý daha giriniz:");
		int b =scan.nextInt();
		int sonuc =1;
		for(int i=1;i<=b;i++) {
			
	    sonuc =sonuc*a;
		}
      System.out.println("cevabý: "+sonuc);
	}

}
