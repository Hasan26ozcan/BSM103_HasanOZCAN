package uygulama3hafta;

public class Point2 {
	 int x;
	 int y;
	 
	 public double distangeorgine() {
		return Math.sqrt(x*x+y*y); 
	 }
	 public void translate(int dx,int dy) {
		 //toplama i�lemini bu �ekilde yapmam�z gerekiyor;
		 x+=dx;
		 y+=dy;
	 }
}
