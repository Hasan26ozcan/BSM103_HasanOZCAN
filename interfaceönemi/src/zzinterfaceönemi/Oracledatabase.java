package zzinterfaceönemi;

public class Oracledatabase implements IDatabase {

	@Override
	public void add() {
		System.out.println("oracle ekleniyor");
	}

	@Override
	public void delete() {
		System.out.println("oracle siliniyor");
	}

	@Override
	public void get() {
		System.out.println("oracle elde ediliyor");
		
	}

	@Override
	public void update() {
		System.out.println("oracle güncelleniyor");
		
	}

}
