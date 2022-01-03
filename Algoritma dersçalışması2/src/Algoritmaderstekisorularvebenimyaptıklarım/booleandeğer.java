package algoritmasorularý1ödev;

import java.util.Scanner;

public class booleandeðer {
	
public static boolean deðer(int n) {
	int factor =0;
	int deðe;
	for (int deðer = 1; deðer <=n; deðer++) {
		if(n%deðer ==0) {
		factor ++;	
		}
		 	}
	if(factor  == 2) {
		System.out.println("girdiðniz sayý asal bir sayýdýr bu sayý: "+n);
		return true;
	}else {
	return false;
	}
}
public static boolean rhyme(String s1,String s2) {
	if(s2.length() >=2&& s1.endsWith(s2.substring(s2.length()-2))) {
		System.out.println("doðru");
		return true;
	}
	else {
		System.out.println("yanlýþ");
		return false;
	}
		
}
public static boolean bothoid(int a,int b) {
	if(a%2 !=0 && b %2 !=0) {
		System.out.println("true");
		return true;
	}
	else {
		System.out.println("yanlýþ");
		return false;
	}
}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("deðeririniz giriniz");
		int pera=scan.nextInt();
		deðer(pera);
		if(deðer(pera));
		
		String monkey =scan.next();
		String money=scan.next();
		rhyme(money,monkey);
		
	String abc="bubirdenememesajýdýr";
	System.out.println(abc.substring(abc.length()-2));
	bothoid(30,50);	
	
	
	
	
	}

}
