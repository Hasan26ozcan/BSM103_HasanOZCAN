import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class dosyaokumadosya {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		System.out.println("dosya adýný giriniz: ");
		String filename=scan.nextLine();
		Scanner input=new Scanner(new File(filename));
		while(input.hasNext()) {
			list.add(input.next());
		}
		Collections.sort(list);
		String[] arr=new String[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=list.get(i);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Aramak istediðniz String deðerini giriniz: ");
		String write=scan.next();
		dosyaokumadosya filereading=new dosyaokumadosya();
		System.out.println(filereading.filereadin(arr, write));
		 
	}
	public int filereadin(String[] numbers,String write) {
		int min=0;
		int max=numbers.length-1;
		while(min<=max) {
			int mind=(max+min)/2;
			if(numbers[mind].equals(write)) {
				return mind;
			}else {
				ArrayList<String> list=new ArrayList<>();
				Set<String> sets=new TreeSet<>();
				sets.add(numbers[mind]);
				sets.add(write);
				list.addAll(sets);
				if(!list.get(0).equals(write)) {
					min=mind+1;
				}
				else {
					max=mind-1;
				}
			}
		}
		return -1;
	}
	

}
