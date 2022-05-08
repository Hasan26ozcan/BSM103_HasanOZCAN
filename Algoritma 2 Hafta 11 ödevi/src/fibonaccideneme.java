import java.util.ArrayList;
import java.util.Scanner;

public class fibonaccideneme {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("kaçýncý sýradaki sayýyý öðrenmek istiyorsanýz o sayýyý giriniz: ");
		int sayi=scan.nextInt();
		System.out.println(fibonacciSeries(sayi));
	}
	public static ArrayList<Integer> fibonacciSeries(int numOfRows){
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(1);
		for (int i = 2; i < numOfRows; i++) {
		 	int sayi= list.get(i-1)+list.get(i-2);
		 	list.add(sayi);
		}
		return list;
	}

}
