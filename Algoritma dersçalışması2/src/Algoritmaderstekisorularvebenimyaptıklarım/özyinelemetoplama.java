package algoritmasorular�1�dev;

public class �zyinelemetoplama {

	public static void main(String[] args) {
	System.out.println(add(6));
	
	}
	private static double add(int a) {
		
	if(a ==1) {
		return 1;
		
	}
	else {
		return a+ add(a-1);
	}
	}

}
