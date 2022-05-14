import java.util.Scanner;
import java.util.Stack;

public class PalindromStack {
	public static void main(String[] args) {
		System.out.println("bir parametre giriniz: ");
		Scanner scan=new Scanner(System.in);
		String write=scan.next();
		Stack<Character> stck1=new Stack<>();
		int uzunluðu= write.length();
		for (int i = 0; i < uzunluðu; i++) {
			char a= write.charAt(i);
			stck1.push(a);
		}
		String reverse="";
		for (int i = 0; i < uzunluðu; i++) {
			reverse+=stck1.pop();
		}
		if(write.equals(reverse)) {
			System.out.println("polindromdur");
		}
		else {
			System.out.println("polindrom deðildir");
		}
	}

}
