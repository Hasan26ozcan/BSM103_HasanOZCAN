import java.util.Scanner;

public class algoritmasorular�4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String kelime=scan.nextLine();
		System.out.println("bu de�eri ka�a b�lelim: ");
		int b�lme=scan.nextInt();
		
		ekran(kelime,b�lme);
	}
	public static void ekran(String c�mle,int n) {
	int index=0;
	for (int i= 0; i < c�mle.length()/n; i++) {
	System.out.println(c�mle.substring(index,index+n));
		index=index+n;
		}
	System.out.println(c�mle.substring(index,c�mle.length()));
	}
	

		
	

}
