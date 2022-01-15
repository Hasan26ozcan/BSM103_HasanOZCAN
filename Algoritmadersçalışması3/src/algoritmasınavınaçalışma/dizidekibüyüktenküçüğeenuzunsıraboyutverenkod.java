package algoritmasýnavýnaçalýþma;

public class dizidekibüyüktenküçüðeenuzunsýraboyutverenkod {

	public static void main(String[] args) {
	int[] arr= {1,2,3,4,3,6,2,8,3,0,};
	System.out.println(enuzunsýra(arr));
	}
	public static int enuzunsýra(int[] arr1) {
		int max=0;
		int counter=1;
		for (int index = 0; index < arr1.length-1; index++) {
			if(arr1[index+1]>arr1[index]) {
				counter++;
			}
			if(max<counter) {
				max=counter;
			}
			else {
				counter=1;
			}
		}
		return max;
	}

}
