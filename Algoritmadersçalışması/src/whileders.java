import java.util.Scanner;

public class whileders {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

System.out.println("bir say� giriniz:");

int a=scan.nextInt();
int b=0;
while(a>=0) {
	
	b=a+b;
	a--;
	System.out.println("Bir say� giriniz: "+b);
}
	}

}
