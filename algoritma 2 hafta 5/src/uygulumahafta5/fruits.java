package uygulumahafta5;

import java.util.ArrayList;

public class fruits {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Elma");
		list.add("Muz");
		list.add("Portakal");
		
		//direk dizi olarka ekrana yazdýrma
		System.out.println(list);
		
		for(String fruit :list) {
			//for each döngüsüyle ekrana yazdýrma 
			System.out.println(fruit);
		}	
	}
}