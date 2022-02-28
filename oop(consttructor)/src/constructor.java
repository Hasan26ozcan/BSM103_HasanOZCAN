
public class constructor {
	//iþimizi aþýrý derecede fazla kolaylaþtýrýyor
	private String clor;
	private String model;
	private int doors;
	private double engine;
	
	
	
	
	public constructor(String clor,int doors) {
		this.clor=clor;
		this.doors=doors;
		this.engine=0;
		this.model="bilgi yok";
	}
	
	
	public constructor() {
		/*this.clor="bilgi yok";
		this.model ="bilgi yok";
		this.doors =0;
		this.engine=0;*/
		////////////////////bu yukarýdaki ile ayný iþlevi yerine getiriyor saedece satýr olarka daha kýsa//////
		this("bilgi yok","bilgi yok",0,0);
	}
	
	
	
	
	public constructor(String clor,String model,int doors, double engine) {
		this.clor=clor;
		this.engine=engine;
		this.doors=doors;
		this.model=model;
	}
	
	
	public void showinfos() {
		System.out.println("arabanýn rengi: "+this.clor);
		System.out.println("arabanýn kapý sayýsý: "+this.doors);
		System.out.println("arabanýn modeli: "+this.model);
		System.out.println("arabanýn motor hacmi: "+this.engine);
	}
		
	
	
}
