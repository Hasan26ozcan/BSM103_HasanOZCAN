package uygulumahafta5;

import java.awt.Container;
import java.util.*;

public class sortexample {
	public static void main(String[] args) {
		//tipini s�yl�yoruz <> i�ine tipini yaz�yoruz yani objemizi
		
		ArrayList<String> words =new ArrayList<>();
		words.add("KALEM");
		words.add("bilgisayar");
		words.add("bartin");
		words.add("kitap");
		
		System.out.println("s�ralanmadan �nce: "+words );
		System.out.println(words.get(0));
		System.out.println(words.set(0,"kalem"));
		// set ile de�i�tirme i�lemini yap�yoruz get ile �a��rma i�lemini yap�yoruz: 
		System.out.println("1. de�i�tirmeden sonra");
		System.out.println(words);
		System.out.println("2. de�i�tirmeden sonra ");
		Collections.sort(words);// a dan z ye do�ru s�ralama yapt�
		// alfabeye g�re s�ralama i�lemini yerine getiren i�lem budur
		//ama biz burda b�y�k harf ile yaazarsak �nceli�imiz b�y�k harfe do�ru kay�yor
		System.out.println(words);
		
		
		
	}

}
