package hafta15uygulama;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumPrimes {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int counter=0;
/*		IntStream stream=IntStream.iterate(10, i->i+5).filter(n->n%10==0).limit(5);
		stream.forEach(System.out::println);*/
		System.out.println(" ka� tane asal say� giriceksiniz: ");
		int count=scan.nextInt();
		int sum= sumPrimes(count);
		System.out.println(sum);
		
		//   Time: 18.707
		//   496165411
		
	}
/*	public static boolean sumPrimes(int n) {
		for (int i = 2; i < n; i++) {
			if(n%i ==0) {
				return false;
			}
			else {
				return true;
			}
		}
		return true;
	}
*/	
	public static int sumPrimes(int count) {
		if(count<0) {
			return 0;
		}else {
			long start=System.currentTimeMillis();
			int sum=IntStream.iterate(1, n->n+1).filter(SumPrimes::isPrime).limit(count).sum();
					// itarete s�n�rs�z
					//range s�n�rl�
			double elapsed=(System.currentTimeMillis()-start)/1000.0;
			System.out.println();
			System.out.println("Time: "+elapsed);
			return sum;		
		}
		
	}
	public static boolean isPrime(int n) {
		// 1 2 3 4 5 
		return IntStream.range(1, n+1).filter(x -> n%x==0).count()==2;
		// asal say�lar�n �zelli�inde 1 ve kendisi biz burda bunlar� yaparken 5 kendisi ve 1 harici tam b�l�nen varsa 
		//o say�da countun 1 artamas�n� sa�l�yacak i�te o zamanda asal say� olmad��� orataya ��kar yani 
		// bizim for d�ng�s�yle yapt���m�z i�i burda filter metodu yap�yor 
	}

}
