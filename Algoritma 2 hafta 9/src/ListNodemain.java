
public class ListNodemain {
	public static void main(String[] args) {
		ListNode list=new ListNode();
		ListNode list1=new ListNode();
		list.data=3;
		list.next=new ListNode();
		list.next.data=7;
		list.next.next=new ListNode();
		list.next.next.data=12;
		list.next.next.next=null;
	//burada ise dikkat etmemiz gerek hoca daha göstermedi ama yaptým ama dikkat eklemek istedðimiz indeksi hem basa hemde sonradan 
		//tanýmlarken yanýnda aynýsý kullanýyoruz ve o yere bu verdiðimiz deðer geliyor
	//	list.next.next.next.next=new ListNode(789,list.next.next.next.next);
		System.out.println(list.data+" "+list.next.data+" "+list.next.next.data);
	//	System.out.println(list.next.next.next.next.data);

	}

}
