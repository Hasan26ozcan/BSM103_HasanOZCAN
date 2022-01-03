package algoritmasorularý1ödev;

public class özyinelemebinarysistemdeneme {

	public static void main(String[] args) {
	writebinary(5);
	}	
	private static void writebinary(int n) {
	 if(n<0) {
		 throw new IllegalArgumentException();
	 }
		if(n>=2) {
			writebinary(n/2);
		}
		System.out.println(n%2);
	 
		 
	 
	 
	
	}

}
