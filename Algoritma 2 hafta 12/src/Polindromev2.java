import java.util.Scanner;

public class Polindromev2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("String bir parametre giriniz: ");
		String write1=scan.next();
		System.out.println(isPolindrome(write1));
	}
	public static boolean isPolindrome(String text) {
	if(text.length()%2==1) {
			System.out.println(text);
		int uzunlu�u= (text.length()-1)/2;
		String reverse="";
		String reverse3="";
		for (int i = 0; i < uzunlu�u; i++) {
			reverse3+=text.charAt(i);
		}
		System.out.println(reverse3);
		for (int i = uzunlu�u+1; i <text.length(); i++) {
			reverse+= text.charAt(i);
		}
		System.out.println(reverse);
		String reverse2="";
		int uzunluk = reverse.length();
		for (int i = reverse.length()-1; i >=0; i--) {
			reverse2+=reverse.charAt(i);
		}
		System.out.println(reverse2);
		if(reverse3.equals(reverse2)) {
			return true;
		}else {
			return false;
		}
	}
		if(text.length()%2==0) {
		int uzunlu�u= (text.length()-1)/2;
		System.out.println(text);
		String reverse="";
		String reverse3="";
		for (int i = 0; i <= uzunlu�u; i++) {
			reverse3+=text.charAt(i);
		}
		System.out.println(reverse3);
		for (int i = uzunlu�u+1; i <text.length(); i++) {
			reverse+= text.charAt(i);
		}
		System.out.println(reverse);
		String reverse2="";
		int uzunluk = reverse.length();
		for (int i = reverse.length()-1; i >=0; i--) {
			reverse2+=reverse.charAt(i);
		}
		System.out.println(reverse2);
		if(reverse3.equals(reverse2)) {
			return true;
		}else {
			return false;
		}
	}
		
		return false;
	}
}

