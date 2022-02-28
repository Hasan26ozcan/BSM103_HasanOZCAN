package zzinterface;

public class Employeee {

	private String isim;
	private String department;
	private int salary;
	public Employeee(String isim, String department, int salary) {
		// eðer super(); gigib birþey varza onu miras yerinde görürüz ve oradan anlamýný daha rahat anlayabiliriz;
		this.isim = isim;
		this.department = department;
		this.salary = salary;
		//nedense bu this olan yere bir ekran çýktýsý verdiðimizde onu baþa atýyor 
		System.out.println("deðer..........");
	}
	public void info() {
		System.out.println("ismi: "+this.isim);
		System.out.println("departmaný: "+this.department);
		System.out.println("maaþý: "+this.salary);
	}
}
