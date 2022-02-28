package zzinterfaceönemi;
public class Mongodatabase implements IDatabase {

	@Override
	public void add() {
		System.out.println("mongo eklendi");
	}

	@Override
	public void delete() {
		System.out.println("mongo silindi");
	}

	@Override
	public void get() {
		System.out.println("mongo elede edildi");
	}

	@Override
	public void update() {
		System.out.println("mongo güncellendi");
	}

}
