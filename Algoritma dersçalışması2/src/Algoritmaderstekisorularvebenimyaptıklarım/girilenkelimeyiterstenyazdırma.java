package algoritmasorularý1ödev;

import java.util.Scanner;

public class girilenkelimeyiterstenyazdýrma {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("kelimenizi giriniz: ");
	String abc=scan.nextLine();
	String sayaç ="";
	for (int deðer = abc.length()-1; deðer>=0; deðer--) {
		sayaç=sayaç+abc.charAt(deðer);
	}
	System.out.println(sayaç);
	//burda deðerimizi tersten yazdýrma iþlemimiz baþarýlý bir þekilde yapýlmýþtýr
	}

}
