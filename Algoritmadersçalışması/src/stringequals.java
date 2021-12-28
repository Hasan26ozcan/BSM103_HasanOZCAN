import java.util.Scanner;

public class stringequals {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		
		if (a.equals(b)) {
			System.out.println("eþittir");
		}
		else {
			System.out.println("eþitdeðil");
		}

		/* equals == atamasýndan farklý olarak içindeki deðerleri 
		 * kýyaslýyor string deðerlerini
		 */
	}

}
