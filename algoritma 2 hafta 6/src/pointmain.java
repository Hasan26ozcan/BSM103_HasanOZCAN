import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class pointmain {
	public static void main(String[] args) {
		//burda hash kullanmal�y�z ��nk� biizm burda hashleri kullanmam�z gerekiyor
		// bu y�zden treesetler burada kullan�lam�yor
		Set<Point> points=new HashSet<Point>();
		points.add(new Point(3,4));
		points.add(new Point(5,7));
		points.add(new Point(8,9));
		points.add(new Point(8,9));
		Point p2=new Point(10,12);
		points.add(p2);
		
		
		
		//bu ikisi ayn� de�ildir ��nk� hasleri farkl�d�r referanslar� yani
		System.out.println(points);
		
		for(Point eleman:points) {
			System.out.println(eleman.getX()+","+eleman.getY());
		}
		
		
		
	}

}
