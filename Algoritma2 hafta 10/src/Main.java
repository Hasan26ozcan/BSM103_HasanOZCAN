
public class Main {
	public static void main(String[] args) {
		LinkedIntList list=new LinkedIntList();
		list.add(6);
		list.add(7);
		list.add(67);
		list.add(56);
		list.add(24);
		list.screanwrite();
	//	System.out.println(list);
		int sayi= list.indexOf(0);
		System.out.println(sayi);
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		list.indexadd(2, 123);
		System.out.println(list);
		list.indexadd(0, 678);
		System.out.println(list);
		System.out.println(list.basdeger());
		System.out.println(list.size());
	}

}
