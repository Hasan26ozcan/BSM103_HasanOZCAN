package zzabstractclass;

public abstract class abstarct {
	public void add() {
		System.out.println("eklendi");
	}
	public void delete() {
		System.out.println("silindi");
	}
	//bu �steki ikisi k�kl� metot
	//alttakiler ise g�vdesiz metottur
	abstract void update();
	abstract void get();
	
}
