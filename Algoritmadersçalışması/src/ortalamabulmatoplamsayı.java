import java.util.Scanner;

public class ortalamabulmatoplamsayý {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("not giriniz:");
		int not = scan.nextInt();
		int sayi =0;
		int toplam = 0;
		while (not !=-1) {
		toplam =toplam+not;
				sayi++;
			System.out.println("iþlemden çýkmak için -1 devam etmek için not giriniz: ");
			 not =scan.nextInt();
		}
		if(sayi !=0) {
			double ortalama = (double) toplam/sayi;
			System.out.println("toplam notlarýn toplamý: "+toplam);
			System.out.println("ortalama"+ortalama);
		}
		else {
			
			System.out.println("iþleminiz baþlamadan bitmiþtir");
		}
		
	}//**bu soruda istediðimiz kadar sayý girebiliriz biz -1 yazasýya kadar devam edicek
	

}
