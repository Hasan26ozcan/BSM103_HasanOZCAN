import java.util.Scanner;

public class ortalamabulmatoplamsayifor {
  public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz: ");
		
		int not =scan.nextInt();
		
		int toplam =0;
		
		int sayi = 0;
		
		for(;not !=-1; sayi++) {
			
			toplam =toplam +not;
			
		System.out.println("i�lemden ��kmak i�in -1 devam etmek i�in not giriniz : ");
		
			not=scan.nextInt();
			
		
		}
		
	   double ortalama = (double)toplam /sayi;
	   
      if ( sayi !=0) {
    	  
			System.out.println("girdi�iniz say�lar�n ortalamas�: "+ortalama);
			System.out.println("girdi�iniz say�lar�n toplamlar�: "+toplam);
		}
		else {
			
			System.out.println("i�leminiz ba�lamadan bitmi�tir H.O");
			
		}
	} // e�er while d�g�s� i�erisinde mesela : sayi==1 gibi bir de�er varsa bu de�er sadece 1 i�in �al���r*/
  //yani demek istedi�im != i�areti oldu�u zaman o say� hari� b�t�n say�alrda �al��maktad�r demek istiyorum*/
  // ve for d�ng�s� i�inde tan�mlanan bir�eyi �tekiler g�remiyor ve alg�layam�yor
  
  
  
  
  //----------------------int ekl komutunu silersek komut �al���cak-------------------
  

}
