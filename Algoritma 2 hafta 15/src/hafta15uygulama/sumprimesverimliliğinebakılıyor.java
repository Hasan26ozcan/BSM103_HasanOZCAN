package hafta15uygulama;

import java.util.Scanner;
import java.util.stream.IntStream;

public class sumprimesverimliliğinebakılıyor {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("kaç tane asal sayı toplamak istiyorsunuz");
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
			int sum=IntStream.iterate(1,n->n+2).filter(sumprimesverimliliğinebakılıyor:: isprime2).limit(limit-1).sum()+2;
			//------------------------------------------------------------------------------------------------------------------------------
			// burdaki kodlarda üsteeki kod alttaki kodddan daha iyi bizde aynı süreyi gösterselerde aynı işlemi üsteki kod daha iyi yapmaktadır
			//-------------------------------------------------------------------------------------------------------------------------------
			//int sum=IntStream.iterate(1,n->n+1).filter(sumprimesverimliliğinebakılıyor:: isprime2).limit(limit).sum();
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
			int sum=IntStream.iterate(1,n->n+2 ).filter(sumprimesverimliliğinebakılıyor:: isprime).limit(limit-1).sum()+2;
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
			int sınır=(int)Math.sqrt(prime);
			// burda count ==1 yapmamızındaki neden sayının kenisine gitmiyoruz
			// ama biz orda 1 e bölüyoruz yani eğer 1 ise asal eğer 1 i geçer ise asal sayı değildir
			return IntStream.range(1, sınır+1).filter(x -> prime%x ==0).count()==1;
			
		}
	}

}
