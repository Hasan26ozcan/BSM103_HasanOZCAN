import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		String[] data= {"java","php","python","C","c++"};
		Queue<String> q=new LinkedList<String>();
		ArrayList<String> list=new ArrayList<>();
		// baðlý liste kuyruk gibi ilke giren en baþta çýkýyor;
		
		//Stack push pop
		//Queue add remove size isEmpty
		for (String string : data) {
			list.add(string);
		}
		
		for (String string : data) {
			q.add(string);
		}
		System.out.println("queue= "+q);
		System.out.println("peek: "+q.peek());
		int temp=q.size();
		for (int i = 0; i <temp ; i++) {
			System.out.println(q.remove());
		}
		System.out.println(q);
		q.addAll(list);
		System.out.println(q);
	}
}