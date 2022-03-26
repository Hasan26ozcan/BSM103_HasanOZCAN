package uygulumahafta5;

import java.awt.Container;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class vocabulary {
	public static void main(String[] args) throws FileNotFoundException {
		// bulamad���m zaman ne yap�y�m diye soruyor onuda throwun yan�ndaki olarak yap�yoruz
		Scanner scan=new Scanner(new File("Test.txt"));
		ArrayList<String> list=new ArrayList<String>();
		list=getwords(scan);
		Collections.sort(list);
	    System.out.println(list);	
	    
	}
	
	public static ArrayList<String> getwords(Scanner scan){
		ArrayList<String> words=new ArrayList<String>();
		//Hasnext bir sonraki sa�r varm� onu kontrol ediyor
		while(scan.hasNext()) {
			//words.add(scan.next().toLowerCase());
			String nedir =scan.next().toLowerCase();
			if(!words.contains(nedir)) {
				words.add(nedir); 
			}
		}
		
		return words;
		
		
	}

}
