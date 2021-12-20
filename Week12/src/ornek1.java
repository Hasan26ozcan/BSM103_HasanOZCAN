import java.util.Scanner;

public class algoritma1soru {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("kaç öðrencinin notu girilecek ?");
     int ogrencisayisi=scan.nextInt();
     
     System.out.println(ogrencisayisi+"tane öðrencininn notu girilecektir");
     for(int i=1;i<=ogrencisayisi;i++) {
    	 System.out.println(i+"öðrencinin vize notunu giriniz:");
    	 int vizenotu=scan.nextInt();
    	 System.out.println(i+"öðrencinin final notunu giriniz");
    	 int finalnotu=scan.nextInt();
    	 
    	 
    	 
    	 System.out.println("ogrencinin vize notu"+vizenotunuhesapma(vizenotu));
    	 System.out.println("öprencinin final notu"+finanotunuhesapla(finalnotu));
    	  
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
