import java.util.Scanner;

public class ifelsearttýrmadeneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("bir sayý giriniz: ");
	    int sayi ;
	    sayi =scan.nextInt();
	    if(sayi >100) {
	    	System.out.println("girdiðiniz sayý: "+sayi);
	    	sayi-=100;
	    	System.out.println("bi sayý daha giriniz: ");
	    	sayi=scan.nextInt();
	    	if(sayi<100) {
	    		
	    		System.out.println("girdiðiniz sayý 100 den küçük ve deðeri"+sayi);
	    	}
	    		else {
	    			
	    			System.out.println("Girdiðiniz deðer : "+sayi);
	    		}
	    	}
	    	
	    	
	    	
	    }
	    
		

	}


