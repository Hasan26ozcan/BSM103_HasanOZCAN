import java.util.Scanner;

public class whileüslüsayidenmesi {

	public static void main(String[] args) {
      
		Scanner scan =new Scanner(System.in);
		System.out.println("Hangi sayýnýn kuvvetini alýcaz: ");
		int a =scan.nextInt();
		System.out.println("Kuvveti kaç alýcaz: ");
		int b = scan.nextInt();
		int i=1;
		int aradeðer=1;
		while(i<=b) {
			aradeðer =aradeðer*a;
			i +=1;
			
			
		}
		System.out.println("Elde ettiðimiz deðer budur: "+aradeðer);
	}

}
/*bu iþlemlerde olduðu gibi while döngüsü dögü halinde for düngüsüyle ayný iþleri yapabiþmektedir
 *  ve bu iþleri daha rahat yapmamýzý saðlamaktadýr
 */

