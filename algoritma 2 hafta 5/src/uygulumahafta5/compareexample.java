package uygulumahafta5;

public class compareexample {
	public static void main(String[] args) {
		Integer x=10;
		Integer y=42;
		Integer z=10;
		System.out.println(x.compareTo(z));//  0  ��karsa e�ittir;
		System.out.println(y.compareTo(z));//  1  ��karsa soldaki say� sa�daki say�dan daha b�y�k demektir;
		System.out.println(x.compareTo(y));// -1  ��karsa sa�daki say� soldaki say�dan daha b�y�k demektir;
	}

}
