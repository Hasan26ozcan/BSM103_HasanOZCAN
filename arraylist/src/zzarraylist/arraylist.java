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
	//mesela burada oldu�u gibi biz 2. indeksi sildi�imiz i�in bize hata veriyor
	System.out.println(groups.indexOf("name"));// mesela burada ise ka��nc� indeksteyse o indeks numaras�n� ekrana yazd�r�yor
	System.out.println("groups 0. index: "+groups.get(0));
	System.out.println("gorups 1. index: "+groups.get(1));
	System.out.println("groups 2.index: "+groups.get(2));
	System.out.println("group uzunlu�umu ��renmek i�in: "+groups.size());
	
	
	for (int i = 0; i < groups.size();i++) {
		System.out.println( 1+i+": "+groups.get(i));
	}
	//bu sayedede string de�erimii eklemeyi ba�ar�yoruz
	System.out.println("yeni string de�erlerimizi girelim: ");
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
