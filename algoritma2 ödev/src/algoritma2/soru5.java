package algoritma2;

public class sorubeþ {

	public static void main(String[] args) {
		writeBinary(14);
		
	}
	public static void writeBinary(int n) {
		int a=0;
		if (n<0) {
			System.out.println("hata");
		}
		if(n >=2) {
			System.out.println("deðer");
			writeBinary(n/2); 
			//en baþta buradan geçiyor en sonr 1 deyken kalaný ekrana yazdýrýyor 
			// sonr a3 e geri dönüyor un kalanýný alýyor sonra 7 nin ondan sonra 14 ðn kalanýný ekrana yazdýrýyor
			
		}
		System.out.println("deðer sýralamasý:  "+ n%2);
		//System.out.print(n%2);
	}

}
