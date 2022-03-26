package uygulumahafta5;

import java.util.ArrayList;

public class kisimain {
	public static void main(String[] args) {
		
		ArrayList<kisi> bireyler=new ArrayList<>();
		bireyler.add(new kisi("ahmet", 24));
		bireyler.add(new kisi("Hasan", 30));
		bireyler.add(new kisi("hayri", 40));
		/*
		bireyler.forEach(birey ->{
			System.out.println("isim: "+birey.getisim()+"yas: "+birey.getyas());
		});
		*/
		for(kisi birey:bireyler) {
			System.out.println(birey.getisim()+","+birey.getyas());
		}
	}

}
