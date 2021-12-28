 import java.util.Scanner;

public class ifelsenot {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz: ");
		int not =scan.nextInt();
		if(not>=90) {
			System.out.println("Dersten geçtiniz notunuz AA");
			
		}
		else if(not >80) {
			System.out.println("Dersten geçtiniz notunuz AB");
		}
		else if (not == 50){
			System.out.println("Dersi ucunden geçtin bir daha olmasýn");
			
		
			
		}
		else {
			System.out.println("Dersten kadlýnýz seneye tekrar almak zorundasýnýz");
			System.out.println("ve ayný zamanda dersten kaldýnýz g.o");
			
		}

	}

}
