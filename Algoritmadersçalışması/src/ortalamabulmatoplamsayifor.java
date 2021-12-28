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
			
		System.out.println("iþlemden çýkmak için -1 devam etmek için not giriniz : ");
		
			not=scan.nextInt();
			
		
		}
		
	   double ortalama = (double)toplam /sayi;
	   
      if ( sayi !=0) {
    	  
			System.out.println("girdiðiniz sayýlarýn ortalamasý: "+ortalama);
			System.out.println("girdiðiniz sayýlarýn toplamlarý: "+toplam);
		}
		else {
			
			System.out.println("iþleminiz baþlamadan bitmiþtir H.O");
			
		}
	} // eðer while dögüsü içerisinde mesela : sayi==1 gibi bir deðer varsa bu deðer sadece 1 için çalýþýr*/
  //yani demek istediðim != iþareti olduðu zaman o sayý hariç bütün sayýalrda çalýþmaktadýr demek istiyorum*/
  // ve for döngüsü içinde tanýmlanan birþeyi ötekiler göremiyor ve algýlayamýyor
  
  
  
  
  //----------------------int ekl komutunu silersek komut çalýþýcak-------------------
  

}
