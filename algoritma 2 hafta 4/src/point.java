
public class point {
	// encapsulation yani kaps�lleme olarka diyebiliriz bun getter seter metotlar�yla yapabiliyoruz
	// bizim bilgimizin ba�kas� taraf�ndan eri�ememesini sa�l�yor
     private int x;
     private int y;

     public point(int x,int y) {
    	 setXy(x, y);
    	 // burda this de yapabiliriz ama bizim burda k�s�tlamamz� yani kaps�llememizi kullanmam�z i�in onu sette �a��rmam�z gerekiyor
    // yukardakiylerle ayn� yapabilecek bir �ey daha var oda
    //	 setXy(x, y);
     }
     // burda constracter ne olursaolsun �ekebiliyoruz
     
     public double disTangre() {
    	 return Math.sqrt(x*x+y*y);
     }
     public void translate(int dx,int dy) {
    	 x=dx;
    	 y=dy;
    			 
     }
     public void setXy(int x,int y) {
    	 this.x=x;
    	 this.y=y;
     }
     public int getX(){
    	return x  ;
     }
     public int getY() {
    	 return y;
     }
     public  String toString() {
		return "p1 de�eri i�te burada";
		//i�te buraya gelidk ve p1 yazd���m�zda otomatikmen 
		//p1.toString olarka ekrana yazd�r�yor ama biz bunu pointte de�i�tirdi�imiz i�in
		// bunu ekrana farkl� olarak veriyoruz
    	 
     }
     //public void toString() {
    	// System.out.println("de�er");
    	 // d�n�� t�r� nesneyle uyumlu de�il
    // }
}
