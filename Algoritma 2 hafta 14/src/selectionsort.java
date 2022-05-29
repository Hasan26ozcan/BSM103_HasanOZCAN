import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr= {7,4,8,1,90,3,12,5};
		System.out.println("sýrlama öncesi");
		System.out.println(Arrays.toString(arr));
		selectionsort(arr);
		System.out.println("sýralama sonrasý");
		System.out.println(Arrays.toString(arr));
		screanwrite(arr);
	}
	public static void screanwrite(int[] arr) {
		System.out.print("[");
		System.out.print(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			System.out.print(", "+arr[i]);
		}
		System.out.println("]");
	}
	
	
	
	
	
	
	public static void selectionsort(int[] arr) {
		
		for (int j = 0; j < arr.length-1; j++) {
			int minindex=j;
		 for (int i = j+1; i < arr.length; i++) {
			if(arr[minindex] >arr[i]) {
				minindex=i;
			}
		}
		 int min= arr[minindex];
		 arr[minindex]=arr[j];
		 arr[j]=min;
		 
		}
	}

}
