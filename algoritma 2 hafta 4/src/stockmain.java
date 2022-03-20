import java.util.*;

public class stockmain {
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ma�aza ismi: ");
	String store1=scan.next();
	stock stock1=new stock(store1);
	int profit1=makePurschases(stock1, scan);
	System.out.println(profit1);//ikinci kez yaparsak e�er b�yle yapabiliriz ve ekrana yazd�rmas�n� daha kolay bir �ekilde bulabiliriz
	System.out.println("ikinci ma�aza ismi: ");
	String store2=scan.next();
	stock stock2=new stock(store2);
	int profit2=makePurschases(stock2, scan);
	
	if(profit1>profit2) {
		System.out.println("ilk ma�aza daha yararl�d�r");
	}else if(profit1 >=profit2) {
		System.out.println("iki ma�zada e�ittir istedi�ininde la��veri� yapbilirsin");
	}else {
		System.out.println("ikinci ma�aza daha yarl�d�r ");
	}
	
    }
   public static int makePurschases(stock currenStock ,Scanner scan) {
	   System.out.println("ka� kez sat�n alma yapt�n");
	   int numpurchases=scan.nextInt();
	   for (int i = 1; i <= numpurchases ; i++) {
		System.out.println("ka� tane ald�n ? birim fiyat� nedir?");
		int numshares =scan.nextInt();
		int pricepershare=scan.nextInt();
		currenStock.purchase(numshares, pricepershare);
	}
	   System.out.println("g�ncel birim fiyat� nedir");
	   int currentprice=scan.nextInt();
	   int profit=currenStock.getprofit(currentprice);
	   System.out.println("net kazan� kay�p: "+profit+"TL");
	   return profit;
   }
}
