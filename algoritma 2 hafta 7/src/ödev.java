import java.util.ArrayList;
import java.util.Stack;

public class ödev {

	public static void main(String[] args) {
		int data[] = {1,3,5,7,8,9};
		Stack<Integer> stck=new Stack<>();
		Stack<Integer> stck1=new Stack<>();
		ArrayList<Integer> list=new ArrayList<>();
		for (Integer integer : data) {
			stck.push(integer);
		}
		
		System.out.println(stck);
		list.addAll(stck);
		System.out.println(stck);
		System.out.println(list);
		stck1=staks(stck);
		System.out.println(stck1);
		stck=stacksa(stck1);
		System.out.println(stck);
		
		stck.addAll(list);
		
	}
	public static Stack<Integer> staks(Stack<Integer> a){
		Stack<Integer> stc=new Stack<>();
		int lesiz=a.size();
		for (int i = 0; i < lesiz; i++) {
			int deðeri=a.pop();
			
			stc.push(deðeri);
			stc.push(deðeri);
			
		}
		return stc;
	}
	public static Stack<Integer> stacksa(Stack<Integer> abc){
		Stack<Integer> str=new Stack<>();
		int sizle=abc.size();
		for (int i = 0; i < sizle; i++) {
			int sayii= abc.pop();
			str.push(sayii);
		}
		
		
		return str;
	}

}
