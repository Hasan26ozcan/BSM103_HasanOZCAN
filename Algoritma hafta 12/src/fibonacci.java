import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		fibonacci fb=new fibonacci();
		System.out.println("sayý deerinizi giriniz: ");
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		System.out.println(fb.fibonacciseries(sayi));
		fb.runtime(sayi);
		
		
	}
	private ArrayList<ArrayList<Integer>> fibonacciseries(int numrows){
		//		1,1,1-1,1-2,
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		ArrayList<Integer> fib=new ArrayList<>();
		fib.add(1);
		list.add(fib);
		list.add(fib);
		for (int index = 2; index <numrows ; index++) {
			ArrayList<Integer> firstprevious=list.get(index-1);
			ArrayList<Integer> secondprevious =list.get(index-2);
			int first=secondprevious.get(secondprevious.size()-1);
			int second=firstprevious.get(firstprevious.size()-1);
			
			ArrayList<Integer> currentList =new ArrayList<>();
			currentList.add(second);
			currentList.add(first+second);
			list.add(currentList);
			
		}
		System.out.println(list.toString());
		return list;
		
	}
	private void runtime(int numrows) {
		long start=System.currentTimeMillis();
		fibonacciseries(numrows);
		long end=System.currentTimeMillis();
		long time=end-start;
		System.out.println("þu kadar sürede gerçekleþmiþtir"+time);
		
	}

}
