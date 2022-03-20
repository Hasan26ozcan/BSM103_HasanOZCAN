import java.util.*;

public class stockmain {
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("maðaza ismi: ");
	String store1=scan.next();
	stock stock1=new stock(store1);
	int profit1=makePurschases(stock1, scan);
	System.out.println(profit1);//ikinci kez yaparsak eðer böyle yapabiliriz ve ekrana yazdýrmasýný daha kolay bir þekilde bulabiliriz
	System.out.println("ikinci maðaza ismi: ");
	String store2=scan.next();
	stock stock2=new stock(store2);
	int profit2=makePurschases(stock2, scan);
	
	if(profit1>profit2) {
		System.out.println("ilk maðaza daha yararlýdýr");
	}else if(profit1 >=profit2) {
		System.out.println("iki maðzada eþittir istediðininde laýþveriþ yapbilirsin");
	}else {
		System.out.println("ikinci maðaza daha yarlýdýr ");
	}
	
    }
   public static int makePurschases(stock currenStock ,Scanner scan) {
	   System.out.println("kaç kez satýn alma yaptýn");
	   int numpurchases=scan.nextInt();
	   for (int i = 1; i <= numpurchases ; i++) {
		System.out.println("kaç tane aldýn ? birim fiyatý nedir?");
		int numshares =scan.nextInt();
		int pricepershare=scan.nextInt();
		currenStock.purchase(numshares, pricepershare);
	}
	   System.out.println("güncel birim fiyatý nedir");
	   int currentprice=scan.nextInt();
	   int profit=currenStock.getprofit(currentprice);
	   System.out.println("net kazanç kayýp: "+profit+"TL");
	   return profit;
   }
}
