
public class içiçedöngüler {

	public static final int N =10;
	public static void main(String[] args) {		

		for(int line=N;line>=1;line--) {
			for(int j=1; j<= (-1*line+N);j++) {
			System.out.print(" ");	
			}
			System.out.print(line);
		
		for(int i=1;i<=2*line-1;i++) {
			System.out.print(" ");
			
		}
	System.out.println(line);	
	}
}
}