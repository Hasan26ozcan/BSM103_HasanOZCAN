import java.util.Scanner;

public class while�sl�sayidenmesi {

	public static void main(String[] args) {
      
		Scanner scan =new Scanner(System.in);
		System.out.println("Hangi say�n�n kuvvetini al�caz: ");
		int a =scan.nextInt();
		System.out.println("Kuvveti ka� al�caz: ");
		int b = scan.nextInt();
		int i=1;
		int arade�er=1;
		while(i<=b) {
			arade�er =arade�er*a;
			i +=1;
			
			
		}
		System.out.println("Elde etti�imiz de�er budur: "+arade�er);
	}

}
/*bu i�lemlerde oldu�u gibi while d�ng�s� d�g� halinde for d�ng�s�yle ayn� i�leri yapabi�mektedir
 *  ve bu i�leri daha rahat yapmam�z� sa�lamaktad�r
 */

