package algoritma2;

public class soru2 {

	public static void main(String[] args) {
	double sýralama[]= {1.2 , 2.3 , 3.4 , 5.6 , 6.4};
	System.out.println(isSorted(sýralama));
	
	}
	public static boolean isSorted(double[] sýra) {
		for (int i = 0; i < sýra.length-1; i++) {
			if(sýra[i]>sýra[i+1]) {
				return false;
			}
		}
		return true;
	}

}
