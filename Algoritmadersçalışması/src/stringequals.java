import java.util.Scanner;

public class stringequals {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		
		if (a.equals(b)) {
			System.out.println("e�ittir");
		}
		else {
			System.out.println("e�itde�il");
		}

		/* equals == atamas�ndan farkl� olarak i�indeki de�erleri 
		 * k�yasl�yor string de�erlerini
		 */
	}

}
