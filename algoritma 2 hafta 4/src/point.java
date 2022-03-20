
public class point {
	// encapsulation yani kapsülleme olarka diyebiliriz bun getter seter metotlarýyla yapabiliyoruz
	// bizim bilgimizin baþkasý tarafýndan eriþememesini saðlýyor
     private int x;
     private int y;

     public point(int x,int y) {
    	 setXy(x, y);
    	 // burda this de yapabiliriz ama bizim burda kýsýtlamamzý yani kapsüllememizi kullanmamýz için onu sette çaðýrmamýz gerekiyor
    // yukardakiylerle ayný yapabilecek bir þey daha var oda
    //	 setXy(x, y);
     }
     // burda constracter ne olursaolsun çekebiliyoruz
     
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
		return "p1 deðeri iþte burada";
		//iþte buraya gelidk ve p1 yazdýðýmýzda otomatikmen 
		//p1.toString olarka ekrana yazdýrýyor ama biz bunu pointte deðiþtirdiðimiz için
		// bunu ekrana farklý olarak veriyoruz
    	 
     }
     //public void toString() {
    	// System.out.println("deðer");
    	 // dönüþ türü nesneyle uyumlu deðil
    // }
}
