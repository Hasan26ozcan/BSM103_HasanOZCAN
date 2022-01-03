package algoritmasorularý1ödev;

public class özyinelemetoplama {

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
