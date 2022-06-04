package hafta15uygulama;

import java.util.Scanner;
import java.util.stream.IntStream;

public class sumprimesverimliliðinebakýlýyor {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("kaç tane asal sayý toplamak istiyorsunuz");
		int limit=scan.nextInt();
		int sum= sumprimes(limit);
		System.out.println(sum);
	}
	//    Time: 0.0
	//    496165411
	
	public static int sumprimes(int limit) {
		if(limit<0) {
			return 0;
		}else {
			long start =System.currentTimeMillis();
			int sum=IntStream.iterate(1,n->n+2).filter(sumprimesverimliliðinebakýlýyor:: isprime2).limit(limit-1).sum()+2;
			//------------------------------------------------------------------------------------------------------------------------------
			// burdaki kodlarda üsteeki kod alttaki kodddan daha iyi bizde ayný süreyi gösterselerde ayný iþlemi üsteki kod daha iyi yapmaktadýr
			//-------------------------------------------------------------------------------------------------------------------------------
			//int sum=IntStream.iterate(1,n->n+1).filter(sumprimesverimliliðinebakýlýyor:: isprime2).limit(limit).sum();
			double time=(System.currentTimeMillis()-start)/1000;
			System.out.println("Time: "+time);
			return sum;
		}
	}
	//   Time: 7.0
	//   496165411
	public static int sumprime(int limit) {
		if(limit<0) {
			return 0;
		}else {
			long start =System.currentTimeMillis();
			int sum=IntStream.iterate(1,n->n+2 ).filter(sumprimesverimliliðinebakýlýyor:: isprime).limit(limit-1).sum()+2;
			double time=(System.currentTimeMillis()-start)/1000;
			System.out.println("Time: "+time);
			return sum;
		}
	}
	public static boolean isprime(int prime) {
		
		return IntStream.range(1, prime+1).filter(x -> prime%x==0).count()==2;
	}
	public static boolean isprime2(int prime) {
		if( prime ==1) {
			return false;
		}else {
			int sýnýr=(int)Math.sqrt(prime);
			// burda count ==1 yapmamýzýndaki neden sayýnýn kenisine gitmiyoruz
			// ama biz orda 1 e bölüyoruz yani eðer 1 ise asal eðer 1 i geçer ise asal sayý deðildir
			return IntStream.range(1, sýnýr+1).filter(x -> prime%x ==0).count()==1;
			
		}
	}

}
