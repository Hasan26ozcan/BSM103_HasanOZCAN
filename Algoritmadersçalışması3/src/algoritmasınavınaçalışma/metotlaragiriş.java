package algoritmasýnavýnaçalýþma;

import java.util.Scanner;

public class metotlaragiriþ {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ögrenci sayýsýný giriniz: ");
	int ögrencisayisi=scan.nextInt();
	int[] ortalama=new int[ögrencisayisi];
	for(int index=0;index<ögrencisayisi;index++) {
		System.out.println("vize notunuzu giriniz: ");
		int vizenotu=scan.nextInt();
		System.out.println("final notunuzu giriniz: ");
		int finalnotu=scan.nextInt();
		System.out.println(	vizenotuhesapla(vizenotu));
		vizenotuhesapla(vizenotu);
		finalnotuhesapla(finalnotu);
		System.out.println(finalnotuhesapla(finalnotu));
		
		ortalama[index-1]=ortalama(vizenotu,finalnotu);
		}

	}
	public static int ortalama(int vizenotu,int finalnotu) {
		int viznot=(int)vizenotuhesapla(vizenotu);
		int finnot=(int)finalnotuhesapla(finalnotu);
		return viznot+finnot/2;
	}
	
	
	
	public static double vizenotuhesapla(int a) {
		double not=0;
		if(a>=80) {
			not=a*1.10;
		}
		else if(a>=60) {
			not=a*1.05;
		}
		else if(not >100) {
			return 100;
		}
		return not;
	}
	public static double finalnotuhesapla(int b) {
		double not=0.0;
		if(b>=70) {
			not=b*1.10;
		}
		else if(b>=50) {
			not=b*1.05;
		}
		else if(not >100) {
			return 100;
		}
		return not;
	}
	
}
