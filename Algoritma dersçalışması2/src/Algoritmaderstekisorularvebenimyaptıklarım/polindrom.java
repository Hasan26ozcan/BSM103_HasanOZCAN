package algoritmasorular�1�dev;

import java.util.Scanner;

public class polindrom {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("yaz�n�z� giriniz: ");
    String a=scan.next();
    String s1="";
    
    String toplam="";
    for (int de�er = a.length()-1; de�er >=0; de�er--) {
		toplam=toplam+a.charAt(de�er);
	}
    if(toplam.equals(a)) {
    	System.out.println("true");
    }
	}

}
