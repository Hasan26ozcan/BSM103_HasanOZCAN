import java.util.Arrays;

public class insertiossort {
	public static void main(String[] args) {
		insertiossort sortalgorithms=new insertiossort();
		int[] arr= {12,56,23,78,43,72,91,3,1,8};
		System.out.println(Arrays.toString(arr));
		sortalgorithms.insertionssort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public void insertionssort(int[] arr) {
		for (int i =1; i < arr.length; i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

}
