package uygulumahafta5;

import java.util.ArrayList;

public class fruits {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Elma");
		list.add("Muz");
		list.add("Portakal");
		
		//direk dizi olarka ekrana yazd�rma
		System.out.println(list);
		
		for(String fruit :list) {
			//for each d�ng�s�yle ekrana yazd�rma 
			System.out.println(fruit);
		}	
	}
}