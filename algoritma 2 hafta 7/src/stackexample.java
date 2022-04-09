import java.util.Stack;

public class stackexample {
	public static void main(String[] args) {
		//stack bir kovaya benzetilebilr
		//LIFO
		//Queue FIFO sýralamasý mevcuttur
		String data[] = {"java","deðersiz","money","deðer","yýllar"};
		Stack<String> st=new Stack<String>();
		
		for(String sta:data) {
			st.push(sta);
		}
		System.out.println(st);
		int temp=st.size();
		for (int i = 0; i < temp; i++) {
			System.out.println(st.pop());
		}
		System.out.println(st);
		for (int i = 0; i < data.length; i++) {
			st.push(data[i]);
		}
		System.out.println(st);
		System.out.println("Stack= "+st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println("Stack: "+st);
		System.out.println(st.size());
		System.out.println(st.push("yýllar"));
		yaz();
		System.out.println("program bitti");
		System.out.println("___________________________________________");
		while(!st.isEmpty()) {
			System.out.println(st.pop());//o deðeri getiriyor ama sonrasýnda siliyor
		}
		System.out.println("Stack: "+st);
		System.out.println("-------------------------------------------");
		Stack<String> s=new Stack<String>();
		s.push("ahmet");
		s.push("mehmet");
		s.push("deðersiz");
		s.push("ahmet");
		s.push("deðer");
		
		System.out.println(s.peek());
		s.push("kamil");
		System.out.println(s.peek());
	}
	public static void yaz() {
		System.out.println("fonk1");
	}
}
