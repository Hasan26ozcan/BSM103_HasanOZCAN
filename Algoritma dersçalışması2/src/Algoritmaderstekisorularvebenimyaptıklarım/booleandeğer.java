package algoritmasorular�1�dev;

import java.util.Scanner;

public class booleande�er {
	
public static boolean de�er(int n) {
	int factor =0;
	int de�e;
	for (int de�er = 1; de�er <=n; de�er++) {
		if(n%de�er ==0) {
		factor ++;	
		}
		 	}
	if(factor  == 2) {
		System.out.println("girdi�niz say� asal bir say�d�r bu say�: "+n);
		return true;
	}else {
	return false;
	}
}
public static boolean rhyme(String s1,String s2) {
	if(s2.length() >=2&& s1.endsWith(s2.substring(s2.length()-2))) {
		System.out.println("do�ru");
		return true;
	}
	else {
		System.out.println("yanl��");
		return false;
	}
		
}
public static boolean bothoid(int a,int b) {
	if(a%2 !=0 && b %2 !=0) {
		System.out.println("true");
		return true;
	}
	else {
		System.out.println("yanl��");
		return false;
	}
}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("de�eririniz giriniz");
		int pera=scan.nextInt();
		de�er(pera);
		if(de�er(pera));
		
		String monkey =scan.next();
		String money=scan.next();
		rhyme(money,monkey);
		
	String abc="bubirdenememesaj�d�r";
	System.out.println(abc.substring(abc.length()-2));
	bothoid(30,50);	
	
	
	
	
	}

}
