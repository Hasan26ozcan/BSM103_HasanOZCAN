package uygulumahafta5;

import java.awt.Container;
import java.util.*;

public class sortexample {
	public static void main(String[] args) {
		//tipini söylüyoruz <> içine tipini yazýyoruz yani objemizi
		
		ArrayList<String> words =new ArrayList<>();
		words.add("KALEM");
		words.add("bilgisayar");
		words.add("bartin");
		words.add("kitap");
		
		System.out.println("sýralanmadan önce: "+words );
		System.out.println(words.get(0));
		System.out.println(words.set(0,"kalem"));
		// set ile deðiþtirme iþlemini yapýyoruz get ile çaðýrma iþlemini yapýyoruz: 
		System.out.println("1. deðiþtirmeden sonra");
		System.out.println(words);
		System.out.println("2. deðiþtirmeden sonra ");
		Collections.sort(words);// a dan z ye doðru sýralama yaptý
		// alfabeye göre sýralama iþlemini yerine getiren iþlem budur
		//ama biz burda büyük harf ile yaazarsak önceliðimiz büyük harfe doðru kayýyor
		System.out.println(words);
		
		
		
	}

}
