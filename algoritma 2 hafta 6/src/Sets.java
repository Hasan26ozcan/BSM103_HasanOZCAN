import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("masa");
		list.add("kalem");
		list.add("bilgisayar");
		list.add("defter");
		list.add(3,"dolap");		
		list.add("masa");
		list.add("kalem");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.size());
		
		
		
		
		Set<String> sets=new HashSet<String>();
		//TreeSet alfabetik sıraya göre sıralar
		//HashSet normal sıralar kafasına göre yani
		
		
		
		//setlerde index yok bunu çuval gibi düşünebilir hepsi var ama hepsinden bir tane var
		// ama hiç birinin bir sırası falan yok
		
		sets.add("masa");
		sets.add("kalem");
		sets.add("bilgisayar");
		sets.add("defter");
		// aşşağıdaki gibi olmuyor yani burada gözüktüğü gibi setlerde index yok
//		sets.add(3,"dolap");
		sets.add("dolap");
		sets.add("masa");
		sets.add("kalem");
		// aynı şeyden bir tane daha olmuyor
		System.out.println(sets);
		System.out.println(sets.size());
	//	System.out.println(sets.contains(list));
	//	System.out.println(list.contains(sets));
		System.out.println(sets.contains("dolap"));
		
		//sets.clear();
		System.out.println(sets);
		sets.addAll(list);//içinde aynıları olduğu için ekleme yapmıyor
		System.out.println(sets);
		list.addAll(sets);//list hepsini ekliyor hiç bakmadan
		System.out.println(list);
		System.out.println(list.get(2));
		
	}

}
