import java.util.Scanner;

public class forberakadongu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir say� girinz: ");
		
		int a=scan.nextInt();
		
		for(int b =1;1<=a;a--) {
			
			b =b*a;
			System.out.println("sonuc: "+ b);
		}
    
System.out.println("sonuc" + a);

    
	}
}
	/*eger bu sorudaki for d�ng�s�n� ba�ka bir i�elmele bulmak istiyorsak yani while d�ng�s�yle 
	 * bulmak istiyorsa bunu alt tarfataki while d�ng�s�yle yap�lma�� halde bulabilir
	 * 
	 * 
	 * 
	 * for d�ng�s� ve while d�ng�s� neden ayn� kodda �al��m�yor ��z�lmesi 
	 * gereken bir sorun
	 */


