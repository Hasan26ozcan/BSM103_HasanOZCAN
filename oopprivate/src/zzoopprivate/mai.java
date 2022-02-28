package zzoopprivate;

public class mai { 
   public static void main(String[] args) {
	privateclas priv =new privateclas();
	priv.setClor("gümüþ");
	priv.setDoors(5);
	priv.setModel("audi RS7");
	priv.setEngine(1.9);
	
	
	System.out.println("arabanýn motor hacmi: "+priv.getEngine());
	System.out.println("arabanýn modeli: "+priv.getModel());
	System.out.println("arabanýn kapý sayýsý: "+priv.getDoors());
	System.out.println("arabanýn rengi: "+priv.getClor());
	priv.start();
	priv.stop();
}
}
