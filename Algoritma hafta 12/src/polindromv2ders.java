import java.util.Scanner;

public class polindromv2ders {
	public static void main(String[] args) {
		System.out.println("String parametresini giriniz: ");
		Scanner scan=new Scanner(System.in);
		String write=scan.next();
		System.out.println(isPolindrome(write));
		
	}
	public static boolean isPolindrome(String text) {
		if(text == null) {
			return false;
		}
		int left=0;
		int rigth=text.length()-1;
		while(left < rigth) {
			if(text.charAt(rigth) != text.charAt(left)) {
			return false;
			}
			rigth--;
			left++;
		}
		
		
		return true;
	}
}
