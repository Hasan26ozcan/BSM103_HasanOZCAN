package zzoopprivate;

public class mai { 
   public static void main(String[] args) {
	privateclas priv =new privateclas();
	priv.setClor("g�m��");
	priv.setDoors(5);
	priv.setModel("audi RS7");
	priv.setEngine(1.9);
	
	
	System.out.println("araban�n motor hacmi: "+priv.getEngine());
	System.out.println("araban�n modeli: "+priv.getModel());
	System.out.println("araban�n kap� say�s�: "+priv.getDoors());
	System.out.println("araban�n rengi: "+priv.getClor());
	priv.start();
	priv.stop();
}
}
