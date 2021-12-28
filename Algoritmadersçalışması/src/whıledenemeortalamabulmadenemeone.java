import java.util.Scanner;

public class whýledenemeortalamabulmadenemeone {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		int sayi = 1;
		
		
				double toplam = 0;
         while (sayi<=10) {
        	 
        	 System.out.println("notunuzu giriniz:");
        	 int not =scan.nextInt();
        	 toplam = not +toplam;
        	 sayi++;
        	 
        	 
         }
    	 
         double ortalama = toplam / 10;
         System.out.println("girilen notlarýn not otalamasý: "+ ortalama);
         System.out.println("girilen notlarýn notlar toplamý: "+ toplam);
         
         /*burdaki olay ise çok daha güzel while döngüsü içine yazdýðýmýz için
          * imput daha iyi oluyor çünkü notlarýn hepsini kendimiz ayarlýyoruz 
          * bu saede daha rahat anlýyoruz döngü her tekrarladýðýnda bize soruyor 
          * 
          * 
          */
	}

}
