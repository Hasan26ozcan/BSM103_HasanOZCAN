import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		int[] numbers= {11,34,23,51,63,29,91,26,11};
		ArrayList<Integer> list=new ArrayList<>();
		int[] numbers2=new int[numbers.length];	
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			numbers2[i]=list.get(i);
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		Scanner scan=new Scanner(System.in);
		System.out.println("hangi sayiyi bulmak istiyorsanız bu sayını giriniz: ");
		int sayi=scan.nextInt();
		if(-1 !=indexof(numbers, sayi)) {
			System.out.println("indexi: " +indexof(numbers, sayi));
		}else {
			System.out.println("indeksi yoktur");
		}
		run1(numbers, sayi);
		run2(numbers2,sayi);
		System.out.println(indexof2(numbers2, sayi));
		System.out.println(indexofrecursive(numbers2, sayi, 0));
		run3(numbers2, sayi);
		System.out.println(binarysearch(numbers2, sayi));
		System.out.println("---------------------------------------------------");
		System.out.println(binarysearch2(numbers2, sayi, 0, numbers2.length-1));
		System.out.println("burası binaryden geçiş yeri olarak gösterilebilir");
		System.out.println("-----------------------------------------------");
		System.out.println(Arrays.binarySearch(numbers2, 1));
		
		
		
		
		
		//----------------------------------------------------------------------------------------------
	}
	public static int indexof2(int[] numbers2,int target) {
		int counter=0;
		while(counter<numbers2.length &&numbers2[counter]<=target) {
			if(numbers2[counter]== target) {
				return counter;
			}
			else {
			counter++;
			}
		}
		return -1;
	}
	public static int indexof(int[] number,int target) {
		for (int i = 0; i < number.length; i++) {
			if(number[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void run1(int[] number,int target) {
		long start=System.nanoTime();
		indexof(number, target);
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("geçen zaman: "+time);
	}
	public static void run2(int[] number,int target) {
		long start=System.nanoTime();
		indexof2(number, target);
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("geçen zaman: "+time);
	}
	public static void run3(int[] number,int target) {
		long start=System.nanoTime();
		binarysearch(number, target);
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("geçen zaman: "+time);
	}
	
	public static int indexofrecursive(int[]numbers ,int target,int index ) {
		int uzunluğu=numbers.length;
		if(numbers[index]==target) {
			return index;
		}
		
		else if(index<uzunluğu-1){
			return indexofrecursive(numbers, target, index+1);
		}else {
			return -1;
		}
		
		
		
		
	}
	public static int binarysearch(int[] numbers,int target) {
		int index=0;
		int	min=0;
		int	max=numbers.length-1;
		while(min<=max) {
		int mind=(max+min)/2;
		if(numbers[mind]<target) {
			min=mind+1;
		}else if(numbers[mind]>target) {
			max=mind-1;
		}else {
			return mind;
		}
		}
		return -1;
	}
	public static int binarysearch2(int[] numbers,int target,int min,int max) {
		if(max>=min) {
			int mind=(max+min)/2;
			if(numbers[mind]<target) {
				return binarysearch2(numbers, target, mind+1, max );
			}else if(numbers[mind]>target) {
				return binarysearch2(numbers, target, min, mind-1);
			}
			else {
			return mind;
		}
		}
		return -1;
	}

}
