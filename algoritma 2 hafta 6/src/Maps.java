import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maps {
	public static void main(String[] args) {
		//treemap ve hashmap olarak
		Map<Integer, String> citys=new TreeMap<>();
		//<key - value>
		
// Integer set gibi d���nebiliriz
		//burda set ve listlerde oldu�u gibi add metodu yoktur
		//burda add yerine put metodu vard�r
		citys.put(06,  "Ankara");
		citys.put(34, "�stanbul");
		citys.put(35, "�zmir");
		citys.put(26, "Eski�ehir");
		citys.put(6,  "Antakya");
//burda en son yapt���m�z �eyi eskisinin yerine koyuyor ve onu kullan�yor
		citys.get(26).charAt(6);
		System.out.println(citys.get(26));
		System.out.println(citys);
		System.out.println("indeksler keyleri: "+citys.keySet());
		System.out.println(citys.values());
		Map<Integer, Set<String>> citys2=new HashMap<>(); 
		citys2.put(34, new TreeSet<String>());
		System.out.println(citys2);
		citys2.get(34).add("istanbul");
		citys2.get(34).add("kad�k�y");
		citys2.get(34).add("be�ikta�");
		citys2.get(34).add("taksim");
		System.out.println(citys2);
		citys2.put(6, new TreeSet<String>());
		citys2.get(6).add("eminonu");
		citys2.get(6).add("cankaya");
		System.out.println(citys2);
		
		
	}
	

}
