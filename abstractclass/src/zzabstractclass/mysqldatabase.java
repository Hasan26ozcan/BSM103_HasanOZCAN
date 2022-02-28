package zzabstractclass;

public class mysqldatabase extends abstarct {

	@Override
	void update() {
	System.out.println("mysql verileri güncellemiþtir");	
	}

	@Override
	void get() {
		System.out.println("mysql verileri aldý");
	}

}
