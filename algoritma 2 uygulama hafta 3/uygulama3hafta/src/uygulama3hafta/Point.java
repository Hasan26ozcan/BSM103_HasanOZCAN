package uygulama3hafta;

public class Point {
	 int x;
	 int y;
	 
	 public double distangeorgine() {
		return Math.sqrt(x*x+y*y); 
	 }
	 public void translate(int dx,int dy) {
		 x=x+dx;
		 y=y+dy;
		 System.out.println(x+","+y);
	 }
}
