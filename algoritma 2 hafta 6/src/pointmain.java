import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class pointmain {
	public static void main(String[] args) {
		//burda hash kullanmalýyýz çünkü biizm burda hashleri kullanmamýz gerekiyor
		// bu yüzden treesetler burada kullanýlamýyor
		Set<Point> points=new HashSet<Point>();
		points.add(new Point(3,4));
		points.add(new Point(5,7));
		points.add(new Point(8,9));
		points.add(new Point(8,9));
		Point p2=new Point(10,12);
		points.add(p2);
		
		
		
		//bu ikisi ayný deðildir çünkü hasleri farklýdýr referanslarý yani
		System.out.println(points);
		
		for(Point eleman:points) {
			System.out.println(eleman.getX()+","+eleman.getY());
		}
		
		
		
	}

}
