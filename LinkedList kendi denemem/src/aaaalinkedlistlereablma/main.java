package aaaalinkedlistlereablma;

import java.util.Random;

public class main {
	public static void main(String[] args) {	
	BizimLl screan=new BizimLl();
	screan.BasaEkle(6);
	screan.bastansil();
	screan.ekranalisteyiyazdırma();
	screan.sonaEkle(67);
	screan.BasaEkle(890);
	screan.sonaEkle(678);
	screan.ekranalisteyiyazdırma();
	screan.sonaEkle(8);
	screan.ekranalisteyiyazdırma();
	screan.BasaEkle(11);
	screan.ekranalisteyiyazdırma();
	screan.indekseeklemek(-1, 3);
	screan.ekranalisteyiyazdırma();
	screan.bastansil();
	screan.ekranalisteyiyazdırma();
	screan.sondanSil();
	screan.ekranalisteyiyazdırma();
	screan.sondanSil();
	screan.ekranalisteyiyazdırma();
	screan.sonaEkle(23);
	screan.ekranalisteyiyazdırma();
	screan.indeksisil(1);
	screan.ekranalisteyiyazdırma();
	screan.sonaEkle(6789);
	screan.ekranalisteyiyazdırma();
	screan.indeksisil(3);
	screan.ekranalisteyiyazdırma();
	screan.BasaEkle(23);
	screan.sonaEkle(68);
	screan.ekranalisteyiyazdırma();
	screan.indeksisil(-1);
	screan.ekranalisteyiyazdırma();
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
	screan.ekranalisteyiyazdırma();
	screan.verilendeğerisil(3);
	screan.ekranalisteyiyazdırma();
	screan.verilendeğerinhespinisil(3);
	screan.ekranalisteyiyazdırma();
	screan.verilendeğerinhespinisil(-15);
	screan.ekranalisteyiyazdırma();
	screan.sonaEkle(6);
	screan.ekranalisteyiyazdırma();
	screan.verilendeğerinhespinisil(5);
	screan.ekranalisteyiyazdırma();
	screan.BasaEkle(-1);
	screan.BasaEkle(1);
	screan.ekranalisteyiyazdırma();
	screan.bubbleSort();
	screan.ekranalisteyiyazdırma();
	screan.BasaEkle(4);
	screan.BasaEkle(8);
	screan.BasaEkle(24);
	screan.BasaEkle(-67);
	screan.bubbleSort();
	screan.ekranalisteyiyazdırma();
	screan.sıfırla();
	screan.bubbleSort();
	screan.ekranalisteyiyazdırma();
	screan.BasaEkle(-2);
	screan.ekranalisteyiyazdırma();
	screan.bubbleSort();
	screan.ekranalisteyiyazdırma();
	screan.BasaEkle(5);
	screan.ekranalisteyiyazdırma();
	screan.bubbleSort();
	screan.ekranalisteyiyazdırma();
	screan.BasaEkle(78);
	screan.ekranalisteyiyazdırma();
	screan.bubbleSort();
	screan.ekranalisteyiyazdırma();
	screan.sıralıekle(4);
	screan.ekranalisteyiyazdırma();
	
	//Stack olarak
	System.out.println("----------------------------------Stack olarak--------------------------------");
	screan.sıfırla();
	Random r=new Random();
	for (int sayaç = 0; sayaç < 10; sayaç++) {
		int sayi=r.nextInt(100);
		System.out.println(sayi+"eklendi");
		screan.stack(sayi);
		screan.ekranalisteyiyazdırma();
		if(sayaç %3==0) {
			System.out.println(screan.Stackpop()+"çıktı");
			screan.ekranalisteyiyazdırma();
		}}
		while(screan.doluMu()) {
			System.out.print(screan.Stackpop()+"çıktı");
			screan.ekranalisteyiyazdırma();
			
		}
	 
System.out.println("------------------------------Queue olarak----------------------------");
	screan.ekranalisteyiyazdırma();
	//Queue olarak
	for (int sayaç = 0; sayaç < 10; sayaç++) {
		int sayi=r.nextInt(100);
		System.out.println(sayi+"eklendi");
		screan.queuePush(sayi);
		screan.ekranalisteyiyazdırma();
		if(sayaç %3==0) {
			System.out.println(screan.QueueRemove()+"çıktı");
			screan.ekranalisteyiyazdırma();
		}}
		while(screan.doluMu()) {
			System.out.print(screan.QueueRemove()+"çıktı");
			screan.ekranalisteyiyazdırma();
			
		}

	}
}
