package uygulama3hafta;

public class main {
	public static void main(String[] args) {
		Point point1 =new Point();
		point1.x=7;
		point1.y= 24;
		// burada eðer bir deðer girmezsek ise onu 0 olarak veriyor ama normalde bunu bizim yapmamýz gerekiyor
		 Point point2 =new Point();
		 point2.x=19;
		 point2.y =20;
		 
		
		System.out.println("("+point1.x+","+point1.y+")");
		System.out.println(("("+point2.x+","+point2.y+")"));
		double dist= Math.sqrt(point1.x*point1.x+point1.y*point1.y);
		System.out.println("uzunluk :"+dist);
		
		
		double dist2= Math.sqrt(point2.x*point2.x+point2.y*point2.y);
		System.out.println("uzunluk :"+dist2);
		
		point1.x+=10;
		point1.y +=5;
		point2.x +=20;
		point2.y +=3;
		System.out.println("("+point1.x+","+point1.y+")");
		System.out.println(("("+point2.x+","+point2.y+")"));
		
		
	}

}
