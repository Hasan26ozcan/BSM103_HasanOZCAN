package algoritmasorular�1�dev;

public class maksimumsayibulma {
	
	
	
	public static int maksimum(int[] arr) {
	int maks=1;
	for (int de�er = 1; de�er < arr.length; de�er++) {
		int a=Math.abs(arr[de�er]-arr[de�er-1]);
		if(maks<=a) {
		maks =a;
		}
	}
	return maks;
// burda yapt���m�z �ey aradaki sayi fark� ona g�re cevap veriyor bize
	}

	public static void main(String[] args) {
	int[] sayi= {1,2,3,0,3,2,9,4,5,6,7,8,30};
	System.out.println(maksimum(sayi));
	}

}
