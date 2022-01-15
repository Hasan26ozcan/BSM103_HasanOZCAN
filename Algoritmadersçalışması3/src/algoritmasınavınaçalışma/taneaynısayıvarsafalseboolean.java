package algoritmasýnavýnaçalýþma;

public class taneaynýsayývarsafalseboolean {

	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8,9,0};	
	System.out.println(uniqe(arr));
	}
	public static boolean uniqe(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
