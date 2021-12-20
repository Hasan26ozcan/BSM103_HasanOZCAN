import java.util.Scanner;

public class algoritmasorularý4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String kelime=scan.nextLine();
		System.out.println("bu deðeri kaça bölelim: ");
		int bölme=scan.nextInt();
		
		ekran(kelime,bölme);
	}
	public static void ekran(String cümle,int n) {
	int index=0;
	for (int i= 0; i < cümle.length()/n; i++) {
	System.out.println(cümle.substring(index,index+n));
		index=index+n;
		}
	System.out.println(cümle.substring(index,cümle.length()));
	}
	

		
	

}
