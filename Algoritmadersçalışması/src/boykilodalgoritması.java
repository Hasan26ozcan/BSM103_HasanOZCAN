import java.util.Scanner;

public class boykilodalgoritmas� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("boyunuzu giriniz: ");
		int boy=scan.nextInt();
		System.out.println("kilonuzu giriniz: ");
		int kilo=scan.nextInt();
		
		boy=boy/2;
		double idealmisiniz= (double)boy/kilo;
		
		if(idealmisiniz<1) {
			System.out.println("uygun de�ilsiniz acil kilo vermelisin");
		}
		else if(idealmisiniz == 1) {
			System.out.println("evet ideal v�cuttas�n�z:");
		}
		else if(idealmisiniz>1) {
			System.out.println("acil kilo almal�s�n: ");
		}
		else {
			System.out.println("l�tfen boy ve kilo giriniz: ");
		}
	}

}
