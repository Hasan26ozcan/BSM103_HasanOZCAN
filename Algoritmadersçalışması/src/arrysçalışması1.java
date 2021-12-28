import java.util.Scanner;

public class arrysçalýþmasý1 {
public static void mead(int[] arr) {
	int total=0;
	int ortalama;
	for(int i=0;i<arr.length;i++) {
		total=total+arr[i];
		
	}
	System.out.println("sayýlarýn ortalamasý:  "+total/arr.length);
	System.out.println("sayýlarýn toplamý:   "+total);
	
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("arry deðerleini giriniz: ");
		int[] arr45 =new int[6] ;
		
		for(int j=0;j<arr45.length;j++) {
		 arr45[j] =scan.nextInt();
			
		}
		for(int a=0;a<arr45.length;a++) {
			System.out.println("arr: "+arr45[a]);
		}
		

		mead(arr45);
	}

}
