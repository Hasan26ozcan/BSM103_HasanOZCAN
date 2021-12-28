import java.util.Scanner;

public class ortalamakendikendinedeneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("notunuzu giriniz: ");
		int sayi =0;
		int toplam =0;
		int not =scan.nextInt();
		while(not !=-1) {
			toplam=toplam+not;
			sayi++;
			System.out.println("iþlem devamý için not giriniz giriceðiz not bittiyse -1 e basýnýz: ");
			not=scan.nextInt();
			
			
		}
		double ortalama =(double) toplam/sayi;
		if (sayi !=0) {
			System.out.println("girdiðiniz deðerlerin ortlamasý"+ortalama);
			System.out.println("Girdiðiniz deðerlerin toplamý"+toplam);
			
		}
		else {
			
			System.out.println("sistemi baþlatamadýnýz çünkü hiç not girmemiþsiniz -1 bir not deðildir ");
		}

	}

}
