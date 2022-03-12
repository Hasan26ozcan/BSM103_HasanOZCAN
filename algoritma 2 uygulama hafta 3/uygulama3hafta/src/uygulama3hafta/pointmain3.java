package uygulama3hafta;

public class pointmain3 {

	public static void main(String[] args) {
		Point3 pnt3 =new Point3(3, 4);
		System.out.println(pnt3.x+","+pnt3.y);
		pnt3.translate(3, 4);
		System.out.println(pnt3.x+","+pnt3.y);
		System.out.println(pnt3.distangeorgine());
	}

}
