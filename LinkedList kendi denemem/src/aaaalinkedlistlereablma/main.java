package aaaalinkedlistlereablma;

import java.util.Random;

public class main {
	public static void main(String[] args) {	
	BizimLl screan=new BizimLl();
	screan.BasaEkle(6);
	screan.bastansil();
	screan.ekranalisteyiyazdýrma();
	screan.sonaEkle(67);
	screan.BasaEkle(890);
	screan.sonaEkle(678);
	screan.ekranalisteyiyazdýrma();
	screan.sonaEkle(8);
	screan.ekranalisteyiyazdýrma();
	screan.BasaEkle(11);
	screan.ekranalisteyiyazdýrma();
	screan.indekseeklemek(-1, 3);
	screan.ekranalisteyiyazdýrma();
	screan.bastansil();
	screan.ekranalisteyiyazdýrma();
	screan.sondanSil();
	screan.ekranalisteyiyazdýrma();
	screan.sondanSil();
	screan.ekranalisteyiyazdýrma();
	screan.sonaEkle(23);
	screan.ekranalisteyiyazdýrma();
	screan.indeksisil(1);
	screan.ekranalisteyiyazdýrma();
	screan.sonaEkle(6789);
	screan.ekranalisteyiyazdýrma();
	screan.indeksisil(3);
	screan.ekranalisteyiyazdýrma();
	screan.BasaEkle(23);
	screan.sonaEkle(68);
	screan.ekranalisteyiyazdýrma();
	screan.indeksisil(-1);
	screan.ekranalisteyiyazdýrma();
	screan.sonaEkle(8);
	screan.sonaEkle(5);
	screan.sonaEkle(3);
	screan.sonaEkle(3);
	screan.sonaEkle(5);
	screan.sonaEkle(5);
	screan.sonaEkle(78);
	screan.sonaEkle(3);
	screan.sonaEkle(3);
	screan.sonaEkle(5);
	screan.ekranalisteyiyazdýrma();
	screan.verilendeðerisil(3);
	screan.ekranalisteyiyazdýrma();
	screan.verilendeðerinhespinisil(3);
	screan.ekranalisteyiyazdýrma();
	screan.verilendeðerinhespinisil(-15);
	screan.ekranalisteyiyazdýrma();
	screan.sonaEkle(6);
	screan.ekranalisteyiyazdýrma();
	screan.verilendeðerinhespinisil(5);
	screan.ekranalisteyiyazdýrma();
	screan.BasaEkle(-1);
	screan.BasaEkle(1);
	screan.ekranalisteyiyazdýrma();
	screan.bubbleSort();
	screan.ekranalisteyiyazdýrma();
	screan.BasaEkle(4);
	screan.BasaEkle(8);
	screan.BasaEkle(24);
	screan.BasaEkle(-67);
	screan.bubbleSort();
	screan.ekranalisteyiyazdýrma();
	screan.sýfýrla();
	screan.bubbleSort();
	screan.ekranalisteyiyazdýrma();
	screan.BasaEkle(-2);
	screan.ekranalisteyiyazdýrma();
	screan.bubbleSort();
	screan.ekranalisteyiyazdýrma();
	screan.BasaEkle(5);
	screan.ekranalisteyiyazdýrma();
	screan.bubbleSort();
	screan.ekranalisteyiyazdýrma();
	screan.BasaEkle(78);
	screan.ekranalisteyiyazdýrma();
	screan.bubbleSort();
	screan.ekranalisteyiyazdýrma();
	screan.sýralýekle(4);
	screan.ekranalisteyiyazdýrma();
	
	//Stack olarak
	System.out.println("----------------------------------Stack olarak--------------------------------");
	screan.sýfýrla();
	Random r=new Random();
	for (int sayaç = 0; sayaç < 10; sayaç++) {
		int sayi=r.nextInt(100);
		System.out.println(sayi+"eklendi");
		screan.stack(sayi);
		screan.ekranalisteyiyazdýrma();
		if(sayaç %3==0) {
			System.out.println(screan.Stackpop()+"çýktý");
			screan.ekranalisteyiyazdýrma();
		}}
		while(screan.doluMu()) {
			System.out.print(screan.Stackpop()+"çýktý");
			screan.ekranalisteyiyazdýrma();
			
		}
	 
System.out.println("------------------------------Queue olarak----------------------------");
	screan.ekranalisteyiyazdýrma();
	//Queue olarak
	for (int sayaç = 0; sayaç < 10; sayaç++) {
		int sayi=r.nextInt(100);
		System.out.println(sayi+"eklendi");
		screan.queuePush(sayi);
		screan.ekranalisteyiyazdýrma();
		if(sayaç %3==0) {
			System.out.println(screan.QueueRemove()+"çýktý");
			screan.ekranalisteyiyazdýrma();
		}}
		while(screan.doluMu()) {
			System.out.print(screan.QueueRemove()+"çýktý");
			screan.ekranalisteyiyazdýrma();
			
		}

	}
}
