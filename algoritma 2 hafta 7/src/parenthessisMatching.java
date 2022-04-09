import java.util.Scanner;
import java.util.Stack;

public class parenthessisMatching {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("i�leminizi giriniz: ");
		String i�lem=scan.next();
		boolean de�er=isMatching(i�lem);
		if(de�er) {
			System.out.println("dengelidir");
		}
		else {
			System.out.println("dengeli de�ildir");
		}
		
		
		
	}		
		public static boolean isMatching(String i�lem) {
		Stack<Character> st=new Stack<>();
		for (int i = 0; i < i�lem.length(); i++) {
			char a=i�lem.charAt(i);
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