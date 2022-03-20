
public class pointmain {
public static void main(String[] args) {
	point p1=new point(6,7);
	point p2=new point(3, 4);
	System.out.println(p1.getX());
	p1.setXy(8, 6);
	System.out.println(p2.getX()+","+p2.getY());
	System.out.println("orjine olan uzunluðu: "+p1.disTangre());
	p2.setXy(5, 4);
	System.out.println("orjine olan uzaklýðý: "+p2.getX()+","+p2.getY());
	System.out.println("p1: "+p1);
	//to string böyle bir durumda javanýn otomatikmen çalýþtýrdýðý sistemdir
	point p3=new point(7, 3);
	
	point p4=new point(7, 3);
	
	if(p3.getX() == (p4.getX())) {
		System.out.println("eþittir");
	}
	
}
}
