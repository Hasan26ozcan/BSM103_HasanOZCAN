package zzabstractclass;

public class Mongodatabase extends abstarct {

	@Override
	void update() {
		System.out.println("mongo verileri güncelledi");
	}

	@Override
	void get() {
		System.out.println("mongo verileri aldý");
	}

}
