import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PolindromQueue {
	public static void main(String[] args) {
		System.out.println("String de�erinizi giriniz: ");
		Scanner scan=new Scanner(System.in);
		String write=scan.next();
		Queue<Character> que=new LinkedList<>();
		for (int i =write.length()-1 ; i>=0; i--) {
			 char a=write.charAt(i);
			que.add(a);
		}
		String reverse="";
		int uzunlu�u= que.size();
		for (int i = 0; i < uzunlu�u ; i++) {
			reverse+= que.remove();
		}
		if(write.equals(reverse)) {
			System.out.println("polindromdur");
		}
		else {
			System.out.println("polindrom de�ildir");
		}
	}

}
