package zzstatic;

public class student {
	public static int no_of_students=0;
	//sadece classa �zg� bir de�er olarak olu�uyor

	public student() {
		no_of_students+=1;
	}
	public static void deneme() {//statici sildi�imiz zaman objemiz yok
		System.out.println("statik metot");
	}
	

}
