import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class binarysearcStringdeneme {
	public static void main(String[] args) {
		Random r=new Random();
		ArrayList<String> list=new ArrayList<>();
	/*	int bent=r.nextInt();
		System.out.println(bent);
	*/	
		String[] str= {"ahmet","kemal","þüheda","kamta","hamit","ketip","kasýl","lakým","olsdu","yakup"};
		String[] str1=new String[str.length];
		Scanner scan=new Scanner(System.in);
		System.out.println("bulunmasýný istediðiniz string deðerinizi giriniz: ");
		String write=scan.next();
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			str1[i]= list.get(i);
		}
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str1));
		System.out.println(binarysearch(str1, write));
		
	}
	public static int binarysearch(String[] str,String write) {
		int min=0;
		int max=str.length-1;
		while(min<=max) {	
			int mind=(max+min)/2;
			String control=str[mind];
			if(control.equals(write)) {
				return mind;
			}
			else if(!control.equals(write)){
				ArrayList<String> writes=new ArrayList<String>();
				writes.add(write);
				writes.add(control);
				Collections.sort(writes);
				if(!writes.get(0).equals(write)) {
					min=mind+1;
				}else {
				max=mind-1;
			}
			
			}
		}
		return -1;
	}

}
