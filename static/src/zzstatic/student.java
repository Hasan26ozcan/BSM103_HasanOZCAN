package zzstatic;

public class student {
	public static int no_of_students=0;
	//sadece classa özgü bir deðer olarak oluþuyor

	public student() {
		no_of_students+=1;
	}
	public static void deneme() {//statici sildiðimiz zaman objemiz yok
		System.out.println("statik metot");
	}
	

}
