package zzabstractclass;

public class Mongodatabase extends abstarct {

	@Override
	void update() {
		System.out.println("mongo verileri g�ncelledi");
	}

	@Override
	void get() {
		System.out.println("mongo verileri ald�");
	}

}
