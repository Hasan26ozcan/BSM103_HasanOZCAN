import java.util.Scanner;

public class whiledenemetwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayý giriniz: ");
		 int a =scan.nextInt();
		 int b = 0;
		 while (a>=1) {
			 
			 b = b+a%10;
			 
			a= a/10;
					 
			 
		 }
		System.out.println("Girdiðiniz deðer: "+b);
	}

}
