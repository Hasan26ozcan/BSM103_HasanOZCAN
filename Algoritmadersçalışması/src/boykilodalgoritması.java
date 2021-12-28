import java.util.Scanner;

public class boykilodalgoritmasý {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("boyunuzu giriniz: ");
		int boy=scan.nextInt();
		System.out.println("kilonuzu giriniz: ");
		int kilo=scan.nextInt();
		
		boy=boy/2;
		double idealmisiniz= (double)boy/kilo;
		
		if(idealmisiniz<1) {
			System.out.println("uygun deðilsiniz acil kilo vermelisin");
		}
		else if(idealmisiniz == 1) {
			System.out.println("evet ideal vücuttasýnýz:");
		}
		else if(idealmisiniz>1) {
			System.out.println("acil kilo almalýsýn: ");
		}
		else {
			System.out.println("lütfen boy ve kilo giriniz: ");
		}
	}

}
