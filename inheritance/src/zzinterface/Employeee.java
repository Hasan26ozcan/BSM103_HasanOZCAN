package zzinterface;

public class Employeee {

	private String isim;
	private String department;
	private int salary;
	public Employeee(String isim, String department, int salary) {
		// e�er super(); gigib bir�ey varza onu miras yerinde g�r�r�z ve oradan anlam�n� daha rahat anlayabiliriz;
		this.isim = isim;
		this.department = department;
		this.salary = salary;
		//nedense bu this olan yere bir ekran ��kt�s� verdi�imizde onu ba�a at�yor 
		System.out.println("de�er..........");
	}
	public void info() {
		System.out.println("ismi: "+this.isim);
		System.out.println("departman�: "+this.department);
		System.out.println("maa��: "+this.salary);
	}
}
