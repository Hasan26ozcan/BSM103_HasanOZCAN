
public class encapsulation {
	
	
	private String clor;
	private String model;
	private int doors;
	private double engine;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		if(doors ==2 || doors==4) {
		this.doors = doors;
		}
		else {
		System.out.println("l�tfen d�zg�n bir koltuk say�s� giriniz:  2 ve 4 harici olamaz");
		}
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public String getClor() {
		return clor;
	}
	public void setClor(String clor) {
		this.clor=clor;
	}
	public String clor() {
		return this.clor;
	}
}
