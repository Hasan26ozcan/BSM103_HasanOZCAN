package uygulama3hafta;

public class Pointmain {

	public static void main(String[] args) {
		Point2 pnt2=new Point2();
		pnt2.x=3;
		pnt2.y=4;
		System.out.println(pnt2.distangeorgine());
		pnt2.translate(3, 4);
		System.out.println(pnt2.x+","+pnt2.y);
	}

}
