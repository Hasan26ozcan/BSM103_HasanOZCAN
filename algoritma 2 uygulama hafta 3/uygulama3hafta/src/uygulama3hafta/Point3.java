package uygulama3hafta;

public class Point3 {
	 int x;
	 int y;
	 
	 public Point3(int x,int y){
		 this.x=x;
		 this.y=y;
	 }
	 
	 
	 public double distangeorgine() {
		return Math.sqrt(x*x+y*y); 
	 }
	 public void translate(int dx,int dy) {
		 //toplama i�lemini bu �ekilde yapmam�z gerekiyor;
		 x+=dx;
		 y+=dy;
	 }
}
