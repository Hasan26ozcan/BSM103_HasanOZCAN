package uygulama3hafta;

public class Point2 {
	 int x;
	 int y;
	 
	 public double distangeorgine() {
		return Math.sqrt(x*x+y*y); 
	 }
	 public void translate(int dx,int dy) {
		 //toplama iþlemini bu þekilde yapmamýz gerekiyor;
		 x+=dx;
		 y+=dy;
	 }
}
