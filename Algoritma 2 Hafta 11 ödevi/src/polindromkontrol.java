import java.util.Scanner;
import java.util.Stack;

public class polindromkontrol {
	public static boolean validPalindrome(String str) {
		Stack<Character> stck1=new Stack<>();
		Stack<Character> stck2=new Stack<>();
		Stack<Character> stck3=new Stack<>();
		int uzunlu�u = str.length();
		for (int i = 0; i < uzunlu�u; i++) {
	 		char a= str.charAt(i);
	 		stck1.push(a);
		}
		for (int i = 0; i < uzunlu�u; i++) {
	 		char a= str.charAt(i);
	 		stck2.push(a);
		}
		while(!stck2.isEmpty()) {
			char odeger= stck2.pop();
			stck3.push(odeger);
		}
		System.out.println(stck1);
		System.out.println(stck3);
		
		for (int i = 0; i < stck1.size(); i++) {
			if(!stck1.get(i).equals(stck3.get(i))){
				return false;
			}
		}
		return true;
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("yaz�n�z� giriniz ve polindrom olup olmad���n� ��renelim");
		String write=scan.nextLine();
		System.out.println(validPalindrome(write));
	}

}
