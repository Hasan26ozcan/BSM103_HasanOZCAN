package algoritmasorular�1�dev;

public class hatal�olan�rnekthrow {

	public static void main(String[] args) {
	System.out.println(sumto(2));
	}
	
	
	private static double sumto(int n) {
		if(n<0) {
			throw new IllegalArgumentException();
		}
		else if(n==0) {
			return 0.0;
		}
		else {
			return 1.0/n+sumto(n-1);
			
		}
		
	}
	/*n=2
	 *return            1.0/2 +sumto(n-1)
	 *n=1
	 *                                          return1.0/1+sum(0)
	 * n=0                           return 0.0
	 * 
	 *              
	 *              
	 *              
	 *              en alttan i�iliyor ve yukar�ya do�ru geliyor
	 */
	
	
}
// �z yinelemi fonksiyonlar
