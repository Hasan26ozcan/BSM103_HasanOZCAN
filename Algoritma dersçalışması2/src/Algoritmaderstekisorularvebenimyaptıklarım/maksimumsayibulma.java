package algoritmasorularý1ödev;

public class maksimumsayibulma {
	
	
	
	public static int maksimum(int[] arr) {
	int maks=1;
	for (int deðer = 1; deðer < arr.length; deðer++) {
		int a=Math.abs(arr[deðer]-arr[deðer-1]);
		if(maks<=a) {
		maks =a;
		}
	}
	return maks;
// burda yaptýðýmýz þey aradaki sayi farký ona göre cevap veriyor bize
	}

	public static void main(String[] args) {
	int[] sayi= {1,2,3,0,3,2,9,4,5,6,7,8,30};
	System.out.println(maksimum(sayi));
	}

}
