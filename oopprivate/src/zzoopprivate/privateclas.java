package zzoopprivate;

import java.io.ObjectInputStream.GetField;

public class privateclas {
	
	private String clor;
	private String model;
	private double engine;
	private int doors;
	
	public void setClor(String clor) {
		this.clor=clor;
	}
	public String clor() {
		return clor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public String getClor() {
		return clor;
	}
	public void start() {
		System.out.println("araba çalýþtý");
	}
	public void  stop() {
		System.out.println("araba durdu");
	}
}
