package algoritmas�nav�na�al��ma;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class dizirakamlar�nenk�����enb�y���n�verme {
//burda dizideki en k���k rak� buldum
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int arr[]=new int[10];
	for(int index=0;index<10;index++) {
		arr[index]=scan.nextInt();
	}
	int max=arr[0];
	int min=arr[0];
	for (int s�ra = 0; s�ra < 9; s�ra++) {
		if(arr[s�ra+1]<min)
		min=arr[s�ra+1];
	}
	System.out.println(min);
// burda ise dizideki en b�y�k rakam� buldum		
	for (int saya� = 0; saya� < 9; saya�++) {
		if(max<arr[saya�+1]) {
			max=arr[saya�+1];
		}
	}
	System.out.println(max);
		
	
	
	
	}
	
	

}
