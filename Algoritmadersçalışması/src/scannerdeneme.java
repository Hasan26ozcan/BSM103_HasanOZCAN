import java.util.Scanner;

public class scannerdeneme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir not giriniz: ");
		int a =scan.nextInt();
		System.out.println("Bir not daha giriniz: ");
		int b =scan.nextInt();
		
	    if(a>=70) {
	    	if(b>50)
	    		System.out.println("S�navda ge�tiniz: ");
	    	else 
	    		System.out.println("S�navdan kald�n�z: ");
	    	
	    	
	    	
	    }
	    else 
	    	System.out.println("S�navdan kald�n�z : ");

	}

}
