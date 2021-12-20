import java.util.Arrays;
import java.util.Scanner;

public class algoritmasorular1birazgeli�tirilmi�i {
	
	public static double ortalama(double a,double b) {
		System.out.println(a+"    "+b);
		//burda kavramam�z gereknen �nemli �eylerden bir tanesi
		//ortalamada ba��na doubl esay�s� yaz�yorsak e�er dizi terimdende double 
		//say�s� olmal�d�r e�er bu iki �eyin t�r uyu�mazl��� olursa kod �al��maz
		a=vizenotunuhesapma(a);
		b=finanotunuhesapla(b);
		System.out.println(a+"             "+b);
		a=a*40/100;
		b=b*60/100;
		double toplama=a+b;
		return toplama;
	}
	public static void main(String[] args) {
		System.out.println("ka� ��rencinin de�erini giriceksiniz");
     Scanner scan=new Scanner(System.in);
     int ogrencisayisi=scan.nextInt();
     double[] ortalama =new double[ogrencisayisi];
     for(int i=1;i<=ogrencisayisi;i++) {
    	 System.out.println(i+"vize notunu giriniz:");
    	 int vizenotu=scan.nextInt();
    	 System.out.println(i+"final notunu giriniz:");
    	 int finalnotu=scan.nextInt();
    	 
     ortalama[i-1]=ortalama(vizenotu,finalnotu);    	 
    //kod sadece s�raya bakar ismine bakmaz 
     System.out.println("ortalama de�er: "+ortalama[i-1]);
     System.out.println(Arrays.toString(ortalama));
     //b�t�n dizi de�erlerini ekrana yazd�rmak i�in b�yle bir�ey kullan�yoruz
     //mrtotlar i�erisinde metotlar �a��r�p sonucu bulabiliyoruz i�te olay burda anla��l�yor
     }

	}
	
	public static double vizenotunuhesapma(double vizenotu) {
		double not=0.0;
		if(vizenotu>80) {
		not=vizenotu*1.10;
		
		}
		else if(vizenotu>=60) {
		not=vizenotu*1.05;
		}
		if(not>100) {
			not=100;
		}
		
		return not;
	}
	public static double finanotunuhesapla(double finalnotu) {
		double not=0.0;
		if(finalnotu>70) {
			not=finalnotu*1.10;
			
		}
		else if(finalnotu>40) {
			not=finalnotu*1.05;
		}
		if(not>100) {
			not=100; 
		}
		
		return not; 
	}

}
