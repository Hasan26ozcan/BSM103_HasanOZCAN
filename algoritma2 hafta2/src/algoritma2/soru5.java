package algoritma2;

public class sorube� {

	public static void main(String[] args) {
		writeBinary(14);
		
	}
	public static void writeBinary(int n) {
		int a=0;
		if (n<0) {
			System.out.println("hata");
		}
		if(n >=2) {
			System.out.println("de�er");
			writeBinary(n/2); 
			//en ba�ta buradan ge�iyor en sonr 1 deyken kalan� ekrana yazd�r�yor 
			// sonr a3 e geri d�n�yor un kalan�n� al�yor sonra 7 nin ondan sonra 14 �n kalan�n� ekrana yazd�r�yor
			
		}
		System.out.println("de�er s�ralamas�:  "+ n%2);
		//System.out.print(n%2);
	}

}
