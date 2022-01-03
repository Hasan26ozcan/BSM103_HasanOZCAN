package algoritmasorularý1ödev;

import java.util.Scanner;

public class gerçekdostlarýmaözelkod {

	public static void main(String[] args) {
	System.out.println("yeni en mutlu giren agalar gurubundaki kiþiler");
	Scanner scan=new Scanner(System.in);
	System.out.println("bize tayfanýzdan olan bir kiþinin adýný giriniz: ");
	String adam=scan.next();
	
	if(adam.equals("osman")) {
		System.out.println("bizim tayfamýza ait bir osmanKhan adlý kullanýcýdýr  ");
	}
	else if(adam.equals("metehan ")) {
		System.out.println("bizim tayfamýza ait bir kraldýr");
	}
	else if(adam.equals("aydýn")) {
		System.out.println("bizim tayfamýza ait bir kraldýr");
	}
	else if(adam.equals("barýþcan")) {
		System.out.println("bizim tayfamýza ait bir kraldýr");
	}
	else if(adam.equals("furkan")) {
		System.out.println("bizim tayfamýza ait bir reisdir");
	}
	else if(adam.equals("hasan")) {
		System.out.println("bizim tayfamýza ait bir kraldýr");
	}
	else {
		System.out.println("böyle bir kiþi bizim tayfamýzda deðildir ");
	}
	
	
			}

}
