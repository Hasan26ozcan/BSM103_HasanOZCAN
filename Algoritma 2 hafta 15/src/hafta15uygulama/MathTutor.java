package hafta15uygulama;

import java.util.Random;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class MathTutor {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("bu i�lem ka� kere tekrarlan�cak: ");
		int say=scan.nextInt();
		giveproblems(scan, say, "*", (x,y) -> x*y );
		
		
	}
	public static void giveproblems(Scanner console,int numproblems,String text,IntBinaryOperator operator) {
		Random r=new Random();
		int counter =0;
		for (int i = 0; i < numproblems; i++) {
			int x=r.nextInt(12)+1;
			int y=r.nextInt(12)+1;
			System.out.println(x+" "+text+" "+y+" = ");
			int answer=operator.applyAsInt(x, y);
			int response=console.nextInt();
			if(response == answer) {
				System.out.println("do�ru");
				counter++;
			}else {
				System.out.println("yanl��t�r cevap: "+answer);
			}
		}
		System.out.println("do�ru cevap say�s�: "+counter);
		double note=counter*100/numproblems;
		System.out.println("notunuz: "+note);
	}

}
