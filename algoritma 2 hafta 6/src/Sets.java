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
		//TreeSet alfabetik s�raya g�re s�ralar
		//HashSet normal s�ralar kafas�na g�re yani
		
		
		
		//setlerde index yok bunu �uval gibi d���nebilir hepsi var ama hepsinden bir tane var
		// ama hi� birinin bir s�ras� falan yok
		
		sets.add("masa");
		sets.add("kalem");
		sets.add("bilgisayar");
		sets.add("defter");
		// a��a��daki gibi olmuyor yani burada g�z�kt��� gibi setlerde index yok
//		sets.add(3,"dolap");
		sets.add("dolap");
		sets.add("masa");
		sets.add("kalem");
		// ayn� �eyden bir tane daha olmuyor
		System.out.println(sets);
		System.out.println(sets.size());
	//	System.out.println(sets.contains(list));
	//	System.out.println(list.contains(sets));
		System.out.println(sets.contains("dolap"));
		
		//sets.clear();
		System.out.println(sets);
		sets.addAll(list);//i�inde ayn�lar� oldu�u i�in ekleme yapm�yor
		System.out.println(sets);
		list.addAll(sets);//list hepsini ekliyor hi� bakmadan
		System.out.println(list);
		System.out.println(list.get(2));
		
	}

}
