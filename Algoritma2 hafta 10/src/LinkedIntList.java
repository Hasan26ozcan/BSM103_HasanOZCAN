
public class LinkedIntList {
	private ListNode front;// en öndeki elemnaý göstericek baþý yani
	
	public LinkedIntList() {
		front=null;
	}
	public int size() {
		int counter=0;
		ListNode current=front;
		while(current != null) {
			current=current.next;
			counter++;
		}
		return counter;
	}
	
	
	
	public void indexadd(int index,int value) {
		if(index ==0) {
			ListNode a=new ListNode(value);
			ListNode current=front;
			a.next=current;
			front=a;
		}
		else {
			ListNode sayi=nodeAt(index);
			ListNode sayac=sayi.next;
			ListNode deger=new ListNode(value);
			sayi.next=deger;
			deger.next=sayac;
			
		}
	}
	public int basdeger() {
		ListNode current= front;
		return current.data;
	}
	
	
	
	public void remove(int index) {
		if(index ==0) {
			ListNode current =front;
			front=current.next;

			
		}else {
		ListNode sayin=nodeAt(index);
		ListNode deger= sayin.next.next;
		
		sayin.next=null;
		
		sayin.next=deger;
		}
		
		
		
	}
	
	public ListNode nodeAt(int index) {
		ListNode current=front;
		for (int i = 0; i < index-1; i++) {
			current=current.next;
			if(current== null) {
				System.out.println("verilen index yoktur iþlem hatalýdýr");
				throw new IllegalAccessError();
			}
		}
		return current;
	}
	
	
	
	public int indexOf(int value) {
		int index =0;
		ListNode current=front;
		while(current !=null) {
			
			if(current.data == value) {
				return index;
			}
			index++;
			current=current.next;
		}
		return -1;
		
	}
	
	
	public String toString() {
		if(front== null) {
			return "[]";
		}else {
			String result="[" +front.data;
			ListNode current=front.next;
			while(current !=null) {
				 result+=" , "+current.data;
				current=current.next;
			}
			result+="]";
			return result;
		}
	}
	public void screanwrite() {
		ListNode list1=front;
		System.out.print("[ ");
		while(list1 != null) {
			System.out.print(list1.data+" ");
			list1=list1.next;
			
		}
		System.out.print("]");
		System.out.println();
	}
	
	
	public void add(int value) {
		ListNode sayici=new ListNode(value);
		if(front == null) {
//			front=new ListNode(value);
			front=sayici;
		}
		else {
			ListNode sayi=front;
			while(sayi.next !=null) {
				sayi=sayi.next;
			}
//			sayi.next=new ListNode(value,sayi.next);
			sayi.next =sayici;
			sayici.next=null;
			
		}
	}

}
