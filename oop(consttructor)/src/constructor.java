
public class constructor {
	//i�imizi a��r� derecede fazla kolayla�t�r�yor
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
		////////////////////bu yukar�daki ile ayn� i�levi yerine getiriyor saedece sat�r olarka daha k�sa//////
		this("bilgi yok","bilgi yok",0,0);
	}
	
	
	
	
	public constructor(String clor,String model,int doors, double engine) {
		this.clor=clor;
		this.engine=engine;
		this.doors=doors;
		this.model=model;
	}
	
	
	public void showinfos() {
		System.out.println("araban�n rengi: "+this.clor);
		System.out.println("araban�n kap� say�s�: "+this.doors);
		System.out.println("araban�n modeli: "+this.model);
		System.out.println("araban�n motor hacmi: "+this.engine);
	}
		
	
	
}
