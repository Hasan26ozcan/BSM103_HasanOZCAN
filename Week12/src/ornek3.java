import java.util.Scanner;

public class algoritmasorular2 {
	
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Eleman sayisi giriniz:");
		int elemansayisi=scan.nextInt();
		int dizi[] =new int[elemansayisi];
		for(int index=0;index<dizi.length;index++) {
			System.out.println("eleman sayýlarýný giriniz:");
			dizi[index] =scan.nextInt();
		}
		
		double ortalama=ortalama(dizi);
		System.out.println(ortalama);
		
      }

		
	
	public static double ortalama(int[] arr) {
	double ortalama=0.0;
	int total =0;
	for(int index=0;index<arr.length;index++) {
		total=total+arr[index];
	}
     ortalama=(double) total/arr.length;
		
return ortalama;
}
}