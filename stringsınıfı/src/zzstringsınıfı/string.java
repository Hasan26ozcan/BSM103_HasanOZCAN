package zzstrings�n�f�;

public class string {

	public static void main(String[] args) {
	String s1 ="Mustafa";	
	String s3 = "Mustafa";
	String s2 =new String("Mustafa");
	String s4 =new String ("Mustafa");
	
	System.out.println(s2.length());
	System.out.println(s1.length());
	System.out.println("2. indekseteki de�er s2 i�in: "+s2.charAt(2));
	System.out.println("son eleman:"+s2.charAt(6));
	//ikiside ayn� �ey ama alattaki her zaman sonr de�erie verir s�teki ise say�pta verid�imiz zaman verir
	System.out.println("en son eleman: "+s2.charAt(s2.length()-1));
	System.out.println(s2.startsWith("Mu"));//neyle ba�l�yor
	System.out.println(s2.endsWith("fa"));//neyle bitiyor o na g�re true ya da dalse olarka d�dnd�rmesini sa�l�yor
	
	if(s1 ==s2 ) {
		System.out.println("e�ittir");
	}
	else {
		System.out.println("e�it de�ildir");
	}
	if(s1 == s3) {
		System.out.println("e�ittir");
	}
	else {
		System.out.println("e�it de�ildir");
	}
	
	if(s3 ==s4) {
		System.out.println("e�ittir");
	}
	else {
		System.out.println("e�it de�ildir");
	}
	}

}
