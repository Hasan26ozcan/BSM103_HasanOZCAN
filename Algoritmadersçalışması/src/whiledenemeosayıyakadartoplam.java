import java.util.Scanner;

public class whiledenemeosay�yakadartoplam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir say� giriniz: ");
		
	 
		int i =0;
		int toplam = 0;
		int b=scan.nextInt();
		
		for (;b<=0;b++ ) {
			
			// double sonuc =(b+1)*b/2;
			toplam =toplam + b; //toplam+=i
			
		}
		
		System.out.println("Sonu�: "+toplam);
	
	}
	

}
