package zzoop;

public class main {

	public static void main(String[] args) {
// de�i�ik �zellikleri gibi bunlar sayesinde oop ye gerek duyuyoruz yani �zelliklerin k�yasalams� hepsinin kullan�lmas�nda bize kolayl�k sa�layan �eydir
	// fileds =�zellikler
		 Car a =new Car();
		 a.clor="g�m��";
		 a.doors=4;
		 a.engine=1.6;
		 a.model ="mercedes amg gts";
		 System.out.println("araban�n rengi: "+a.clor);
		 System.out.println("arabadki kap� say�s�: "+a.doors);
		 System.out.println("araban�n motor hacmi: "+a.engine);
		 System.out.println("araban�n modeli: "+a.model);
	}

}
