import java.util.Scanner;

public class ifelseartt�rmadeneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("bir say� giriniz: ");
	    int sayi ;
	    sayi =scan.nextInt();
	    if(sayi >100) {
	    	System.out.println("girdi�iniz say�: "+sayi);
	    	sayi-=100;
	    	System.out.println("bi say� daha giriniz: ");
	    	sayi=scan.nextInt();
	    	if(sayi<100) {
	    		
	    		System.out.println("girdi�iniz say� 100 den k���k ve de�eri"+sayi);
	    	}
	    		else {
	    			
	    			System.out.println("Girdi�iniz de�er : "+sayi);
	    		}
	    	}
	    	
	    	
	    	
	    }
	    
		

	}


