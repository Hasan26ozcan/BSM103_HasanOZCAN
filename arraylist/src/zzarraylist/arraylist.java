package zzarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	ArrayList<String> groups = new ArrayList<String>(6);
	groups.add("name");
	groups.add("username");
	groups.add("hasan");
	//groups.remove(2);
	//mesela burada olduðu gibi biz 2. indeksi sildiðimiz için bize hata veriyor
	System.out.println(groups.indexOf("name"));// mesela burada ise kaçýncý indeksteyse o indeks numarasýný ekrana yazdýrýyor
	System.out.println("groups 0. index: "+groups.get(0));
	System.out.println("gorups 1. index: "+groups.get(1));
	System.out.println("groups 2.index: "+groups.get(2));
	System.out.println("group uzunluðumu öðrenmek için: "+groups.size());
	
	
	for (int i = 0; i < groups.size();i++) {
		System.out.println( 1+i+": "+groups.get(i));
	}
	//bu sayedede string deðerimii eklemeyi baþarýyoruz
	System.out.println("yeni string deðerlerimizi girelim: ");
	for (int i = 0; i < groups.size(); i++) {
		String isim=scan.next();
		groups.set(i,isim );
	}
	for (int i = 0; i < groups.size(); i++) {
		System.out.println(groups.get(i));
	}
	for(String screan : groups) {
		System.out.println("elemanlar: "+screan);
	}
	}

}
