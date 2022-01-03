package algoritmasorularý1ödev;

import java.util.Arrays;

public class dizibirleþtirme {

	public static void main(String[] args) {
	int[] arr= {12,13,14,15,16,17};
	System.out.println(Arrays.toString(arr));
	int[] arr1= {18,19,20,21,22,23};
	System.out.println(Arrays.toString(arr1));
	int[] arr2 =new int[arr.length+arr1.length];
for (int sayy = 0; sayy < arr.length; sayy++) {
	arr2[sayy]=arr[sayy];
	for (int sayi = 0; sayi < arr1.length; sayi++) {
		arr2[arr.length+sayi]=arr1[sayi];
	}
	
}
System.out.println("array deðerleinin birleþmiþ hali burda görebilirsiniz: "+Arrays.toString(arr2));

}
}
