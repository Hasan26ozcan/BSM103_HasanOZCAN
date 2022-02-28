package zzreferanslar;

public class main {

	public static void main(String[] args) {
	String s1 =new String("Mustafa");
	String s2=new String ("Mustafa");
	if(s1.equals(s2)) {
		// yani biz burada eþittirdeyekn referansalarý kýyaslamýþ oluyoruz
		// ama eðer içini kýyaslamak istersek o zaman equals kullanmamýz gerekicek 
		//bunda equals yaparsan eðer doðru cevabý verir 
		System.out.println("eþittir");
	}
	else {
		System.out.println("eþit deðildir");
	}
	
	String s3 ="Mustafa";
	String s4="Mustafa";
	if(s3 == s4 ) {
		// eþitt eþittirde sadece doðru deðeri döndürmeyi baþaran deðer budur
		System.out.println("eþittir");
	}
	else {
		System.out.println("eþit deðildir");
	}
	
	if(s3.equals(s1) ) {
		//çok kritik bir yerdesin
		System.out.println("eþittir");
	}
	else {
		System.out.println("eþit deðildir");
	}
	
	
	}

}
