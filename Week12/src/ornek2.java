import java.util.Arrays;
import java.util.Scanner;

public class algoritmasorular1birazgeliþtirilmiþi {
	
	public static double ortalama(double a,double b) {
		System.out.println(a+"    "+b);
		//burda kavramamýz gereknen önemli þeylerden bir tanesi
		//ortalamada baþýna doubl esayýsý yazýyorsak eðer dizi terimdende double 
		//sayýsý olmalýdýr eðer bu iki þeyin tür uyuþmazlýðý olursa kod çalýþmaz
		a=vizenotunuhesapma(a);
		b=finanotunuhesapla(b);
		System.out.println(a+"             "+b);
		a=a*40/100;
		b=b*60/100;
		double toplama=a+b;
		return toplama;
	}
	public static void main(String[] args) {
		System.out.println("kaç öðrencinin deðerini giriceksiniz");
     Scanner scan=new Scanner(System.in);
     int ogrencisayisi=scan.nextInt();
     double[] ortalama =new double[ogrencisayisi];
     for(int i=1;i<=ogrencisayisi;i++) {
    	 System.out.println(i+"vize notunu giriniz:");
    	 int vizenotu=scan.nextInt();
    	 System.out.println(i+"final notunu giriniz:");
    	 int finalnotu=scan.nextInt();
    	 
     ortalama[i-1]=ortalama(vizenotu,finalnotu);    	 
    //kod sadece sýraya bakar ismine bakmaz 
     System.out.println("ortalama deðer: "+ortalama[i-1]);
     System.out.println(Arrays.toString(ortalama));
     //bütün dizi deðerlerini ekrana yazdýrmak için böyle birþey kullanýyoruz
     //mrtotlar içerisinde metotlar çaðýrýp sonucu bulabiliyoruz iþte olay burda anlaþýlýyor
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
