package uygulumahafta5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class vocabulary2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan=new Scanner(new File("Test.txt"));
		ArrayList<String> deðer =new ArrayList<>();
		deðer=getwords(scan);
		//System.out.println(deðer);
		
	}
	
	public static ArrayList<String> getwords(Scanner scan){
		ArrayList<String> words=new ArrayList<String>();
		while(scan.hasNext()) {
	//		String next=scan.next().toLowerCase();
			words.add(scan.next().toLowerCase());
			/*if(!add.contains(next)) {
				add.add(next);
			}*/
			//þimdi burdaki if'in yaptýðý iþi bizi for döngüsüyle yapmaya çalýþalým
		}
		Collections.sort(words);
		System.out.println(words);
		ArrayList<String> result=new ArrayList<String>();
		
		if(words.size()>0) {
			System.out.println("a");
			for (int index = 0; index < words.size()-1; index++) {
				System.out.println("b");
				if(!words.get(index).equals(words.get(index+1))) {
					result.add(words.get(index));
				}
				
			}
		}
		System.out.println(result);
		
		
		/*
		System.out.println("karýþýk bir þekilde ekrana yazdýrýr");
		Collections.shuffle(add);
		System.out.println(add);
		System.out.println("--------------------------------------------------------------");
		System.out.println("sýralý bir þekilde ekrana yazýdýrýr");
		Collections.sort(add);
		System.out.println(add);
		System.out.println("-------------------------------------------------------------------");
		*/
		return result;
				
	}

}
