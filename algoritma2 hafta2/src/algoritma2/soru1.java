package algoritma2;

public class soru1 {

	public static void main(String[] args) {
		int[] arr1= {3,45,56,21,23,3};
	System.out.println(isUnique(arr1));
		
	}
	public static boolean isUnique(int[]de�er) {
		for (int row = 0; row < de�er.length-1; row++) {
			for (int column = row+1; column < de�er.length; column++) {
				if(de�er[row]==de�er[column]) {
					return false;
				}
			}
			
		}
		return true;
	}

}
