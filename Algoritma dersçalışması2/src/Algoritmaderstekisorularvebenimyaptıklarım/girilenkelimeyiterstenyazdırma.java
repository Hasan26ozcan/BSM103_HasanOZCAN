package algoritmasorular�1�dev;

import java.util.Scanner;

public class girilenkelimeyiterstenyazd�rma {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("kelimenizi giriniz: ");
	String abc=scan.nextLine();
	String saya� ="";
	for (int de�er = abc.length()-1; de�er>=0; de�er--) {
		saya�=saya�+abc.charAt(de�er);
	}
	System.out.println(saya�);
	//burda de�erimizi tersten yazd�rma i�lemimiz ba�ar�l� bir �ekilde yap�lm��t�r
	}

}
