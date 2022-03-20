
public class stock {
	private String store;//maðaza
	private int totalProduct;//toplam ürün
	private int totalcost;//toplam maliyet
	
	
	public stock(String store) {
	if(store ==null) {
		throw new NullPointerException();
	}
	this.store=store;
	totalProduct=0;
	totalcost=0;
	}
	public int getprofit(int currentprice) {
		if(currentprice<0) {
			throw new IllegalArgumentException();
		}
		int marketvalue=totalProduct*currentprice;
		return marketvalue-totalcost;
	}
	public void purchase(int shares,int pricepershare) {
		if(shares<0 || pricepershare<0) {
			throw new IllegalArgumentException();
		}
		totalProduct+=shares;// hisse
		totalcost+=shares*pricepershare;
	}

}
