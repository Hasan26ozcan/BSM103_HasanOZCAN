package algoritmasorular�1�dev;

import java.util.Random;
import java.util.Scanner;

public class Stringe�itlik {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("isminizi giriniz: ");
    String name=scan.next();
    if(name == "barney") {
    	System.out.println("e�ittir");
    }
    else {
    	System.out.println("e�it de�ildir");
    }
    if(name.equals("barney")) {
    	System.out.println("e�ittir");
    }
    else {
    	System.out.println("e�it de�ildir");
    }
    // iste buradada goruldugu gibi esitlik dedigimiz sey equals sayesinde ortaya daha rahat c�kmaktad�r
    System.out.println(name.startsWith("a"));
    System.out.println(name.endsWith("t"));
    System.out.println(name.contains("hm"));
    if(name.equals("ahmet")) {
    	System.out.println("de�eriniz tamamen do�ru");
    	
    }
    else if(name.equalsIgnoreCase("AHmet")) {
    	System.out.println("yapt���n�z sistemde sadece hard b�y�k k��kl���ne bak�n");
    }
    Random random=new Random();
	int sum;
	do{
		int roll=random.nextInt(6)+1;
		int roll2=random.nextInt(6)+1;
		
		sum=roll+roll2;
		System.out.println("toplamlar� 7 olunca durucak toplamlar�: "+sum);
		
	}while(sum !=7);
	System.out.println("3 tane de�er giriniz: ");
	int suma=scan.nextInt();
	int de�er=scan.nextInt();
	int counter=scan.nextInt();
	
    boolean age=suma<21;
    boolean hak = de�er <=30;
    boolean  pal = counter ==90;
    
    if(age || hak && pal) {
    	System.out.println("do�ru");
    }
    else {
    	System.out.println("yanl��");
    }
    
    
    
    
    
	}

}
