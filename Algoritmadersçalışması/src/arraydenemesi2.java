import java.util.Scanner;

public class arraydenemesi2 {


	public static void main(String[] args) {
		double toplam=0;
		

		Scanner scan=new Scanner(System.in);
		System.out.println("bir de�er giriniz: ");
		int[] arry=new int[6];
		
		for(int i=0;i<arry.length;i++) {
			arry[i]=scan.nextInt();
			
			
		}
		/*for(int j=0;j<arry.length;j++) {
			System.out.println("arry de�eriniz yazd�r�n�z: "+arry[j]);
			
		}
		*/
		for(int p=0;p<arry.length;p++) {
			toplam+=arry[p];
		}
		System.out.println("ortalama de�eri bulmak i�ni yapmam�z gerekenler: "+toplam/arry.length);
		
			
			
			
			
			
			
			
		}
			
			
			
		

	}


