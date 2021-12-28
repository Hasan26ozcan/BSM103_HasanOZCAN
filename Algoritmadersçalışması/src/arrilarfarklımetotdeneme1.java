import java.util.Scanner;

public class arrilarfarklýmetotdeneme1 {

	public static void main(String[] args) {
	int[] arr=new int[10];
	int toplam=0;
	int ortalama;
	System.out.println("arr deðerlerini griniz: ");
	Scanner scan=new Scanner (System.in);
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
		
		
	}
	for(int j=0;j<arr.length;j++) {
		toplam=toplam+arr[j];
		
		
		
	}
	ortalama=toplam/arr.length;
	System.out.println("ortalama: "+ortalama);
	

	}

}
