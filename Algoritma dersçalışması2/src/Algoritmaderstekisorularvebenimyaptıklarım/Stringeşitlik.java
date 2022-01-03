package algoritmasorularý1ödev;

import java.util.Random;
import java.util.Scanner;

public class Stringeþitlik {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("isminizi giriniz: ");
    String name=scan.next();
    if(name == "barney") {
    	System.out.println("eþittir");
    }
    else {
    	System.out.println("eþit deðildir");
    }
    if(name.equals("barney")) {
    	System.out.println("eþittir");
    }
    else {
    	System.out.println("eþit deðildir");
    }
    // iste buradada goruldugu gibi esitlik dedigimiz sey equals sayesinde ortaya daha rahat cýkmaktadýr
    System.out.println(name.startsWith("a"));
    System.out.println(name.endsWith("t"));
    System.out.println(name.contains("hm"));
    if(name.equals("ahmet")) {
    	System.out.println("deðeriniz tamamen doðru");
    	
    }
    else if(name.equalsIgnoreCase("AHmet")) {
    	System.out.println("yaptýðýnýz sistemde sadece hard büyük küçklüðüne bakýn");
    }
    Random random=new Random();
	int sum;
	do{
		int roll=random.nextInt(6)+1;
		int roll2=random.nextInt(6)+1;
		
		sum=roll+roll2;
		System.out.println("toplamlarý 7 olunca durucak toplamlarý: "+sum);
		
	}while(sum !=7);
	System.out.println("3 tane deðer giriniz: ");
	int suma=scan.nextInt();
	int deðer=scan.nextInt();
	int counter=scan.nextInt();
	
    boolean age=suma<21;
    boolean hak = deðer <=30;
    boolean  pal = counter ==90;
    
    if(age || hak && pal) {
    	System.out.println("doðru");
    }
    else {
    	System.out.println("yanlýþ");
    }
    
    
    
    
    
	}

}
