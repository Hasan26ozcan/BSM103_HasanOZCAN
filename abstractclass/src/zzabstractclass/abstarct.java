package zzabstractclass;

public abstract class abstarct {
	public void add() {
		System.out.println("eklendi");
	}
	public void delete() {
		System.out.println("silindi");
	}
	//bu üsteki ikisi köklü metot
	//alttakiler ise gövdesiz metottur
	abstract void update();
	abstract void get();
	
}
