package algoritmas�nav�na�al��ma;

public class dizidekib�y�ktenk����eenuzuns�raboyutverenkod {

	public static void main(String[] args) {
	int[] arr= {1,2,3,4,3,6,2,8,3,0,};
	System.out.println(enuzuns�ra(arr));
	}
	public static int enuzuns�ra(int[] arr1) {
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
