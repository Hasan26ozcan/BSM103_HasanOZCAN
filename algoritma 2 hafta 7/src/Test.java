import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
		int[] data= {2,4,6,7,4,10,23,4};
		Queue<Integer> de�er=new LinkedList<>();
		for (Integer integer : data) {
			de�er.add(integer);
		}
		System.out.println(removeAll(de�er, 4));
		
	}
	public static Queue<Integer> removeAll(Queue<Integer> q,int sayi) {
		int sizen=q.size();
		for(int i=0;i<sizen;i++) {
			int deger=q.remove();
			
			
			if(deger !=sayi) {
				q.add(deger);
			}
		}
		 
		
		
		
		
		
		
		
		
		
		
		
		return q;
	}

}
