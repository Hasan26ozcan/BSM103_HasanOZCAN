package algoritma2;

public class soru2 {

	public static void main(String[] args) {
	double s�ralama[]= {1.2 , 2.3 , 3.4 , 5.6 , 6.4};
	System.out.println(isSorted(s�ralama));
	
	}
	public static boolean isSorted(double[] s�ra) {
		for (int i = 0; i < s�ra.length-1; i++) {
			if(s�ra[i]>s�ra[i+1]) {
				return false;
			}
		}
		return true;
	}

}
