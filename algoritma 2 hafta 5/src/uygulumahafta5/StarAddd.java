package uygulumahafta5;

import java.util.ArrayList;

public class StarAddd {
	public static void main(String[] args) {
		ArrayList<String> words =new ArrayList<>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartin");
		words.add("kitap");
		System.out.println("döngü öncesinde");
		System.out.println("liste uzunluðu: "+words.size());
		System.out.println(words);
		for(int index=0;index<words.size();index+=2) {
			//elemanlarýn arasýnda yýldýz koyuyor neden 2 þetli arttýrdýðýmýz indexi takip et
			words.add(index,"* ");
		}

/*		for(int deðer=words.size()-1;deðer>=0;deðer--) {
			words.add(deðer, "?");
		}
		*/
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("güncel liste: "+words);
		System.out.println("yeni liste uzunluðu: "+words.size());	
	   for(int index=0;index<words.size();index++) {
			words.remove(index);
			//burada ise çýkartma iþlemini yapýyoruz  
		}
		
		//yukarýdaki kodun words.size þeklinde yazýlabilen hali burada gözükmektedir
	/*	for(int index=words.size()-2;index>=0;index-=2) {
			words.remove(index);
			
		}*/
		System.out.println("-------------------------------------------------------------------");
		System.out.println("en güncel liste çýkartma iþlemlerindende sonraki liste: ");
		System.out.println(words);
		System.out.println(words.size());
	}

}
