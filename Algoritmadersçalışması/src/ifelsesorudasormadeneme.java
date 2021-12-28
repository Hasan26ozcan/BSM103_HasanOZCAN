import java.util.Scanner;

public class ifelsesorudasormadeneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("notunuzu giriniz:");
		int not=scan.nextInt();
		int devam;
		if(not>65) {
			System.out.println("dersten geçmek üzeresin vizeden geçtin:");
			System.out.println("final notunu yaz:");
			devam=scan.nextInt();
			if(devam>70) {
				System.out.println("Tebrikler bu dersi baþarýyla geçtiniz: ");
			}
			else {
				System.out.println("maalesef dersten kaldýnýz: ");
			}
		}

		else {
			System.out.println("bu dersten kaldýnýz geçmek için finallere aban ");
			System.out.println("final notunu yaz: ");
			devam=scan.nextInt();
			if(devam>70) {
				System.out.println("ucundanda olsa geçtin hll sana");
			}
			else {
				System.out.println("maalesef dersten kaldýnýz:");
			}
		}
	}

}
