import java.util.Scanner;

public class wh�ledenemeortalamabulmadenemeone {

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
         System.out.println("girilen notlar�n not otalamas�: "+ ortalama);
         System.out.println("girilen notlar�n notlar toplam�: "+ toplam);
         
         /*burdaki olay ise �ok daha g�zel while d�ng�s� i�ine yazd���m�z i�in
          * imput daha iyi oluyor ��nk� notlar�n hepsini kendimiz ayarl�yoruz 
          * bu saede daha rahat anl�yoruz d�ng� her tekrarlad���nda bize soruyor 
          * 
          * 
          */
	}

}
