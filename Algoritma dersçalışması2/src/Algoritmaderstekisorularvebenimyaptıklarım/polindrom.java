package algoritmasorularý1ödev;

import java.util.Scanner;

public class polindrom {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("yazýnýzý giriniz: ");
    String a=scan.next();
    String s1="";
    
    String toplam="";
    for (int deðer = a.length()-1; deðer >=0; deðer--) {
		toplam=toplam+a.charAt(deðer);
	}
    if(toplam.equals(a)) {
    	System.out.println("true");
    }
	}

}
