package algoritmasorular�1�dev;

import java.util.Scanner;

public class ger�ekdostlar�ma�zelkod {

	public static void main(String[] args) {
	System.out.println("yeni en mutlu giren agalar gurubundaki ki�iler");
	Scanner scan=new Scanner(System.in);
	System.out.println("bize tayfan�zdan olan bir ki�inin ad�n� giriniz: ");
	String adam=scan.next();
	
	if(adam.equals("osman")) {
		System.out.println("bizim tayfam�za ait bir osmanKhan adl� kullan�c�d�r  ");
	}
	else if(adam.equals("metehan ")) {
		System.out.println("bizim tayfam�za ait bir krald�r");
	}
	else if(adam.equals("ayd�n")) {
		System.out.println("bizim tayfam�za ait bir krald�r");
	}
	else if(adam.equals("bar��can")) {
		System.out.println("bizim tayfam�za ait bir krald�r");
	}
	else if(adam.equals("furkan")) {
		System.out.println("bizim tayfam�za ait bir reisdir");
	}
	else if(adam.equals("hasan")) {
		System.out.println("bizim tayfam�za ait bir krald�r");
	}
	else {
		System.out.println("b�yle bir ki�i bizim tayfam�zda de�ildir ");
	}
	
	
			}

}
