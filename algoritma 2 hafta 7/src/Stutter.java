import java.util.LinkedList;
import java.util.Queue;

public class Stutter {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
		int [] data= {2,4,5,6,7,8};
		for (int i : data) {
			q.add(i);
		}
		
		System.out.println(q);
		stutter(q);
		
	}
	public static void stutter(Queue<Integer> q) {
		int sizle=q.size();
		for(int a=0;a<sizle;a++) {
			int abc=q.remove();
			q.add(abc);
			q.add(abc);
			
		}
		System.out.println(q);
		
	}

}
