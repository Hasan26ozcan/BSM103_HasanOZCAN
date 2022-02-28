package zzstringsýnýfý;

public class string {

	public static void main(String[] args) {
	String s1 ="Mustafa";	
	String s3 = "Mustafa";
	String s2 =new String("Mustafa");
	String s4 =new String ("Mustafa");
	
	System.out.println(s2.length());
	System.out.println(s1.length());
	System.out.println("2. indekseteki deðer s2 için: "+s2.charAt(2));
	System.out.println("son eleman:"+s2.charAt(6));
	//ikiside ayný þey ama alattaki her zaman sonr deðerie verir süteki ise sayýpta veridðimiz zaman verir
	System.out.println("en son eleman: "+s2.charAt(s2.length()-1));
	System.out.println(s2.startsWith("Mu"));//neyle baþlýyor
	System.out.println(s2.endsWith("fa"));//neyle bitiyor o na göre true ya da dalse olarka dödndürmesini saðlýyor
	
	if(s1 ==s2 ) {
		System.out.println("eþittir");
	}
	else {
		System.out.println("eþit deðildir");
	}
	if(s1 == s3) {
		System.out.println("eþittir");
	}
	else {
		System.out.println("eþit deðildir");
	}
	
	if(s3 ==s4) {
		System.out.println("eþittir");
	}
	else {
		System.out.println("eþit deðildir");
	}
	}

}
