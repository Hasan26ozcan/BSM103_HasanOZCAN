package zzabstractclass;

public class mysqldatabase extends abstarct {

	@Override
	void update() {
	System.out.println("mysql verileri g�ncellemi�tir");	
	}

	@Override
	void get() {
		System.out.println("mysql verileri ald�");
	}

}
