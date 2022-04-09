import java.util.Scanner;
import java.util.Stack;

public class parenthessisMatching {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("iþleminizi giriniz: ");
		String iþlem=scan.next();
		boolean deðer=isMatching(iþlem);
		if(deðer) {
			System.out.println("dengelidir");
		}
		else {
			System.out.println("dengeli deðildir");
		}
		
		
		
	}		
		public static boolean isMatching(String iþlem) {
		Stack<Character> st=new Stack<>();
		for (int i = 0; i < iþlem.length(); i++) {
			char a=iþlem.charAt(i);
			if(a =='(') {
				st.push(a);
			}else if (a==')') { 
				if(st.size()>0) {
					st.pop();
				}
				else {
					return false;
				}
			}		
		}
		System.out.println(st);
		
		if(st.isEmpty()) {
			System.out.println("dengelidir");
			return true;
		}
		else {
			System.out.println("dengesizdir");
			return false;
		}
	}
}