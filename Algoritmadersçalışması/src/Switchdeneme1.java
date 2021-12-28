import java.util.Scanner;

public class Switchdeneme1 {

	public static void main(String[] args) {
		int  nottoplam=0;
		int notsayisi=0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int f=0;
		Scanner scan=new Scanner (System.in);
		System.out.println("notunuzu giriniz: ");
		int not=scan.nextInt();
		
		while(not>=0) {
			switch(not) {
			case 10:
			a++;
			break;
			case 9:
			a++;
			break;
			case 8:
			b++;
			break;
			case 7:
			c++;
			break;
			case 6:
			d++;
			break;
			default :
			f++;
			break; 
			
			
			
			}
			nottoplam=nottoplam+not;
			
			notsayisi++;
			System.out.println("not girmeye devam ediniz:");
			not =scan.nextInt();
		}
		double ortalama=(double) nottoplam/notsayisi;
		System.out.println("girilen notlarýn not ortalamasý: "+ortalama);
		System.out.println("girilen notlarýn notlar toplamý: "+nottoplam );
		System.out.println("kaç sayý girmiþiz:"+notsayisi);
		System.out.println("A : "+a);
		System.out.println("B: "+b);
		System.out.println("c: "+c);
		System.out.println("D: "+d);
		System.out.println("F: "+f);
		// switch tek bir deðiþkenin farklý koþullarýný deðerlendiriyor olmamýz gerekiyor
		
		
		
		

	}

}
