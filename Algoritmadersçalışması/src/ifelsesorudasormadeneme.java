import java.util.Scanner;

public class ifelsesorudasormadeneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("notunuzu giriniz:");
		int not=scan.nextInt();
		int devam;
		if(not>65) {
			System.out.println("dersten ge�mek �zeresin vizeden ge�tin:");
			System.out.println("final notunu yaz:");
			devam=scan.nextInt();
			if(devam>70) {
				System.out.println("Tebrikler bu dersi ba�ar�yla ge�tiniz: ");
			}
			else {
				System.out.println("maalesef dersten kald�n�z: ");
			}
		}

		else {
			System.out.println("bu dersten kald�n�z ge�mek i�in finallere aban ");
			System.out.println("final notunu yaz: ");
			devam=scan.nextInt();
			if(devam>70) {
				System.out.println("ucundanda olsa ge�tin hll sana");
			}
			else {
				System.out.println("maalesef dersten kald�n�z:");
			}
		}
	}

}
