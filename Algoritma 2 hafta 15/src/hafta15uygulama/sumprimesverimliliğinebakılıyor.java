package hafta15uygulama;

import java.util.Scanner;
import java.util.stream.IntStream;

public class sumprimesverimlili�inebak�l�yor {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("ka� tane asal say� toplamak istiyorsunuz");
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
			int sum=IntStream.iterate(1,n->n+2).filter(sumprimesverimlili�inebak�l�yor:: isprime2).limit(limit-1).sum()+2;
			//------------------------------------------------------------------------------------------------------------------------------
			// burdaki kodlarda �steeki kod alttaki kodddan daha iyi bizde ayn� s�reyi g�sterselerde ayn� i�lemi �steki kod daha iyi yapmaktad�r
			//-------------------------------------------------------------------------------------------------------------------------------
			//int sum=IntStream.iterate(1,n->n+1).filter(sumprimesverimlili�inebak�l�yor:: isprime2).limit(limit).sum();
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
			int sum=IntStream.iterate(1,n->n+2 ).filter(sumprimesverimlili�inebak�l�yor:: isprime).limit(limit-1).sum()+2;
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
			int s�n�r=(int)Math.sqrt(prime);
			// burda count ==1 yapmam�z�ndaki neden say�n�n kenisine gitmiyoruz
			// ama biz orda 1 e b�l�yoruz yani e�er 1 ise asal e�er 1 i ge�er ise asal say� de�ildir
			return IntStream.range(1, s�n�r+1).filter(x -> prime%x ==0).count()==1;
			
		}
	}

}
