package uygulumahafta5;

import java.util.ArrayList;

public class StarAddd {
	public static void main(String[] args) {
		ArrayList<String> words =new ArrayList<>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartin");
		words.add("kitap");
		System.out.println("d�ng� �ncesinde");
		System.out.println("liste uzunlu�u: "+words.size());
		System.out.println(words);
		for(int index=0;index<words.size();index+=2) {
			//elemanlar�n aras�nda y�ld�z koyuyor neden 2 �etli artt�rd���m�z indexi takip et
			words.add(index,"* ");
		}

/*		for(int de�er=words.size()-1;de�er>=0;de�er--) {
			words.add(de�er, "?");
		}
		*/
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("g�ncel liste: "+words);
		System.out.println("yeni liste uzunlu�u: "+words.size());	
	   for(int index=0;index<words.size();index++) {
			words.remove(index);
			//burada ise ��kartma i�lemini yap�yoruz  
		}
		
		//yukar�daki kodun words.size �eklinde yaz�labilen hali burada g�z�kmektedir
	/*	for(int index=words.size()-2;index>=0;index-=2) {
			words.remove(index);
			
		}*/
		System.out.println("-------------------------------------------------------------------");
		System.out.println("en g�ncel liste ��kartma i�lemlerindende sonraki liste: ");
		System.out.println(words);
		System.out.println(words.size());
	}

}
