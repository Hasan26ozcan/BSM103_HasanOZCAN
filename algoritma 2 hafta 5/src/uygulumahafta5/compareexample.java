package uygulumahafta5;

public class compareexample {
	public static void main(String[] args) {
		Integer x=10;
		Integer y=42;
		Integer z=10;
		System.out.println(x.compareTo(z));//  0  çıkarsa eşittir;
		System.out.println(y.compareTo(z));//  1  çıkarsa soldaki sayı sağdaki sayıdan daha büyük demektir;
		System.out.println(x.compareTo(y));// -1  çıkarsa sağdaki sayı soldaki sayıdan daha büyük demektir;
	}

}
