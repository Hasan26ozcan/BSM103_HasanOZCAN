package algoritmas�nav�na�al��ma;

public class kelimemiziyazd�rma {

	public static void main(String[] args) {
	String a="kelimemizi��erlib�lelim";
	int index=0;
	for( int i=0;i<a.length()/3 ;i++) {
		System.out.println(	a.substring(index, index+3));
		index=index+3;
	}
	System.out.println(a.substring(index,a.length()));
	}

}
