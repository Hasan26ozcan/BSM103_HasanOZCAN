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
			System.out.println("i�lem devam� i�in not giriniz girice�iz not bittiyse -1 e bas�n�z: ");
			not=scan.nextInt();
			
			
		}
		double ortalama =(double) toplam/sayi;
		if (sayi !=0) {
			System.out.println("girdi�iniz de�erlerin ortlamas�"+ortalama);
			System.out.println("Girdi�iniz de�erlerin toplam�"+toplam);
			
		}
		else {
			
			System.out.println("sistemi ba�latamad�n�z ��nk� hi� not girmemi�siniz -1 bir not de�ildir ");
		}

	}

}
