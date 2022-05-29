import java.util.Arrays;

public class mergesort {
	public static void main(String[] args) {
		int[] arr= {34,56,78,12,1,3,22};
		mergesort sorts=new mergesort();
		System.out.println(Arrays.toString(arr));
		sorts.sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	void sort(int[] arr,int left,int right) {
		if(left<right) {
			int middle=(left+right)/2;
			//ortadaki deðerimiz belli oldu middle ile
			sort(arr,left,middle);
			sort(arr,middle+1,right);
			
			merge(arr,left,middle,right);
		}
		
	}
	void merge(int[] arr,int left,int middle,int right) {
	 	int number1= middle-left+1;
		int number2= right-middle;
		int[] L=new int[number1];
		int[] R=new int[number2];
		for (int i = 0; i <number1 ; i++) {
			L[i]=arr[i+left];
		}
		for (int i = 0; i < number2; i++) {
			R[i]=arr[middle+1+i];
		}
		int i=0,j=0;
		int k=left;
		while(i<number1&&j<number2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}			
			while(i<number1) {
				arr[k]=L[i];
				i++;
				k++;
			}
			while(j<number2) {
				arr[k]=R[j];
				j++;
				k++;
			}


}
}