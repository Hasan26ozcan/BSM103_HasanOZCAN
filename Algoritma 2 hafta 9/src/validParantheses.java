import java.util.Scanner;
import java.util.Stack;

public class validParantheses {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("iþleminizi giriniz: ");
		String write=scan.next();
		System.out.println(validParantheses(write));
		
	}
	public static boolean validParantheses(String str) {
		Stack<Character> s=new Stack<>();
		
		for(char x:str.toCharArray()) {
			if(x =='{'|| x=='('||x=='[') {
			s.push(x);	
			}
			else if(!s.isEmpty() && (x=='}' &&  s.peek()=='{')||!s.isEmpty() && (x==']' &&  s.peek()=='[')||!s.isEmpty() && (x==')' &&  s.peek()=='(')) {
				s.pop();
			}
			else {
				return false;
			}
			
			
			
		
		// bu ikisi ayný þey
	/*	for (int i = 0; i < str.length(); i++) {
			char a= str.charAt(i);	
			}*/
		}
		
		
		
		
		return s.isEmpty();
				
	}

}
