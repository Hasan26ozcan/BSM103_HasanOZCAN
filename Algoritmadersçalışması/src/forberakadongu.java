import java.util.Scanner;

public class forberakadongu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayý girinz: ");
		
		int a=scan.nextInt();
		
		for(int b =1;1<=a;a--) {
			
			b =b*a;
			System.out.println("sonuc: "+ b);
		}
    
System.out.println("sonuc" + a);

    
	}
}
	/*eger bu sorudaki for düngüsünü baþka bir iþelmele bulmak istiyorsak yani while döngüsüyle 
	 * bulmak istiyorsa bunu alt tarfataki while döngüsüyle yapýlmaýþ halde bulabilir
	 * 
	 * 
	 * 
	 * for döngüsü ve while döngüsü neden ayný kodda çalýþmýyor çözülmesi 
	 * gereken bir sorun
	 */


