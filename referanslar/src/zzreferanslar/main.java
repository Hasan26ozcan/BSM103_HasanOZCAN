package zzreferanslar;

public class main {

	public static void main(String[] args) {
	String s1 =new String("Mustafa");
	String s2=new String ("Mustafa");
	if(s1.equals(s2)) {
		// yani biz burada e�ittirdeyekn referansalar� k�yaslam�� oluyoruz
		// ama e�er i�ini k�yaslamak istersek o zaman equals kullanmam�z gerekicek 
		//bunda equals yaparsan e�er do�ru cevab� verir 
		System.out.println("e�ittir");
	}
	else {
		System.out.println("e�it de�ildir");
	}
	
	String s3 ="Mustafa";
	String s4="Mustafa";
	if(s3 == s4 ) {
		// e�itt e�ittirde sadece do�ru de�eri d�nd�rmeyi ba�aran de�er budur
		System.out.println("e�ittir");
	}
	else {
		System.out.println("e�it de�ildir");
	}
	
	if(s3.equals(s1) ) {
		//�ok kritik bir yerdesin
		System.out.println("e�ittir");
	}
	else {
		System.out.println("e�it de�ildir");
	}
	
	
	}

}
