package algoritmasýnavýnaçalýþma;

import java.util.Arrays;

public class dizisýralama {

	public static void main(String[] args) {
	int[] arr= {1,2,35,5,8,1,2,3,7,3};
	
	int temp=0;
	for (int index = 0; index < arr.length; index++) {
		for (int counter = index+1; counter < arr.length; counter++) {
			if(arr[index]>arr[counter]) {
				temp=arr[index];
				arr[index]=arr[counter];
				arr[counter]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	}

}
