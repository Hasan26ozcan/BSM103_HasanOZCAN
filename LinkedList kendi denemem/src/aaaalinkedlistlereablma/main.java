package aaaalinkedlistlereablma;

import java.util.Random;

public class main {
	public static void main(String[] args) {	
	BizimLl screan=new BizimLl();
	screan.BasaEkle(6);
	screan.bastansil();
	screan.ekranalisteyiyazd�rma();
	screan.sonaEkle(67);
	screan.BasaEkle(890);
	screan.sonaEkle(678);
	screan.ekranalisteyiyazd�rma();
	screan.sonaEkle(8);
	screan.ekranalisteyiyazd�rma();
	screan.BasaEkle(11);
	screan.ekranalisteyiyazd�rma();
	screan.indekseeklemek(-1, 3);
	screan.ekranalisteyiyazd�rma();
	screan.bastansil();
	screan.ekranalisteyiyazd�rma();
	screan.sondanSil();
	screan.ekranalisteyiyazd�rma();
	screan.sondanSil();
	screan.ekranalisteyiyazd�rma();
	screan.sonaEkle(23);
	screan.ekranalisteyiyazd�rma();
	screan.indeksisil(1);
	screan.ekranalisteyiyazd�rma();
	screan.sonaEkle(6789);
	screan.ekranalisteyiyazd�rma();
	screan.indeksisil(3);
	screan.ekranalisteyiyazd�rma();
	screan.BasaEkle(23);
	screan.sonaEkle(68);
	screan.ekranalisteyiyazd�rma();
	screan.indeksisil(-1);
	screan.ekranalisteyiyazd�rma();
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
	screan.ekranalisteyiyazd�rma();
	screan.verilende�erisil(3);
	screan.ekranalisteyiyazd�rma();
	screan.verilende�erinhespinisil(3);
	screan.ekranalisteyiyazd�rma();
	screan.verilende�erinhespinisil(-15);
	screan.ekranalisteyiyazd�rma();
	screan.sonaEkle(6);
	screan.ekranalisteyiyazd�rma();
	screan.verilende�erinhespinisil(5);
	screan.ekranalisteyiyazd�rma();
	screan.BasaEkle(-1);
	screan.BasaEkle(1);
	screan.ekranalisteyiyazd�rma();
	screan.bubbleSort();
	screan.ekranalisteyiyazd�rma();
	screan.BasaEkle(4);
	screan.BasaEkle(8);
	screan.BasaEkle(24);
	screan.BasaEkle(-67);
	screan.bubbleSort();
	screan.ekranalisteyiyazd�rma();
	screan.s�f�rla();
	screan.bubbleSort();
	screan.ekranalisteyiyazd�rma();
	screan.BasaEkle(-2);
	screan.ekranalisteyiyazd�rma();
	screan.bubbleSort();
	screan.ekranalisteyiyazd�rma();
	screan.BasaEkle(5);
	screan.ekranalisteyiyazd�rma();
	screan.bubbleSort();
	screan.ekranalisteyiyazd�rma();
	screan.BasaEkle(78);
	screan.ekranalisteyiyazd�rma();
	screan.bubbleSort();
	screan.ekranalisteyiyazd�rma();
	screan.s�ral�ekle(4);
	screan.ekranalisteyiyazd�rma();
	
	//Stack olarak
	System.out.println("----------------------------------Stack olarak--------------------------------");
	screan.s�f�rla();
	Random r=new Random();
	for (int saya� = 0; saya� < 10; saya�++) {
		int sayi=r.nextInt(100);
		System.out.println(sayi+"eklendi");
		screan.stack(sayi);
		screan.ekranalisteyiyazd�rma();
		if(saya� %3==0) {
			System.out.println(screan.Stackpop()+"��kt�");
			screan.ekranalisteyiyazd�rma();
		}}
		while(screan.doluMu()) {
			System.out.print(screan.Stackpop()+"��kt�");
			screan.ekranalisteyiyazd�rma();
			
		}
	 
System.out.println("------------------------------Queue olarak----------------------------");
	screan.ekranalisteyiyazd�rma();
	//Queue olarak
	for (int saya� = 0; saya� < 10; saya�++) {
		int sayi=r.nextInt(100);
		System.out.println(sayi+"eklendi");
		screan.queuePush(sayi);
		screan.ekranalisteyiyazd�rma();
		if(saya� %3==0) {
			System.out.println(screan.QueueRemove()+"��kt�");
			screan.ekranalisteyiyazd�rma();
		}}
		while(screan.doluMu()) {
			System.out.print(screan.QueueRemove()+"��kt�");
			screan.ekranalisteyiyazd�rma();
			
		}

	}
}
